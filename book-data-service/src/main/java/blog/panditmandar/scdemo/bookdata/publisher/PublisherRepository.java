package blog.panditmandar.scdemo.bookdata.publisher;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Mandar Pandit
 *
 */
@Repository
@Transactional
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}