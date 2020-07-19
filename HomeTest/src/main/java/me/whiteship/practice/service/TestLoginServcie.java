package me.whiteship.practice.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class TestLoginServcie implements LoginService {

}
