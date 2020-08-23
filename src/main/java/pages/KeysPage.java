package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeysPage {

    private WebDriver driver;
    private By input = By.id("target");
    private By result = By.id("result");

    public KeysPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String keys) {
        driver.findElement(input).sendKeys(keys);

    }

    public String getResult() {
        return driver.findElement(result).getText();
    }
}
