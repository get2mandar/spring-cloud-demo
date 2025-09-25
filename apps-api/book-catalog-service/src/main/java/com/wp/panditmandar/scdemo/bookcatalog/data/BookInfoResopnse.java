package com.wp.panditmandar.scdemo.bookcatalog.data;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Book Catalog - Book Added Info Response POJO
 * 
 * @author Mandar Pandit
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookInfoResopnse implements Serializable {

	private static final long serialVersionUID = 3197768760687078610L;

	private String isbn13;
	private Byte edition;
	private Short pages;
	private String language;
	private String published;
	private BookBindingResopnse binding;
}