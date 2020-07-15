package waits;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest {

    @Test
    public void testWaitUntilHidden (){
        var dynamicLoadingPage = homePage.clickDynamicLoadingPage().clickExample1ElementHiddenLink();
        dynamicLoadingPage.clickStartBtn();
        assertEquals(dynamicLoadingPage.getLoadedText(),"Hello World!", "Incorrect loaded text");
    }

    @Test
    public void testWaitUntilVisible(){
        var dynamicLoadingPage = homePage.clickDynamicLoadingPage().clickExample2ElementRenderedLink();
        dynamicLoadingPage.clickStartBtn();
        assertEquals(dynamicLoadingPage.getLoadedText(),"Hello World!", "Incorrect loaded text");

    }
}
