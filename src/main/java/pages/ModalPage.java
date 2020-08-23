package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalPage {

    private WebDriver driver;

    private By closeBtn = By.xpath("//div[@class='modal-footer']/p[text()='Close']");
    private By modal = By.cssSelector(".modal .modal-title");

    public ModalPage(WebDriver driver) {
        this.driver = driver;
    }

    public void modal_clickCloseBtn() {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.elementToBeClickable(closeBtn));
        driver.findElement(closeBtn).click();
    }

    public boolean isModalHidden() {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(modal));
        return !(driver.findElement(modal).isDisplayed());
    }
}
