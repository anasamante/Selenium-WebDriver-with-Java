package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ModalTest extends BaseTest {
    @Test
    public void testCloseModal(){
        var modalPage = homePage.clickEntryAd();
        modalPage.modal_clickCloseBtn();
        assertTrue(modalPage.isModalHidden(), "Modal is hidden");
    }
}
