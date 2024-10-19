package org.example.drivers;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {
    private static DriverSingleton instance =null;

    private static  WebDriver driver;

    //constructor especial
    private DriverSingleton(){
        //instansear la estrategia definimos con que browser hacer las prubas
        //opciones: Chrome o Firefox
        instantiate("Firefox");
        //instantiate("Chrome");
    }

    public WebDriver instantiate (String browser) {
        DriverStrategy driver=DriverStrategySelector.chooseStrategy(browser);
        this.driver= driver.setStrategy();
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();
        return this.driver;
    }
    //llamamos a la clase por primera vez
    //constructor privado, esto es lo que lo hace singleton
    //lo que hace esque si existe retorna el mismo y si NO existe crea uno nuevo
    public static DriverSingleton getInstance(){
        if (instance==null){
            instance=new DriverSingleton();
        }
        return instance;
    }

    //cerrar la isntancia de driver
    public static void closeDriver(){
        instance =null;
        driver.close();
        driver.quit();
    }
    //getter
    public static WebDriver getDriver() {
        return driver;
    }
}
