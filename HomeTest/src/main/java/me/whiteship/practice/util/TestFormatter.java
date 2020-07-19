package me.whiteship.practice.util;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import me.whiteship.practice.domain.TestAopAnnotation;
import me.whiteship.practice.domain.TestFormat;

@Component
public class TestFormatter implements Formatter<TestFormat>{

	@Override
	public String print(TestFormat object, Locale locale) {
		// TODO Auto-generated method stub
		System.out.println("okzzzzzzzzzzzzzzzzzzzzz");
		return null;
	}

	@Override
	@TestAopAnnotation
	public TestFormat parse(String text, Locale locale) throws ParseException {
		return new TestFormat(text);
	}

	

}
