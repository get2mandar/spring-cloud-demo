package blog.panditmandar.scdemo.bookdata.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {

	private String isbn13;
	private String isbn10;
	private String title;
	private Long publisherid;

}
