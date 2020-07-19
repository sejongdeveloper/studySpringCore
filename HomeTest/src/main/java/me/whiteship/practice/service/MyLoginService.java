package me.whiteship.practice.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("default")
public class MyLoginService implements LoginService {
	
}
