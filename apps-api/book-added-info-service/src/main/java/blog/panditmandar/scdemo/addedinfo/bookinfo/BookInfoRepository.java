package blog.panditmandar.scdemo.addedinfo.bookinfo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Book Added Info Entity
 * 
 * @author Mandar Pandit
 *
 */
@Repository
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
