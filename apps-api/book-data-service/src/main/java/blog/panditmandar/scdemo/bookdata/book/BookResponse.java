package blog.panditmandar.scdemo.bookdata.book;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * API Response for All Book Entity Data
 * 
 * @author Mandar Pandit
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse implements Serializable {

	private static final long serialVersionUID = 3610540771967058371L;

	private String isbn13;
	private String isbn10;
	private String title;

}
