package blog.panditmandar.scdemo.bookdata.author;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service APIs for Author
 * 
 * @author Mandar Pandit
 *
 */
@Service
public class AuthorService {
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private AuthorRepository authorRepository;
	
	public AuthorResponse createAuthor(AuthorRequest authorRequestDTO) {
		Author author = modelMapper.map(authorRequestDTO, Author.class);
		authorRepository.save(author);
		return modelMapper.map(author, AuthorResponse.class);
	}

	public List<AuthorResponse> getAllAuthors() {
		List<Author> allAuthors = authorRepository.findAll();
		List<AuthorResponse> authorResponseList = allAuthors.stream()
				.map(author -> modelMapper.map(author, AuthorResponse.class)).collect(Collectors.toList());
		return authorResponseList;
	}

	public AuthorResponse getOneAuthor(Long id) {
		Author author = authorRepository.getOne(id);
		return modelMapper.map(author, AuthorResponse.class);
	}

}
