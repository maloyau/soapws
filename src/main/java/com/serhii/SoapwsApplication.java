package com.serhii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class SoapwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapwsApplication.class, args);
	}
}
