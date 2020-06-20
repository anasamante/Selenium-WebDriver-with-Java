package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTest {

    @Test
    public void testAcceptAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickTriggerAlert();
        alertsPage.alert_accept();
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert", "The alert wasnt clicked");
    }

    @Test
    public void testDismissConfirmAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickTriggerConfirm();
        alertsPage.alert_dismiss();
        assertEquals(alertsPage.getResult(), "You clicked: Cancel", "dismiss option wasnt clicked");
    }

    @Test
    public void testInputOnPrompt() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickTriggerPrompt();
        String text = "I'm typing on the prompt input";
        alertsPage.alert_input(text);
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Incorrect text");
    }

}
