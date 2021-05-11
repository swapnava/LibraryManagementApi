package com.librarymanage.Books;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookModel,String>{
	
	public ArrayList<BookModel> findByGenre(String genre);
}
