package com.librarymanage.Books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	@PostMapping(value="/saveBook", 
			consumes= {MediaType.APPLICATION_JSON_VALUE}, 
			produces= {MediaType.APPLICATION_JSON_VALUE})
	public void save(@RequestBody BookModel book) {
		bookService.addBook(book);
	}
	@PostMapping(value="/editBook",
			consumes= {MediaType.APPLICATION_JSON_VALUE},
			produces= {MediaType.APPLICATION_JSON_VALUE})
	public void edit(@RequestParam("bookId") String id, @RequestBody BookModel book) {
		bookService.editBook(id, book);
	}
	
	@PostMapping(value="/deleteBook")
	public String delete(@RequestParam("bookId") String id) {
		return bookService.deleteBook(id);
	}
	
	@GetMapping(value="/getBooks")
	public List<BookModel> getAll() {
		return bookService.getBooks();
	}
	
	@PostMapping(value="/getByType")
	public List<BookModel> getBooksByGenre(@RequestParam("id") String genre) {
		return bookService.getBooksById(genre);
	}
}
