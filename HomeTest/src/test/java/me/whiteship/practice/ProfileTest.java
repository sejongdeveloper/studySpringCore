package me.whiteship.practice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import me.whiteship.practice.service.LoginService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfileTest {
	
	@Autowired
	LoginService loginService;
	
	@Test
	public void test() {
		System.out.println(loginService);
	}
}
