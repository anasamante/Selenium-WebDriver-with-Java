package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload() {
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("C:\\Users\\anasa\\webdriver_java\\resources\\chromedriver.exe");
        assertEquals(fileUploadPage.getUploadedFileText(), "chromedriver.exe", "incorrect file uploaded");
    }
}
