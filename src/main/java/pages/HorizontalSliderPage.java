package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.cssSelector("input[type='range']");
    private By range = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }


    public void focusMoveSlider(String rangeValue) {
        while (!getRange().equals(rangeValue)) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }

    }


    public String getRange() {
        return driver.findElement(range).getText();
    }
}

