package me.whiteship.practice.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import me.whiteship.practice.domain.Test;
import me.whiteship.practice.domain.TestEvent;
import me.whiteship.practice.domain.TestFormat;
import me.whiteship.practice.domain.USER;
import me.whiteship.practice.util.TestEditor;

@Controller
public class TestController {
	
	@Autowired
	MessageSource messageSource;

	@GetMapping(value = "/home")
	public String main() {
		return "index"	;
	}
	
	@GetMapping(value = "/another")
	public String home() {
		return "myTest";
	}
	
	@PostMapping(value = "/login")
	public String login(USER user) {
		user.setId("");
		user.setNo(9);
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getNo());
		return "index";
	}
	
	@ResponseBody
	@PostMapping(value = "/test")
	public String test(@Valid @RequestBody USER user) throws Exception {
		System.out.println(user);
		return "good";
	}
	
	@InitBinder
	public void init(WebDataBinder webDataBinder) {
		webDataBinder.registerCustomEditor(Test.class, new TestEditor());
	}
	
	@GetMapping(value = "/editor/{test}")
	public String editor(@PathVariable Test test) {
		System.out.println(test);
		return "index";
	}
	
	@GetMapping(value = "/editor2")
	public String editor2(Test test) {
		//System.out.println(test.getTestName());
		//System.out.println(test.getTestName().toString());
		System.out.println(test);
		return "index";
	}
	
	@GetMapping(value = "/formatter/{testFormat}")
	public String testFormat(@PathVariable TestFormat testFormat) {
		System.out.println(testFormat);
		return "index";
	}
	
	@GetMapping(value = "/String/{testFormat}")
	public String StringToTestConvert(@PathVariable TestFormat testFormat) {
		System.out.println(testFormat);
		return "index";
	}
	
	@GetMapping(value = "/Integer/{testFormat}")
	public String IntegerToTestConvert(@PathVariable TestFormat testFormat) {
		System.out.println(testFormat);
		return "index";
	}
	
	@GetMapping(value = "/message")
	public String message() {
		String str1 = messageSource.getMessage("Hello", new String[] {"sejong"}, Locale.getDefault());
		String str2 = messageSource.getMessage("Hello", new String[] {"sejong"}, Locale.US);
		System.out.println(str1);
		System.out.println(str2);
		return "index";
	}
	
	@GetMapping(value = "/testEvent")
	public String testEvent(TestEvent testEvent) {
		System.out.println("controller : " + testEvent);
		testEvent = null;
		return "index";
	}
	
}
