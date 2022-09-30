package co.com.doublev.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.doublev.userinterfaces.MainPage.*;

public class BookingFlight implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INP_ORIGEN),
                Click.on(INP_ORIGENCITY),
                Click.on(INP_ARRRIVE),
                WaitUntil.the(INP_ARRIVEDAY, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(INP_DEPARTUREDAY),
                Click.on(BTN_NEXTMONTH),
                Click.on(INP_ARRIVEDAY),
                Click.on(BTN_PASSENGERS),
                Click.on(BTN_PLUSPASSENGERS)
        );

        actor.remember("StartDay",TXT_DEPARTUREDAY.resolveFor(actor).getText());
        actor.remember("EndDay",TXT_ARRIVEDAY.resolveFor(actor).getText());




    }

    public static BookingFlight bookingFlight() {
        return Tasks.instrumented(BookingFlight.class);
    }
}
