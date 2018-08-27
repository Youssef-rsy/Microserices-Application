package com.local.ysf.BooksServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages= {"com.local.ysf"})
@EnableJpaRepositories(basePackages= {"com.local.ysf"} )
@ComponentScan(basePackages = "com.local.ysf")
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication(scanBasePackages= {"com.local.ysf"})
public class BooksServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksServicesApplication.class, args);
	}
}
