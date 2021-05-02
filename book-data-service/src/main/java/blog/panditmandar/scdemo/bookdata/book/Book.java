package blog.panditmandar.scdemo.bookdata.book;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import blog.panditmandar.scdemo.bookdata.author.Author;
import blog.panditmandar.scdemo.bookdata.publisher.Publisher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Book Entity
 * 
 * @author Mandar Pandit
 *
 */
@Entity
@Table(name = "book", indexes = { @Index(name = "book_isbn13_index", columnList = "isbn13", unique = true) })
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookid")
	private Long id;

	@NaturalId(mutable = false)
	@Column(name = "isbn13", nullable = false, updatable = false, unique = true, length = 20)
	private String isbn13;

	@Column(name = "isbn10", length = 20)
	private String isbn10;

	@Column(name = "title", nullable = false, length = 200)
	private String title;

	@ManyToMany
	@JoinTable(name = "book_authors", joinColumns = @JoinColumn(name = "bookid", referencedColumnName = "bookid"), inverseJoinColumns = @JoinColumn(name = "authorid", referencedColumnName = "authorid"))
	private Set<Author> authors = new HashSet<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "publisherid", nullable = false)
	private Publisher publisher;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn13 == null) ? 0 : isbn13.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn13 == null) {
			if (other.isbn13 != null)
				return false;
		} else if (!isbn13.equals(other.isbn13))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn13=" + isbn13 + ", isbn10=" + isbn10 + ", title=" + title + ", authors="
				+ authors + ", publisher=" + publisher + "]";
	}

}
