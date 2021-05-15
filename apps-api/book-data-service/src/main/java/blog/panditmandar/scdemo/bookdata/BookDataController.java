package blog.panditmandar.scdemo.bookdata;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import blog.panditmandar.scdemo.bookdata.author.AuthorRequest;
import blog.panditmandar.scdemo.bookdata.author.AuthorResponse;
import blog.panditmandar.scdemo.bookdata.author.AuthorService;
import blog.panditmandar.scdemo.bookdata.book.BookFullDataResponse;
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

	@Autowired
	AuthorService authorService;

	@Autowired
	private PropertyConfiguration propertyConfiguration;

	@PostMapping("/publishers")
	public ResponseEntity<PublisherResponse> createPublisher(@Valid @RequestBody PublisherRequest publisherRequestDTO) {
		PublisherResponse publisherResponse = publisherService.createPublisher(publisherRequestDTO);
		return new ResponseEntity<PublisherResponse>(publisherResponse, HttpStatus.CREATED);
	}

	@GetMapping(path = "/publishers")
	public ResponseEntity<List<PublisherResponse>> getPublishers() {
		List<PublisherResponse> allPublishers = publisherService.getAllPublishers();
		return ResponseEntity.ok(allPublishers);
	}

	@GetMapping(path = "/publishers/{publisherid}")
	public ResponseEntity<PublisherResponse> getPublisher(@PathVariable("publisherid") Long publisherid) {
		PublisherResponse publisherResponse = publisherService.getOnePublisher(publisherid);
		if (publisherResponse == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(publisherResponse);
	}

	@PostMapping(path = "/authors")
	public ResponseEntity<AuthorResponse> createAuthor(@Valid @RequestBody AuthorRequest authorRequestDTO) {
		AuthorResponse authorResponse = authorService.createAuthor(authorRequestDTO);
		return new ResponseEntity<AuthorResponse>(authorResponse, HttpStatus.CREATED);
	}

	@GetMapping(path = "/authors")
	public ResponseEntity<List<AuthorResponse>> getAuthors() {
		List<AuthorResponse> allAuthors = authorService.getAllAuthors();
		return ResponseEntity.ok(allAuthors);
	}

	@GetMapping(path = "/authors/{authorid}")
	public ResponseEntity<AuthorResponse> getAuthor(@PathVariable("authorid") Long authorid) {
		AuthorResponse authorResponse = authorService.getOneAuthor(authorid);
		if (authorResponse == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(authorResponse);
	}

	@PostMapping(path = "/books")
	public ResponseEntity<BookFullDataResponse> createBook(@Valid @RequestBody BookRequest bookRequest) {
		BookFullDataResponse bookResponse = bookService.createBook(bookRequest);
		return new ResponseEntity<BookFullDataResponse>(bookResponse, HttpStatus.CREATED);
	}

	@GetMapping(path = "/books")
	public ResponseEntity<List<BookResponse>> getBooks() {
		List<BookResponse> allBooks = bookService.getAllBooks();
		return ResponseEntity.ok(allBooks);
	}

	@GetMapping(path = "/books/full")
	public ResponseEntity<List<BookFullDataResponse>> getBooksAllAtOnce() {
		List<BookFullDataResponse> allBooks = bookService.getBooksAllAtOnce();
		allBooks.stream().limit(propertyConfiguration.getMax()).collect(Collectors.toList());
		return ResponseEntity.ok(allBooks);
	}

	@GetMapping(path = "/books/{isbn}")
	public ResponseEntity<BookResponse> getBook(@PathVariable("isbn") String isbn) {
		BookResponse bookResponse = bookService.getOneBookByISBN(isbn);
		if (bookResponse == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(bookResponse);
	}

}
