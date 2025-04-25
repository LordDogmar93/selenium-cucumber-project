package com.example.stepdefinitions;

import com.utils.DriverManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import page.ElementsPage;


public class StepDefinitionsElements {

    WebDriver driver = DriverManager.getDriver();
    ElementsPage elementsPage = new ElementsPage(driver);

    @And("Select the {string} section in the Website")
    public void selectTheSectionInTheWebsite(String section) throws InterruptedException {
        elementsPage.selectMenu(section);

    }
}