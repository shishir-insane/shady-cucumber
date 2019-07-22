package com.sk.spring.translator.it.util;

import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ApplicationVersion {

    public String currentStatus() {
        int statusCode = RestAssured.get(STATUS.getUrl()).statusCode();
        return (statusCode == 200) ? AppStatus.RUNNING : AppStatus.DOWN;
    }

    @Step("Get current status message")
    public void readStatusMessage() {
        SerenityRest.get(STATUS.getUrl());
    }
}