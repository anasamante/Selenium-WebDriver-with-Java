package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassPage {

    private WebDriver driver;
    private By emailInput =  By.id("email");
    private By retrievePassBtn = By.cssSelector("#forgot_password button");


    public ForgotPassPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailInput).sendKeys(email);
    }

    public EmailSentPage clickRetrievePassBtn(){
        driver.findElement(retrievePassBtn).click();
        return new EmailSentPage(driver);
    }
}
