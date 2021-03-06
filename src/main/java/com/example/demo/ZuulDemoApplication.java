package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringCloudApplication
@EnableZuulProxy

public class ZuulDemoApplication {
	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(ZuulDemoApplication.class, args);
	}
}
