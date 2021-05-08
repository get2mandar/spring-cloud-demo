package blog.panditmandar.scdemo.bookdata.publisher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * API Request for Create or Update Publisher
 * 
 * @author Mandar Pandit
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherRequest {

	private String name;
}
