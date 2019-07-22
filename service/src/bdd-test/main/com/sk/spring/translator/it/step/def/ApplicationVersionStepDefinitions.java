package com.sk.spring.translator.it.step.def;

import static com.sk.spring.translator.it.util.AppStatus.RUNNING;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.sk.spring.translator.it.step.ApplicationStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ApplicationVersionStepDefinitions {

    @Steps
    ApplicationStatus application;

    @Given("the application is running")
    public void the_application_is_running() {
	assertThat(application.currentStatus()).isEqualTo(RUNNING);
    }

    @When("I check the application status")
    public void i_check_the_application_status() {
	application.readStatusMessage();
    }

    @Then("the API should return {string}")
    public void the_API_should_return(String expectedMessage) {
	restAssuredThat(lastResponse -> lastResponse.body(equalTo(expectedMessage)));
    }
}