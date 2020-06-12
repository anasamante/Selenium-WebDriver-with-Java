package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//login to the application from the-internet.herokuapp.com
public class HomePage {
    // fields that represent elements and methods to interact with those elements
    // pass the webdriver that allows to interact with browser
    private WebDriver driver;

    //constructor that pass the driver
    public HomePage(WebDriver driver) {
        this.driver= driver;
    }

    //method that finds and click the link that is declared above
    //returns a login page since we are redirected
    public LoginPage clickFormAuth(){
        clickLink("Form Authentication");
        return new LoginPage(driver);//sends the open browser
    }

    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPassPage clickForgotPass(){
        clickLink("Forgot Password");
        return new ForgotPassPage(driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public HorizontalSliderPage clickSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);

    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
