package co.com.doublev.manualtests.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\lowprices.feature",
        glue = "co.com.doublev.manualtests.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LowPrices {
}
