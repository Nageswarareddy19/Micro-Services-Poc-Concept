package com.currency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Proj14CurrencyAppEurekaRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proj14CurrencyAppEurekaRegistryApplication.class, args);
	}

}
