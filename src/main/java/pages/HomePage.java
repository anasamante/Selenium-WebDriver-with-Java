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

    public KeysPage clickKeyPage(){
        clickLink("Key Presses");
        return new KeysPage(driver);

    }

    public HorizontalSliderPage clickSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);

    }

    public AlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ModalPage clickEntryAd(){
        clickLink("Entry Ad");
        return new ModalPage(driver);
    }

    public ContextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WYSIWYGEditorPage clickWYSIWYGEditor(){
        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }

    public FramesPage clickFramesPage(){
        clickLink("Frames");
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingPage(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeDeepDOMPage clickLargeDeepDOMPage(){
        clickLink("Large & Deep DOM");
        return new LargeDeepDOMPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScrollPage(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }


    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
