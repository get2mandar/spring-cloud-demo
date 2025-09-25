package com.wp.panditmandar.scdemo.addedinfo.booksinfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.wp.panditmandar.scdemo.addedinfo.binding.BookBinding;

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
@Table(name = "book_info")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class BookInfo {

	@Id
	@Column(name = "isbn13", length = 20)
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "bindingid", nullable = false)
	private BookBinding binding;

}
