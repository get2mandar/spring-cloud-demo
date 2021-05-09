package blog.panditmandar.scdemo.bookinfo.pojo;

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
 * Book Binding Entity
 * 
 * @author Mandar Pandit
 *
 */
@Entity
@Table(name = "binding")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBinding {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bindingid")
	private Long id;

	@Column(name = "type", nullable = false, updatable = false, unique = true)
	private String type;
}
