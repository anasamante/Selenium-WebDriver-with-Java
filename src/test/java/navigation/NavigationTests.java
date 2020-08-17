package navigation;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Example2ElementRenderedPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTest {

    @Test
    public void TestNavigation(){
        homePage.clickDynamicLoadingPage().clickExample1ElementHiddenLink();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goToURL("https://www.google.com");
    }

    @Test
    public void SwitchToTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void OpenAndSwitchToTab(){
        var newTab = homePage.clickDynamicLoadingPage().openInNewTab();
        getWindowManager().switchToNewTab();
        assertTrue(newTab.isStartButtonDisplayed(), "Start button is not displayed");
    }
}
