package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerJSAlert = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerJSConfirm = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerJSPrompt = By.xpath(".//button[text()='Click for JS Prompt']");
    private By result = By.id("result");


    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTriggerAlert(){
        driver.findElement(triggerJSAlert).click();
    }

    public void clickTriggerConfirm(){
        driver.findElement(triggerJSConfirm).click();
    }

    public void clickTriggerPrompt(){
        driver.findElement(triggerJSPrompt).click();
    }

    public void alert_accept(){
        driver.switchTo().alert().accept();
    }

    public void alert_dismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void alert_input(String text){
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
    }

    public String getResult(){
       return driver.findElement(result).getText();
    }

}
