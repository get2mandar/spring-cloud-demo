package blog.panditmandar.scdemo.bookdata;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import blog.panditmandar.scdemo.bookdata.book.BookRequest;
import blog.panditmandar.scdemo.bookdata.book.BookResponse;
import blog.panditmandar.scdemo.bookdata.book.BookService;
import blog.panditmandar.scdemo.bookdata.publisher.PublisherRequest;
import blog.panditmandar.scdemo.bookdata.publisher.PublisherResponse;
import blog.panditmandar.scdemo.bookdata.publisher.PublisherService;

/**
 * Books Data Controller for Books Details, Publisher and Author Details CRUD
 * 
 * @author Mandar Pandit
 *
 */
@RestController
public class BookDataController {

	@Autowired
	PublisherService publisherService;

	@Autowired
	BookService bookService;

	@PostMapping("/publisher")
	public ResponseEntity<PublisherResponse> createPublisher(@Valid @RequestBody PublisherRequest publisherRequestDTO) {
		PublisherResponse publisherResponse = publisherService.createPublisher(publisherRequestDTO);
		return new ResponseEntity<PublisherResponse>(publisherResponse, HttpStatus.CREATED);
	}

	@GetMapping(path = "/publisher/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<PublisherResponse>> getPublishers() {
		List<PublisherResponse> allPublishers = publisherService.getAllPublishers();
		return ResponseEntity.ok(allPublishers);
	}

	@GetMapping(path = "/publisher/{publisherid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PublisherResponse> getPublisher(@PathVariable("publisherid") Long publisherid) {
		PublisherResponse publisherResponse = publisherService.getOnePublisher(publisherid);
		if (publisherResponse == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(publisherResponse);
	}

	@PostMapping("/book")
	public ResponseEntity<BookResponse> createBook(@Valid @RequestBody BookRequest bookRequest) {
		BookResponse bookResponse = bookService.createBook(bookRequest);
		return new ResponseEntity<BookResponse>(bookResponse, HttpStatus.CREATED);
	}

	@GetMapping(path = "/book/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<BookResponse>> getBooks() {
		List<BookResponse> allBooks = bookService.getAllBooks();
		return ResponseEntity.ok(allBooks);
	}

	@GetMapping(path = "/book/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BookResponse> getBook(@PathVariable("isbn") String isbn) {
		BookResponse bookResponse = bookService.getOneBookByISBN(isbn);
		if (bookResponse == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(bookResponse);
	}

}
