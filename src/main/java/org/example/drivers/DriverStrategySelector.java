package org.example.drivers;

public class DriverStrategySelector {
//esta función devuelve un tipo de clase DriverStrategy y como Chrome
    //como firefox implepentan de ellas no tienen problema.
    public static DriverStrategy chooseStrategy(String browser){
        switch (browser){
            case "Chrome":
                return new DriverStrategyImplChrome();
            case "Firefox":
                return new DriverStrategyImplFireFox();
            default:
                return null;
        }
    }
}
