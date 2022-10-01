package co.com.doublev.manualtests.stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

import static co.com.doublev.manualtest.utils.ManualTest.validate;

public class ManualTestsStepDefinitions {
    private Scenario scenario;

    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^(.*)$")
    public void scenario(String step) {
        validate(step, scenario.getName());
    }
}
