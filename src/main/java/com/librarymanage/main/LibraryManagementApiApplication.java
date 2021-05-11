package com.librarymanage.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.librarymanage.Books")
@EntityScan("com.librarymanage.Books")
@EnableJpaRepositories("com.librarymanage.Books")
public class LibraryManagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApiApplication.class, args);
	}

}
