package me.whiteship.practice.util;

import java.text.SimpleDateFormat;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import me.whiteship.practice.domain.TestEvent;

@Component
public class TestEventHandler {

	@EventListener
	public void event(TestEvent testEvent) {
		System.out.println("이벤트 등록 시점");
		System.out.println(testEvent);
	}
	
	@EventListener
	public void event2(ContextRefreshedEvent event) {
		System.out.println("객체 생성 시점");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(event.getTimestamp()));
	}
	
	@EventListener
	public void event3(ContextClosedEvent event) {
		System.out.println("객체 소멸시점");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(event.getTimestamp()));
	}
}
