package com.sk.spring.translator.it;

import org.junit.Test;

import com.sk.spring.translator.it.annotation.IntegrationTest;

import lombok.extern.slf4j.Slf4j;

@IntegrationTest
@Slf4j
public class BaseIntegrationTest {

    @Test
    public void contextLoads() {
        log.info("Verifying graceful loading of spring context.");
    }

}
