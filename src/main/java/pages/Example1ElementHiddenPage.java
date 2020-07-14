package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example1ElementHiddenPage {

    private WebDriver driver;
    private By startBtn = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");

    public Example1ElementHiddenPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartBtn(){
        driver.findElement(startBtn).click();
        //explicit wait. this is only for this specific method
        WebDriverWait wait = new WebDriverWait(driver, 5);
        //wait for some condition to be met before proceeding.
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }




}
