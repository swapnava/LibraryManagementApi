package com.librarymanage.Books;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public void addBook(BookModel book) {
		bookRepository.save(book);
	}
	
	public void editBook(String id, BookModel book) {
		BookModel updatebook = bookRepository.findById(id).get();
		updatebook.setBookid(id);
		updatebook.setQuantity(book.getQuantity());
		updatebook.setBookName(book.getBookName());
		updatebook.setGenre(book.getGenre());
		bookRepository.save(updatebook);
	}
	
	public String deleteBook(String id) {
		bookRepository.deleteById(id);
		return "Deleted Successfully";
	}
	
	public List<BookModel> getBooks(){
		List<BookModel> book=new ArrayList<>();
		bookRepository.findAll().forEach(book::add);
		return book;
	}
	
	public List<BookModel> getBooksById(String id){
		List<BookModel> book=new ArrayList<>();
		bookRepository.findByGenre(id).forEach(book::add);
		return book;
	}
}
