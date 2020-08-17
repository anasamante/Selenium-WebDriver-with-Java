package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private WebDriver driver;


    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1ElementHiddenPage clickExample1ElementHiddenLink(){
        clickLink("Example 1: Element on page that is hidden");
        return new Example1ElementHiddenPage(driver);

    }

    public Example2ElementRenderedPage clickExample2ElementRenderedLink(){
        clickLink("Example 2: Element rendered after the fact");
        return new Example2ElementRenderedPage(driver);

    }

    public Example2ElementRenderedPage openInNewTab(){
        WebElement secondLink = driver.findElement(By.xpath("//div/a[2]"));
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL).click(secondLink).perform();
        return new Example2ElementRenderedPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }


}
