package me.whiteship.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

import me.whiteship.out.MyService;

@SpringBootApplication
public class SpringComponentApplication {

	@Autowired
	MyService myService;
	
	public static void main(String[] args) {
		var app = new SpringApplication(SpringComponentApplication.class);
		app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>)ctx -> {
			ctx.registerBean(MyService.class);
			ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Funtional Bean Definition!!"));
				
		});
		app.run(args);
	}

}
