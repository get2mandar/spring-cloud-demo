package blog.panditmandar.scdemo.addedinfo.bookinfo;

import blog.panditmandar.scdemo.addedinfo.binding.BookBinding;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * API Response for All Book Added Info
 * 
 * @author Mandar Pandit
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookInfoResponse {

	private String isbn13;
	private Byte edition;
	private Short pages;
	private String language;
	private String published;
	private BookBinding binding;

}
