package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1ElementHiddenPage clickExample1ElementHiddenLink(){
        clickLink("Example 1: Element on page that is hidden");
        return new Example1ElementHiddenPage(driver);

    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }


}
