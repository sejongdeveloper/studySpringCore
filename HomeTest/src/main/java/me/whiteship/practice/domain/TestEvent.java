package me.whiteship.practice.domain;

public class TestEvent {

	private String testName;

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	@Override
	public String toString() {
		return "TestEvent [testName=" + testName + "]";
	}
	
}
