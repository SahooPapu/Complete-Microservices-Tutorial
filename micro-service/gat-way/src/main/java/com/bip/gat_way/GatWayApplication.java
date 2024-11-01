package com.bip.gat_way;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatWayApplication.class, args);
	}

}
