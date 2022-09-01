package blog.panditmandar.scdemo.bookcatalog.data;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("book-data-service")
public interface BookDataClient {

	@GetMapping("/books")
	@Cacheable("books")
	List<BookResponse> getBooks();
}
