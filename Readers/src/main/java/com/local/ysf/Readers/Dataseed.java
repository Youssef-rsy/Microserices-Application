package com.local.ysf.Readers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dataseed {

	@Autowired
	private ReadersRepository rep;
	
	
	@PostConstruct
	public void addingData() {
		List<Readers> lst = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			rep.save(new Readers("first name "+i, "lastName "+i , i*5));
		}
	}
}
