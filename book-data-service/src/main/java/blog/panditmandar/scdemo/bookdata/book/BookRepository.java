package blog.panditmandar.scdemo.bookdata.book;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Book Entity
 * 
 * @author Mandar Pandit
 *
 */
@Repository
@Transactional
public interface BookRepository extends JpaRepository<Book, Long> {

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
