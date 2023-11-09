package Seleniumtest.duckduckgo.tests.pageobjects;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://duckduckgo.com/")
public class DuckDuckGoSearchPage extends PageObject {

    @FindBy(id = "searchbox_input")
    WebElementFacade searchField;

    @FindBy(id = "searchbox_searchButton__F5Bwq iconButton_button__6x_9C")
    WebElementFacade searchButton;

    public void searchForKeyWords(String keyword) {
        searchField.type(keyword);
    }

    public void submitSearch() {
        searchButton.click();
    }
}
