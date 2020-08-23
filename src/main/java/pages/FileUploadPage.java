package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadBtn = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String fileAbsolutePath) {
        driver.findElement(inputField).sendKeys(fileAbsolutePath);
        clickUploadBtn();
    }

    public void clickUploadBtn() {
        driver.findElement(uploadBtn).click();
    }

    public String getUploadedFileText() {
        return driver.findElement(uploadedFile).getText();
    }

}
