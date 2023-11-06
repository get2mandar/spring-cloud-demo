package com.wp.panditmandar.scdemo.bookdata.book;

import java.util.Set;

import com.wp.panditmandar.scdemo.bookdata.author.AuthorResponse;
import com.wp.panditmandar.scdemo.bookdata.publisher.PublisherResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * @author Mandar Pandit
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class BookFullDataResponse extends BookResponse {

	private static final long serialVersionUID = 28530050508997113L;

	private PublisherResponse publisher;
	private Set<AuthorResponse> authors;
}
