package com.zww.tnt.any;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.zww.tnt.any"})
public class AnyAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnyAdminApplication.class, args);
	}
}
