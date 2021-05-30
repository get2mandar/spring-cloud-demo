package blog.panditmandar.scdemo.bookcatalog;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("book-data-service")
public interface BookDataClient {

	@GetMapping("/books")
	List<BookResponse> getBooks();
}
