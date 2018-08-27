package com.local.ysf.BooksServices.books_domaine.entity;

import java.util.UUID;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.metamodel.IdentifiableType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


/*@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor*/
@Entity
public class Books {

	@Id
	@Type(type="uuid-char")
    @GeneratedValue(generator ="UUID")
    @GenericGenerator(name="UUID",strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "booksId", updatable = false, nullable = false)
	private UUID booksId;
	private String title;
	private String description;
	//private String releaseDate;
	
	public Books(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	public Books(UUID booksId, String title, String description) {
		super();
		this.booksId = booksId;
		this.title = title;
		this.description = description;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UUID getBooksId() {
		return booksId;
	}
	public void setBooksId(UUID booksId) {
		this.booksId = booksId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Books [booksId=" + booksId + ", title=" + title + ", description=" + description + "]";
	}
	
	
}
