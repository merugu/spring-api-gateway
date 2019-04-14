package com.innovativeintelli.remitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
public class RemitServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemitServiceApplication.class, args);
	}
	
	@Bean
	Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
