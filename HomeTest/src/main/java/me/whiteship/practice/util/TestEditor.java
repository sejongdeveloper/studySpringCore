package me.whiteship.practice.util;

import java.beans.PropertyEditorSupport;

import me.whiteship.practice.domain.Test;

public class TestEditor extends PropertyEditorSupport {

	@Override
	public String getAsText() {
		Test test = (Test)getValue();
		return test.getTestName()+"1212121212";
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Test test = new Test();
		test.setTestName(text);
		setValue(test);
		System.out.println(getValue());
		System.out.println(getSource());
		System.out.println(getClass());
	}
}
