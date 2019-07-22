package com.sk.spring.translator.it.config;

public enum WebServiceEndPoints {
    STATUS("http://localhost:8080/shady/health");

    private final String url;

    WebServiceEndPoints(String url) {
	this.url = url;
    }

    public String getUrl() {
	return url;
    }
}