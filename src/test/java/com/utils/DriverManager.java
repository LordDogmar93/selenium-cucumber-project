package com.utils;

import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {

    private static org.openqa.selenium.WebDriver driver;

    private DriverManager() {
    }

    public static org.openqa.selenium.WebDriver getDriver() {
        if (driver == null) {
            System.out.println("Iniciando el navegador...");
            driver = new SafariDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            System.out.println("Cerrando el navegador...");
            driver.quit();
            driver = null;
        }
    }
}
