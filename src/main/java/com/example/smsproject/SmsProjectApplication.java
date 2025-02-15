package com.example.smsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ServletComponentScan(basePackages = {"com.example.smsproject.service"})
public class SmsProjectApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SmsProjectApplication.class, args);
    }
}
