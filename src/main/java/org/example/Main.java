package org.example;

import org.example.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        DriverSingleton driverSingleton =DriverSingleton.getInstance();

        WebDriver driver =driverSingleton.getDriver();

        //obtiene una url, navega al sitio
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");

        //BUSCAR TEXTO
        WebElement searchBox= driver.findElement(By.cssSelector("#searchInput"));
        String busqueda="gatos";
        //sendKeys es un metodo para enviar texto
        searchBox.sendKeys(busqueda);

        //Hacer clic en el rectangulo
        WebElement buttonSearch=driver.findElement(By.cssSelector("#searchform > div > button"));
        buttonSearch.click();

        //cerrar conexion
        driverSingleton.closeDriver();



    }
}