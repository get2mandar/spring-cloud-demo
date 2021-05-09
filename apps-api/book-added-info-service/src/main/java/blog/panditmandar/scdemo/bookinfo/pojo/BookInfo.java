package blog.panditmandar.scdemo.bookinfo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Book Info Entity
 * 
 * @author Mandar Pandit
 *
 */
@Entity
@Table(name = "book_info", indexes = { @Index(name = "book_isbn13_index", columnList = "isbn13", unique = true) })
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class BookInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "infoid")
	private Long id;

	@NaturalId(mutable = false)
	@Column(name = "isbn13", nullable = false, updatable = false, unique = true, length = 20)
	@EqualsAndHashCode.Include
	private String isbn13;

	@Column(name = "edition")
	private Byte edition;

	@Column(name = "pages")
	private Short pages;
	
	@Column(name = "language", length = 30)
	private String language;

	@Column(name = "published", length = 30)
	private String published;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bindingid", nullable = false)
	private BookBinding binding;
	
}
