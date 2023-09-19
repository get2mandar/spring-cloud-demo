package blog.panditmandar.scdemo.addedinfo.bookinfo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for Book Added Info Entity
 * 
 * @author Mandar Pandit
 *
 */
@Transactional
public interface BookInfoRepository extends JpaRepository<BookInfo, Long> {

	/**
	 * Find Book by ISBN13
	 * 
	 * @param isbn13
	 * @return
	 */
	BookInfo findByIsbn13(String isbn13);
}
