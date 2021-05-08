package blog.panditmandar.scdemo.bookdata.author;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Author Entity
 * 
 * @author Mandar Pandit
 *
 */
@Repository
@Transactional
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
