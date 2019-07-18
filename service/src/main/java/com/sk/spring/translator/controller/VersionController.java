package com.sk.spring.translator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/version")
public class VersionController {

    @RequestMapping
    public String getVersion() {
	return "1.0";
    }
}