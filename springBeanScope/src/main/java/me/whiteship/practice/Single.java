package me.whiteship.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Single {

	@Autowired
	Proto proto;

	int value = 0;
	
	public Proto getProto() {
		return proto;
	}
	
}
