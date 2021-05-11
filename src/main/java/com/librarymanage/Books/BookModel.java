package com.librarymanage.Books;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookModel {
	
	@Id
	private String bookId;
	private int quantity;
	private String bookName;
	private String genre;
	
	public String getBookid() {
		return bookId;
	}
	public void setBookid(String bookId) {
		this.bookId = bookId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
