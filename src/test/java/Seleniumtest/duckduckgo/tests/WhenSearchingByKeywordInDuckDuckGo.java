package Seleniumtest.duckduckgo.tests;


import Seleniumtest.duckduckgo.tests.steps.DuckDuckGoSearcher;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.Test;
import net.serenitybdd.annotations.Steps;


import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenSearchingByKeywordInDuckDuckGo {


    @Steps
    DuckDuckGoSearcher jack;
    @Test
    public void should_see_relevant_search_results(){
        jack.searches_by_keyword_for("Cucumber Recipes");
        jack.should_only_see_results_containing("Cucumber");
    }
}
