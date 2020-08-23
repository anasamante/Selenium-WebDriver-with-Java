package cookies;

import base.BaseTest;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import utils.CookieManager;

import static org.testng.Assert.assertFalse;


public class CookiesTests extends BaseTest {

    @Test
    public void testDeleteCookie() {
        var cookieManager = getCookieManager();
        var cookieToDelete = ("optimizelyBuckets");
        cookieManager.deleteCookie(cookieToDelete);
        assertFalse(cookieManager.isCookiePresent(cookieToDelete));
    }

}
