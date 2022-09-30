package co.com.doublev.stepdefinitions;


import co.com.doublev.questions.CompareMonth;
import co.com.doublev.tasks.BookingFlight;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class BookingStepDefinitions {
    @Managed
    WebDriver driver;
    @Before
public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Actor");
    }
    @Given("the user enter the page")
    public void theUserEnterThePage() {
    OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.wingo.com/"));
    }

    @When("the user complete the fields to fly")
    public void theUserCompleteTheFieldsToFly() {
        OnStage.theActorInTheSpotlight().wasAbleTo(BookingFlight.bookingFlight());

    }

    @Then("the user validates if the return ticket is from another month")
    public void theUserValidatesIfTheReturnTicketIsFromAnotherMonth() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareMonth.compareMonth(), Matchers.is(true)));

    }
}
