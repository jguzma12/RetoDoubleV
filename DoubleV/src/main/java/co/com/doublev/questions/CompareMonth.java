package co.com.doublev.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CompareMonth implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        String start = actor.recall("StartDay");
        String end = actor.recall("EndDay");
        Boolean comparateMonth = false;

        int difMonth = 0;
        try {
            Calendar startDay = new GregorianCalendar();
            Calendar endDay = new GregorianCalendar();
            startDay.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(start));
            endDay.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(end));
            int difAnnual = endDay.get(Calendar.YEAR) - startDay.get(Calendar.YEAR);
            difMonth = difAnnual * 12 + endDay.get(Calendar.MONTH) - startDay.get(Calendar.MONTH);

        } catch (ParseException ex) {

        }
        if (difMonth >= 1) {
            comparateMonth = true;
        }

        return comparateMonth ;
    }
    public static CompareMonth compareMonth(){
        return new CompareMonth();
    }

    }

