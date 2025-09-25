package com.wp.panditmandar.scdemo.addedinfo.booksinfo;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service APIs for Book Added Info
 * 
 * @author Mandar Pandit
 *
 */
@Service
public class BookAddedInfoService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private BookInfoRepository bookInfoRepository;

	public BookInfoResponse saveBookAddedInfo(BookInfoRequest requestDTO) {
		BookInfo bookInfo = modelMapper.map(requestDTO, BookInfo.class);
		bookInfoRepository.save(bookInfo);
		return modelMapper.map(bookInfo, BookInfoResponse.class);
	}

	public List<BookInfoResponse> getAllBookInfo() {
		List<BookInfo> allBookInfoList = bookInfoRepository.findAll();
		List<BookInfoResponse> bookInfoResponseList = allBookInfoList.stream()
				.map(bookInfo -> modelMapper.map(bookInfo, BookInfoResponse.class)).collect(Collectors.toList());
		return bookInfoResponseList;
	}

	public BookInfoResponse getOneBookInfoByISBN(String isbn) {
		BookInfo bookInfo = bookInfoRepository.findByIsbn13(isbn);
		return modelMapper.map(bookInfo, BookInfoResponse.class);
	}

}
