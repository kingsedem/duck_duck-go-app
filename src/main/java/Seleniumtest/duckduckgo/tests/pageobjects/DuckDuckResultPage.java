package Seleniumtest.duckduckgo.tests.pageobjects;

import net.thucydides.core.pages.PageObject;

import java.util.List;
import java.util.stream.Collectors;

public class DuckDuckResultPage extends PageObject {

    public static final String RESULT_TITLE = ".wLL07_0Xnd1QZpzpfR4W";

    public List<String> getDisplayedResults() {
        return findAll(RESULT_TITLE)
                .stream()
                .map(element -> element.getAttribute("textContent"))
                .collect(Collectors.toList());
    }
}
