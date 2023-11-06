package com.wp.panditmandar.scdemo.addedinfo.bookinfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * API Request for Create or Update Book Added Info
 * 
 * @author Mandar Pandit
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookInfoRequest {

	private String isbn13;
	private Byte edition;
	private Short pages;
	private String language;
	private String published;
	private Long bindingid;

}
