package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {
    private WebDriver driver;

    private String topFrameName = "frame-top";
    private String leftFrameName = "frame-left";
    private String bottomFrameName = "frame-bottom";

    private By body = By.tagName("body");


    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String leftFrame(){
        driver.switchTo().frame(topFrameName);
        driver.switchTo().frame(leftFrameName);
        String text = getTextFromFrame();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String bottomFrame(){
        driver.switchTo().frame(bottomFrameName);
        String text = getTextFromFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getTextFromFrame(){
        return driver.findElement(body).getText();
    }

    
}
