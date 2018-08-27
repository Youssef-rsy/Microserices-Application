package com.local.ysf.BooksServices.books_infrastructure;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.local.ysf.BooksServices.books_domaine.entity.Books;

public interface BooksRepository extends JpaRepository<Books, UUID> {

}
