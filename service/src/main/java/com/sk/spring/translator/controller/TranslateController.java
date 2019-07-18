package com.sk.spring.translator.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/translate")
public class TranslateController {

    @RequestMapping
    public String postContent(@RequestBody String content) {
	return "Hello!";
    }

}
