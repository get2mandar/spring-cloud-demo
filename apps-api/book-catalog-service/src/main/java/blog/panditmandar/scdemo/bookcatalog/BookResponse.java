package blog.panditmandar.scdemo.bookcatalog;

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

	private static final long serialVersionUID = 4166831819461824296L;

	private String isbn13;
	private String isbn10;
	private String title;

}
