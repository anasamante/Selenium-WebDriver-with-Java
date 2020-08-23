package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String editorFrame = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentBtn = By.cssSelector("#mceu_12 button");


    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToEditArea() {
        driver.switchTo().frame(editorFrame);
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public void clearTextArea() {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text) {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void clickIncreaseIndentBtn() {
        driver.findElement(increaseIndentBtn).click();
    }

    public String getTextFromEditor() {
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
}
