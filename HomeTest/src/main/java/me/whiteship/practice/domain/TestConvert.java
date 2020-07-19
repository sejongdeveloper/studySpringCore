package me.whiteship.practice.domain;

public class TestConvert {

	private String testName;
	
	private int testNumber;

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public int getTestNumber() {
		return testNumber;
	}

	public void setTestNumber(int testNumber) {
		this.testNumber = testNumber;
	}

	@Override
	public String toString() {
		return "TestConvert [testName=" + testName + ", testNumber=" + testNumber + "]";
	}
	
}
