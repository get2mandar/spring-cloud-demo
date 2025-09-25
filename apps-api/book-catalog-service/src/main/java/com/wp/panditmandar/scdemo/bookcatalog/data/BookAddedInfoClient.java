package com.wp.panditmandar.scdemo.bookcatalog.data;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("book-added-info-service")
public interface BookAddedInfoClient {

	@GetMapping("/booksinfo")
	@Cacheable("booksinfo")
	List<BookInfoResopnse> getAllBookAddedInfo();

	@GetMapping("/booksinfo/{isbn}")
	BookInfoResopnse getBookAddedInfo(@PathVariable("isbn") String isbn);
}