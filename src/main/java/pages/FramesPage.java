package pages;

import org.openqa.selenium.WebDriver;

public class FramesPage extends HomePage{

    private WebDriver driver;

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }


    public NestedFramesPage clickNestedFramesLink(){
       clickLink("Nested Frames");
       return new NestedFramesPage(driver);

    }

}
