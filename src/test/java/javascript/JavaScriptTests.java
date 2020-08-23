package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTest {
    @Test
    public void testScrollToTable() {
        homePage.clickLargeDeepDOMPage().scrollToTable();
    }

    @Test
    public void testScrollToParagraph() {
        homePage.clickInfiniteScrollPage().scrollToParagraph(5);
    }

    @Test
    public void testDropdownMultipleSelect() {
        var dropdownPage = homePage.clickDropdown();
        dropdownPage.setDropdownToMultiple();
        List<String> optionsToSelect = Arrays.asList("Option 1", "Option 2");
        optionsToSelect.forEach(dropdownPage::selectFromDropdown);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        assertTrue(selectedOptions.equals(optionsToSelect), "Incorrect option selected");

    }
}
