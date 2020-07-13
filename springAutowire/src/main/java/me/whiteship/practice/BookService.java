package me.whiteship.practice;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	BookRepository myBookRepository;
	
	@PostConstruct
	public void setUp() {
		System.out.println(myBookRepository.getClass());
	}
	
	
}
