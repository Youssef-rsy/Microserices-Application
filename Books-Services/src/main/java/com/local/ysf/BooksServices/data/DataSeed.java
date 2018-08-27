package com.local.ysf.BooksServices.data;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.local.ysf.BooksServices.books_domaine.entity.Books;
import com.local.ysf.BooksServices.books_infrastructure.BooksRepository;

@Component
public class DataSeed {

	
	@Autowired
	private BooksRepository application;
	
	@PostConstruct
	public void dataseed() {
		
		List<Books> lst = new ArrayList<>();
		for (int j = 0; j < 26; j++) {
			lst.add(new Books("books n° "+j , "Description of the boook number "+j));
		}
		
		lst.forEach(book->application.save(book) );
		
		
	}
	
}
