package me.whiteship.practice.util;

import org.springframework.core.convert.converter.Converter;

import me.whiteship.practice.domain.TestConvert;

public class TestConverter {

	public static class StringToTestConvert implements Converter<String, TestConvert> {
		@Override
		public TestConvert convert(String source) {
			TestConvert test = new TestConvert();
			test.setTestName(source);
			System.out.println("string");
			return test;
		}
	}
	
	public static class TestConvertToString implements Converter<TestConvert, String> {
		@Override
		public String convert(TestConvert source) {
			System.out.println("zzzzzzzzzzzzzzzzzzzzz");
			return null;
		}
	}
	
	public static class IntegerToTestConvert implements Converter<Integer, TestConvert> {
		@Override
		public TestConvert convert(Integer source) {
			TestConvert test = new TestConvert();
			test.setTestNumber(source);
			System.out.println("integer");
			return test;
		}
	}
}
