package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack() {
        navigate.back();
    }

    public void goForward() {
        navigate.forward();
    }

    public void refresh() {
        navigate.refresh();
    }

    public void goToURL(String url) {
        navigate.to(url);
    }

    public void switchToTab(String tabTitle) {
        var windows = driver.getWindowHandles();

        System.out.println("number of windows: " + windows.size());

        for (String window : windows) {
            driver.switchTo().window(window);
            System.out.println("window title: " + driver.getTitle());

            if (tabTitle.equals(driver.getTitle())) {
                break;
            }
        }
    }

    public void switchToNewTab() {
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);

    }
}
