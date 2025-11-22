package com.wp.panditmandar.scdemo.bookdata.book;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for Book Entity
 * 
 * @author Mandar Pandit
 *
 */
@Transactional
public interface BookRepository extends JpaRepository<Book, String> {

	/**
	 * Find Book by ISBN13
	 * 
	 * @param isbn13
	 * @return
	 */
	Book findByIsbn13(String isbn13);

	/**
	 * Find Book by ISBN10
	 * 
	 * @param isbn10
	 * @return
	 */
	Book findByIsbn10(String isbn10);

}
