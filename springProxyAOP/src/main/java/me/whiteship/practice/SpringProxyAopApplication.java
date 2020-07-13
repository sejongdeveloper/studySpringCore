package me.whiteship.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProxyAopApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringProxyAopApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

}
