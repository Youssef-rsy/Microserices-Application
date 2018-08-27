package com.local.ysf.Readers.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/readers")
public class ReaderHystrixServiceController {

	@Autowired
	private ReadersServices  services;

	@GetMapping("infos")
	public String callReadersService() {
		System.out.println("calling hystrixs");
		return  services.callingPersenalInfosFromBooksAsFirstTestOfHystrix();
	}
}
