package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.List;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        // setting property to use a webdriver form chrome browser, and location for chromedriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //webdriver is an interface and we are instantiating the chrome driver implementation
        driver = new ChromeDriver();
        goHome();

        // launch the browser
        driver.get("https://the-internet.herokuapp.com/");

        //maximize the window
        driver.manage().window().maximize();

        homePage = new HomePage(driver);

    }

    @BeforeMethod
    public void goHome(){
        // launch the browser
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown() {
        //closes the window and the session
        driver.quit();
    }

}
