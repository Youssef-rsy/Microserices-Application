package com.local.ysf.Readers.hystrix;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ReadersServices {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@HystrixCommand(fallbackMethod = "fallbackMethode")
	public String callingPersenalInfosFromBooksAsFirstTestOfHystrix() {
		URI uri = URI.create("http://localhost:8181/infos");
		return restTemplate().getForObject(uri, String.class);
	}

	public String fallbackMethode() {
		// TODO Auto-generated method stub
		return "the server is not responding please try again";
	}

}
