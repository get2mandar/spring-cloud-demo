package com.wp.panditmandar.scdemo.bookcatalog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wp.panditmandar.scdemo.bookcatalog.data.BookDataClient;
import com.wp.panditmandar.scdemo.bookcatalog.data.BookResponse;

@RestController
@RequestMapping("/catalog")
@CrossOrigin
public class BookCatalogController {

	@Autowired
	BookDataClient bookDataClient;

	@GetMapping("/books")
	public List<BookResponse> getBooks() {
		return bookDataClient.getBooks();
	}

	@GetMapping("/books/{isbn}")
	public BookResponse getBook(@PathVariable("isbn") String isbn) {
		return bookDataClient.getBook(isbn);
	}
}
