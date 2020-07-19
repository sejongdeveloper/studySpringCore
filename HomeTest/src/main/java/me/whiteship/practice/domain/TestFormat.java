package me.whiteship.practice.domain;

public class TestFormat {
	private String testName;

	public TestFormat() {}
	
	public TestFormat(String testName) {
		this.testName = testName;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	@Override
	public String toString() {
		return "Format [testName=" + testName + "]";
	}
	
}
