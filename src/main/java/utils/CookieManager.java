package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class CookieManager {
    private WebDriver driver;

    public CookieManager(WebDriver driver){
        this.driver = driver;
    }

    public void deleteCookie(String string){
        var cookie = driver.manage().getCookieNamed(string);
        driver.manage().deleteCookie(cookie);
    }

    private void setCookie(String name, String value){
        Cookie cookie = new Cookie.Builder(name, value)
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }

    public Map<String, Cookie> getRemainingCookiesMap(){
        var remainingCookies = driver.manage().getCookies();

        Map<String, Cookie> cookieMap = new HashMap<>();
        for (Cookie cookie : remainingCookies) {
            cookieMap.put(cookie.getName(), cookie);
        }

        return cookieMap;
    }

    public boolean isCookiePresent(String cookieName){
        return driver.manage().getCookieNamed(cookieName) != null;

    }
}
