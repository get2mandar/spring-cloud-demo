package blog.panditmandar.scdemo.bookdata.publisher;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Mandar Pandit
 *
 */
@Entity
@Table(name = "publisher")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "publisherid")
	private Long id;

	@Column(name = "name", nullable = false, updatable = false, unique = true)
	private String name;

	//@OneToMany(mappedBy = "publisher")
	//private Set<Book> books = new HashSet<>();
}
