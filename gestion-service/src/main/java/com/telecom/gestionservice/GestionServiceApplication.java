package com.telecom.gestionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GestionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionServiceApplication.class, args);
	}

}
