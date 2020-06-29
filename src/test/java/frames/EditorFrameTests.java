package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EditorFrameTests extends BaseTest {

    @Test
    public void testEditorFrame(){
        var iFramePage = homePage.clickWYSIWYGEditor();
        iFramePage.clearTextArea();

        String text1 = "hello ";
        String text2 = "world";

        iFramePage.setTextArea(text1);
        iFramePage.clickIncreaseIndentBtn();
        iFramePage.setTextArea(text2);
        assertEquals(iFramePage.getTextFromEditor(),text1 + text2, "Incorrect text on editor");

    }
}
