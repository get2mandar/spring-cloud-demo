package com.wp.panditmandar.scdemo.bookdata.publisher;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.wp.panditmandar.scdemo.bookdata.book.Book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Publisher Entity
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

	@Column(name = "name", nullable = false, unique = true, length = 200)
	private String name;

	@OneToMany(mappedBy = "publisher")
	private Set<Book> books = new HashSet<>();
}
