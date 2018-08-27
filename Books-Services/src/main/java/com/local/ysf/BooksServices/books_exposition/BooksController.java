package com.local.ysf.BooksServices.books_exposition;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.local.ysf.BooksServices.books_application.BooksApplication;
import com.local.ysf.BooksServices.books_domaine.entity.Books;
import com.local.ysf.BooksServices.books_infrastructure.BooksRepository;
@RefreshScope
@RestController
@RequestMapping("/books")
public class BooksController {

	@Autowired
	private BooksRepository application;
	
	private List<Books> listOfBooks;
	@PostMapping()
	public List<Books> AddingBook(@RequestBody Books book){
		application.save(book);
		return application.findAll();
	}
	@GetMapping()
	public List<Books> gettingAllBooks(){
		return application.findAll();
	}
	@GetMapping("/{booksId}")
	public Books gettingBooksInfos(@PathVariable UUID booksId) {
		Optional<Books> val =application.findById(booksId);
		if(val.isPresent())
			return val.get();
		return null;
	}
	@DeleteMapping("/{booksId}")
	public List<Books> deleteBook(@PathVariable UUID booksId){
		application.deleteById(booksId);
		return application.findAll();
	}
	@PutMapping()
	public List<Books> updatingBook(@RequestBody Books newBooksVal){
		//application.updateBooks( newBooksVal);
		return application.findAll();
	}
}
