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
import utils.WindowManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        // setting property to use a webdriver form chrome browser, and location for chromedriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //webdriver is an interface and we are instantiating the chrome driver implementation
        driver = new ChromeDriver();
        //any time WebDriver needs to interact with an element,
        //  it should poll the website for up to 3 seconds until it finds that element
        // If time's up and element was not found, it will throw a NoSuchElementException.
        // This is at a project level, this will impact all interactions
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

}
