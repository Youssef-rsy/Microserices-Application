package com.local.ysf.BooksServices.books_application;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.local.ysf.BooksServices.books_domaine.Behavior.BooksBehavior;
import com.local.ysf.BooksServices.books_domaine.entity.Books;

public class BooksApplicationImplementation implements BooksApplication {
	
	@Autowired
	private BooksBehavior booksBehavior;
	
	@Override
	public void AddBooks(Books books) {
		// TODO Auto-generated method stub
		booksBehavior.AddBooks(books);
	}

	@Override
	public Books getBook(UUID booksId) {
		// TODO Auto-generated method stub
		return booksBehavior.getBook(booksId);
	}

	@Override
	public List<Books> findAllBooks() {
		// TODO Auto-generated method stub
		return booksBehavior.findAllBooks();
	}

	@Override
	public void deleteBook(UUID booksId) {
		// TODO Auto-generated method stub
		booksBehavior.deleteBook(booksId);
	}

	@Override
	public Books updateBooks( Books bookval) {
		// TODO Auto-generated method stub
		return booksBehavior.updateBooks( bookval);
	}

}
