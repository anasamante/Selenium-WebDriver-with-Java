package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testContextMenu() {
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickSpot();
        String alert_message = contextMenuPage.alert_getText();
        contextMenuPage.alert_closeAlert();
        assertEquals(alert_message, "You selected a context menu", "Incorrect alert message");
    }
}
