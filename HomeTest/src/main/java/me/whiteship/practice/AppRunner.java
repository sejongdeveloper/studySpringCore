package me.whiteship.practice;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.context.annotation.ApplicationScope;

import me.whiteship.practice.domain.TestEvent;
import me.whiteship.practice.domain.USER;

@Component
public class AppRunner implements ApplicationRunner {
	
	@Autowired
	Validator validator;
	
	@Autowired
	ApplicationEventPublisher eventPublisher;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(validator.getClass());
		
		USER user = new USER();
		user.setId(" a");
		user.setNo(14);
		Errors errors = new BeanPropertyBindingResult(user, "event");
		
		validator.validate(user, errors);
		
		System.out.println(errors.hasErrors());
		
		errors.getAllErrors().forEach(e -> {
			System.out.println("===== error code =====");
			Arrays.stream(e.getCodes()).forEach(System.out::println);
			System.out.println(e.getDefaultMessage());
		});
		
		eventPublisher.publishEvent(new TestEvent());
	}
}

