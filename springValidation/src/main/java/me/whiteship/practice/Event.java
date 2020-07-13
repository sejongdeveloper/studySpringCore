package me.whiteship.practice;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Event {

	Integer id;
	
	@NotEmpty
	String title;

	@NotNull @Min(0)
	Integer limit;
	
	@Email
	String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
