package com.wp.panditmandar.scdemo.bookdata.publisher;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service APIs for Publisher
 * 
 * @author Mandar Pandit
 *
 */
@Service
public class PublisherService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private PublisherRepository publisherRepository;

	public PublisherResponse createPublisher(PublisherRequest requestDTO) {
		Publisher publisher = modelMapper.map(requestDTO, Publisher.class);
		publisherRepository.save(publisher);
		return modelMapper.map(publisher, PublisherResponse.class);
	}

	public List<PublisherResponse> getAllPublishers() {
		List<Publisher> allPublishers = publisherRepository.findAll();
		List<PublisherResponse> publisherResponseList = allPublishers.stream()
				.map(publisher -> modelMapper.map(publisher, PublisherResponse.class)).collect(Collectors.toList());
		return publisherResponseList;
	}

	public PublisherResponse getOnePublisher(Long id) {
		Publisher publisher = publisherRepository.getReferenceById(id);
		return modelMapper.map(publisher, PublisherResponse.class);
	}

}