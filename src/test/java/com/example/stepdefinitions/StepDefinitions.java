package com.example.stepdefinitions;

import com.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.safari.SafariDriver;

public class StepDefinitions {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }

    @Given("Open the URL {string}")
    public void open_the_url(String url) {
        driver.get(url);
        System.out.println("URL abierta: " + url);
    }

    @Given("Enter the browser {string}")
    public void enter_the_browser(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            driver = new SafariDriver();
        } else {
            throw new IllegalArgumentException("Navegador no soportado: " + browser);
        }
    }

    @Given("I have opened the Google homepage in Opera")
    public void i_have_opened_the_google_homepage_in_opera() {
        // Set the path to the operadriver executable
        System.setProperty("webdriver.opera.driver", "/usr/local/bin/operadriver");
        OperaOptions options = new OperaOptions();
        options.setBinary("/Applications/Opera.app/Contents/MacOS/Opera"); // Ruta al ejecutable de Opera
        driver = new OperaDriver(options);
        driver.get("https://www.google.com");
    }

    @Given("I have opened the Google homepage in Safari")
    public void i_have_opened_the_google_homepage_in_safari() {
        // Inicializar el controlador de Safari
        driver = new SafariDriver();
        driver.get("https://www.google.com");
    }



    @When("I search for {string}")
    public void i_search_for(String query) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(query);
        searchBox.submit();
    }

    @Then("I should see the search results")
    public void i_should_see_the_search_results() {
        // You can add assertions here to verify the search results
        // For simplicity, we'll just wait for a few seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("I close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }
}