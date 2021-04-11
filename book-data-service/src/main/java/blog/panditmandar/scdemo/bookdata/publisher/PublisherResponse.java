package blog.panditmandar.scdemo.bookdata.publisher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Mandar Pandit
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherResponse {

	private Long id;
	private String name;
}
