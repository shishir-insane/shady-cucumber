package com.sk.spring.translator.it.step;

import static com.sk.spring.translator.it.config.WebServiceEndPoints.STATUS;
import static com.sk.spring.translator.it.util.AppStatus.DOWN;
import static com.sk.spring.translator.it.util.AppStatus.RUNNING;

import com.sk.spring.translator.it.util.AppStatus;

import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ApplicationStatus {

    public AppStatus currentStatus() {
	int statusCode = RestAssured.get(STATUS.getUrl()).statusCode();
	return (statusCode == 200) ? RUNNING : DOWN;
    }

    @Step("Get current status message")
    public void readStatusMessage() {
	SerenityRest.get(STATUS.getUrl());
    }
}