package slider;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTest {

    @Test
    public void testSlider(){
        String value = "4";
        var horizontalSliderPage = homePage.clickSlider();
        horizontalSliderPage.focusMoveSlider(value);
        assertEquals(horizontalSliderPage.getRange(), value, "ranges don't match");

    }
}
