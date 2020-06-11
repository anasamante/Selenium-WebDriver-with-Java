package forgotpassword;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPassPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void testRetrievePassword(){
        ForgotPassPage forgotPassPage = homePage.clickForgotPass();
        forgotPassPage.setEmail("tau@example.com");
        EmailSentPage emailSentPage = forgotPassPage.clickRetrievePassBtn();
        assertTrue(emailSentPage.getAlertText().contains("Your e-mail's been sent!"), "Unable to retrieve password");
    }
}
