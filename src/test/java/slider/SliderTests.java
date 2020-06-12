package slider;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTest {

    @Test
    public void testSlider(){
        String value = "1.5";
        var horizontalSliderPage = homePage.clickSlider();
        horizontalSliderPage.focusMoveSlider(value);
        assertEquals(horizontalSliderPage.getRange(), value, "ranges don't match");

    }
}
