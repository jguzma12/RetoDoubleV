package co.com.doublev.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\booking.feature",
glue = "co.com.doublev.stepdefinitions",
snippets = CucumberOptions.SnippetType.CAMELCASE)

public class BookingRunners {
}
