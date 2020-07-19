package me.whiteship.practice.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAopAspect {
	
//	@Around("bean(* me.whiteship.practice.util..*..*(..))")
//	@Around("bean(testFormatter)")
	@Around("@annotation(me.whiteship.practice.domain.TestAopAnnotation)")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("앞부분");
		Object obj = joinPoint.proceed();
		System.out.println(obj);
		System.out.println("뒷부분");
		return obj;
	}
}
