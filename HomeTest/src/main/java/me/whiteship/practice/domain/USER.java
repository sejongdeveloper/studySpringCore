package me.whiteship.practice.domain;

import javax.validation.constraints.NotEmpty;

public class USER {
	@NotEmpty
	private String id;
	
	private String name;
	
	private int no;
	
	private Test test;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	@Override
	public String toString() {
		return "USER [id=" + id + ", name=" + name + ", no=" + no + ", test=" + test + "]";
	}

}