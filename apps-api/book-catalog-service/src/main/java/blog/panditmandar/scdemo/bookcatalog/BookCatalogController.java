package blog.panditmandar.scdemo.bookcatalog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookCatalogController {

	@Autowired
	BookDataClient bookDataClient;

	@GetMapping("/books")
	public List<BookResponse> getBooks() {
		return bookDataClient.getBooks();
	}
}
