package com.mic.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;



@SpringBootApplication
public class BootApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

    protected final static Logger logger = LoggerFactory.getLogger(BootApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
        logger.info("DollExtensionApplication is sussess!");
    }


}

