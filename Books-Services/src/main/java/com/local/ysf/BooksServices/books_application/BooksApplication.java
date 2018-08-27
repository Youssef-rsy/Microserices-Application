package com.local.ysf.BooksServices.books_application;

import java.util.List;
import java.util.UUID;

import com.local.ysf.BooksServices.books_domaine.entity.Books;

public interface BooksApplication {

	public void AddBooks(Books books);
	public Books getBook(UUID booksId);
	public List<Books> findAllBooks();
	public void deleteBook(UUID booksId);
	public Books updateBooks(Books bookval);
}
