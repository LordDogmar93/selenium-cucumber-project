package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class ElementsPage {

    private WebDriver driver;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectMenu(String section) throws InterruptedException {
        WebElement menuButton = driver.findElement(By.xpath("//h5[normalize-space()='" + section + "']"));
        Assert.assertNotNull("El botón del menú no fue encontrado.", menuButton);
        menuButton.click();
    }
}