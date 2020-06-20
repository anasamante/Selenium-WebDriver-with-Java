package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeysPage;

import static org.testng.Assert.assertEquals;

public class KeysTest extends BaseTest {

    @Test
    public void testBackspace() {
        KeysPage keysPage = homePage.clickKeyPage();
        keysPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keysPage.getResult(), "You entered: A", "Incorrect key");
    }
}
