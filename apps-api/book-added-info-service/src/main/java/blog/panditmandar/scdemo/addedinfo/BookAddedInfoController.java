package blog.panditmandar.scdemo.addedinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import blog.panditmandar.scdemo.addedinfo.bookinfo.BookAddedInfoService;
import blog.panditmandar.scdemo.addedinfo.bookinfo.BookInfoResponse;

/**
 * Books Added Info Controller for All Books Additional Details CRUD
 * 
 * @author Mandar Pandit
 *
 */
@RestController
public class BookAddedInfoController {

	@Autowired
	BookAddedInfoService bookAddedInfoService;

	@GetMapping(path = "/bookinfo")
	public ResponseEntity<List<BookInfoResponse>> getAllBookAddedInfo() {
		List<BookInfoResponse> allBookInfo = bookAddedInfoService.getAllBookInfo();
		return ResponseEntity.ok(allBookInfo);
	}

	@GetMapping(path = "/bookinfo/{isbn}")
	public ResponseEntity<BookInfoResponse> getBookAddedInfo(@PathVariable("isbn") String isbn) {
		BookInfoResponse bookInfo = bookAddedInfoService.getOneBookInfoByISBN(isbn);
		if (bookInfo == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(bookInfo);
	}
}
