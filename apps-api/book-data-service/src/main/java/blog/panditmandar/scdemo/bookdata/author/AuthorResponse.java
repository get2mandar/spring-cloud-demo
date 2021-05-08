package blog.panditmandar.scdemo.bookdata.author;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * API Response for All Author Data
 * 
 * @author Mandar Pandit
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorResponse {

	private Long id;
	private String name;

}
