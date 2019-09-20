package com.sc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //启动Zuul
public class ServiceZullApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZullApplication.class, args);
	}

}
