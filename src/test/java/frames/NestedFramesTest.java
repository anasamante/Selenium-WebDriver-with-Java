package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTest extends BaseTest {

    @Test
    public void testNestedFrames() {
        var framesPage = homePage.clickFramesPage();

        var nestedFramesPage = framesPage.clickNestedFramesLink();
        assertEquals(nestedFramesPage.leftFrame(), "LEFT", "Incorrect text");
        assertEquals(nestedFramesPage.bottomFrame(), "BOTTOM", "Incorrect text");
    }
}
