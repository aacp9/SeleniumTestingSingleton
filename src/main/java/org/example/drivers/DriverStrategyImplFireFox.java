package org.example.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverStrategyImplFireFox implements DriverStrategy{

    @Override
    public WebDriver setStrategy() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
        WebDriver driver=new FirefoxDriver();
        return driver;
    }
}
