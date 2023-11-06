package com.wp.panditmandar.scdemo.bookdata.book;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wp.panditmandar.scdemo.bookdata.author.Author;
import com.wp.panditmandar.scdemo.bookdata.author.AuthorRepository;
import com.wp.panditmandar.scdemo.bookdata.publisher.Publisher;
import com.wp.panditmandar.scdemo.bookdata.publisher.PublisherRepository;

/**
 * Service APIs for Book
 * 
 * @author Mandar Pandit
 *
 */
@Service
public class BookService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private AuthorRepository authorRepository;

	@Autowired
	private PublisherRepository publisherRepository;

	public BookFullDataResponse createBook(BookRequest bookRequest) {
		Book book = modelMapper.map(bookRequest, Book.class);
		Publisher publisher = publisherRepository.getReferenceById(bookRequest.getPublisherid());
		book.setPublisher(publisher);
		for (Long authorId : bookRequest.getAuthorIds()) {
			Author author = authorRepository.getReferenceById(authorId);
			book.getAuthors().add(author);
		}
		bookRepository.save(book);
		return modelMapper.map(book, BookFullDataResponse.class);
	}

	public List<BookResponse> getAllBooks() {
		List<Book> allBooks = bookRepository.findAll();
		List<BookResponse> bookResponseList = allBooks.stream().map(book -> modelMapper.map(book, BookResponse.class))
				.collect(Collectors.toList());
		return bookResponseList;
	}

	public List<BookFullDataResponse> getBooksAllAtOnce() {
		List<Book> allBooks = bookRepository.findAll();
		List<BookFullDataResponse> bookResponseList = allBooks.stream()
				.map(book -> modelMapper.map(book, BookFullDataResponse.class)).collect(Collectors.toList());
		return bookResponseList;
	}

	public BookResponse getOneBookByISBN(String isbn) {
		Book book = bookRepository.findByIsbn13(isbn);
		if (book == null) {
			book = bookRepository.findByIsbn10(isbn);
		}
		return modelMapper.map(book, BookResponse.class);
	}

}
