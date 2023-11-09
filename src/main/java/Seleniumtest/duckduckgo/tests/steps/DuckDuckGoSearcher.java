package Seleniumtest.duckduckgo.tests.steps;

import Seleniumtest.duckduckgo.tests.pageobjects.DuckDuckGoSearchPage;
import Seleniumtest.duckduckgo.tests.pageobjects.DuckDuckResultPage;
import net.serenitybdd.annotations.Step;
import org.hamcrest.Matchers;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.everyItem;

public class DuckDuckGoSearcher {

     DuckDuckGoSearchPage searchPage;
     DuckDuckResultPage resultPage;
    @Step
    public void searches_by_keyword_for(String keyword) {
       searchPage.searchForKeyWords(keyword);
       searchPage.submitSearch();
    }

    @Step
    public void should_only_see_results_containing(String expectedTerms) {

        List<String> results = resultPage.getDisplayedResults();
        assertThat(results, everyItem(containsString(expectedTerms)));


    }
}
