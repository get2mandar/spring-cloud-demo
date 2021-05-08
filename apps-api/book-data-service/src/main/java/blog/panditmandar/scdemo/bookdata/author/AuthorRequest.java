package blog.panditmandar.scdemo.bookdata.author;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * API Request for Create or Update Author
 * 
 * @author Mandar Pandit
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorRequest {

	private String name;

}
