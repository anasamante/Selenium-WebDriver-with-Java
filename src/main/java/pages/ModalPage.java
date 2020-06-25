package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ModalPage {

    private WebDriver driver;

    private By closeBtn = By.xpath("//div[@class='modal-footer']/p[text()='Close']");
    private By modal = By.cssSelector(".modal .modal-title");


    public ModalPage(WebDriver driver) {
        this.driver = driver;
    }

    public void modal_clickCloseBtn() {
        //add wait times
        driver.findElement(closeBtn).click();
    }

    public boolean isModalHidden() {
        return !(driver.findElement(modal).isDisplayed());
    }
}
