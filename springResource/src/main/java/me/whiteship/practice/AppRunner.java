package me.whiteship.practice;

import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	ApplicationContext resourceLoader;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(resourceLoader.getClass());
		
		Resource resource = resourceLoader.getResource("classpath:text.txt");
		System.out.println(resource.getClass());
		
		System.out.println(resource.exists());
		System.out.println(resource.getDescription());
		System.out.println(Files.readString(Path.of(resource.getURI())));
	}
}
