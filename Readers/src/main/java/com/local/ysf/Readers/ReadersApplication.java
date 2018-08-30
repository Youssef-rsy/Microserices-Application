package com.local.ysf.Readers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
@EnableBinding(Sink.class)
public class ReadersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadersApplication.class, args);
	}
	@StreamListener(target = Sink.INPUT)
	public void ProcessRegisterBooks(String books) {
		System.out.println(" Readers boot classe -> message from RabbitMQ :"+books);
	}
}
