package co.com.doublev.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static Target INP_ORIGEN = Target.the("Origen input").
            located(By.xpath("//*[@class='info-airport info-airport-origen']"));

    public static Target INP_ORIGENCITY = Target.the("Origen City").
            located(By.xpath("//*[@id='comboOrigen']/li[4]"));

    public static Target INP_ARRRIVE = Target.the("Arrive city").
            located(By.xpath("//*[@id='comboDestino']/li[3]"));

    public static Target INP_DEPARTUREDAY = Target.the("Departure day").
            located(By.xpath("(//*[@class='day toMonth  valid '])[2]"));

    public static Target INP_ARRIVEDAY = Target.the("Arrive day").
            located(By.xpath("//*[@id='date-window-container']/div/div/div/div/table[2]/tbody/tr[1]/td[4]/div"));

    public static Target BTN_NEXTMONTH = Target.the("Next month").
            located(By.xpath("(//*[@class='next'])[2]"));

    public static Target BTN_PASSENGERS = Target.the("Button passengers").
            located(By.xpath("(//*[@class='icon-chev'])[1]"));

    public static Target BTN_PLUSPASSENGERS = Target.the("Plus passengers").
            located(By.xpath("(//*[@class='plus'])[1]"));

    public static Target TXT_DEPARTUREDAY = Target.the("Text departure day").
            located(By.xpath("//*[@class='info-select info-select-start']"));

    public static Target TXT_ARRIVEDAY = Target.the("Text arrive day").
            located(By.xpath("//*[@id='toDate']/span[2]"));

}
