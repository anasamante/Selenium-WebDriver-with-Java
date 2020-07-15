package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example2ElementRenderedPage {

    private WebDriver driver;
    private By startBtn = By.cssSelector("#start button");
    private By loadedText = By.cssSelector("div #finish");

    public Example2ElementRenderedPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartBtn(){
        driver.findElement(startBtn).click();
        //explicit wait. this is only for this specific method
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait for some condition to be met before proceeding.
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
    }

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }




}
