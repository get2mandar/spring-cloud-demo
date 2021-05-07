package blog.panditmandar.scdemo.bookdata.book;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * API Request for Create or Update Book
 * 
 * @author Mandar Pandit
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {

	private String isbn13;
	private String isbn10;
	private String title;
	private List<Long> authorIds;
	private Long publisherid;

}
