package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//login to the aplication from the-internet.herokuapp.com
public class HomePage {
    // fields that represent elements and methods to interact with those elements
    // pass the webdriver that allows to interact with browser
    private WebDriver driver;
    private By formAuthLink = By.linkText("Form Authentication");

    //constructor that pass the driver
    public HomePage(WebDriver driver) {
        this.driver= driver;
    }

    //method that finds and click the link that is declared above
    //returns a login page since we are redirected
    public LoginPage clickFormAuth(){
        driver.findElement(formAuthLink).click();
        return new LoginPage(driver);//sends the open browser
    }

}
