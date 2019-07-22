package com.sk.spring.translator.it.config;

public enum WebServiceEndPoints {
    VERSION("http://localhost:8080/shady/version");

    private final String url;

    WebServiceEndPoints(String url) {
	this.url = url;
    }

    public String getUrl() {
	return url;
    }
}