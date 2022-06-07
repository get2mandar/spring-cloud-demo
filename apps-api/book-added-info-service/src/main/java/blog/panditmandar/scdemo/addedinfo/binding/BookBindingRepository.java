package blog.panditmandar.scdemo.addedinfo.binding;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Book Binding Entity
 * 
 * @author Mandar Pandit
 *
 */
@Repository
@Transactional
public interface BookBindingRepository extends JpaRepository<BookBinding, Long> {

}
