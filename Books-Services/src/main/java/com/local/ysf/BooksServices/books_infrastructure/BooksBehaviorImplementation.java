package com.local.ysf.BooksServices.books_infrastructure;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.local.ysf.BooksServices.books_domaine.Behavior.BooksBehavior;
import com.local.ysf.BooksServices.books_domaine.entity.Books;




public class BooksBehaviorImplementation implements BooksBehavior {

	@Autowired
	 private BooksRepository repository;
	
	@Override
	public void AddBooks(Books books) {
		// TODO Auto-generated method stub
		repository.save(books);
	}

	@Override
	public Books getBook(UUID booksId) {
		// TODO Auto-generated method stub
		Optional<Books> optionalValue = repository.findById(booksId);
		if(optionalValue.isPresent())
			return optionalValue.get();
		return null;
	}

	@Override
	public List<Books> findAllBooks() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void deleteBook(UUID booksId) {
		// TODO Auto-generated method stub
		repository.delete(getBook(booksId));
	}

	@Override
	public Books updateBooks(Books bookval) {
		// TODO Auto-generated method stub
		Books book = getBook(bookval.getBooksId());
		book.setTitle(bookval.getTitle());
		book.setDescription(bookval.getDescription());
		repository.saveAndFlush(book);
		return book;
	}

}
