package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.Greeting;
import com.zensar.spring.config.GreetingConfig;

public class SpringMain {
	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(GreetingConfig.class);
		
		
		Greeting greeting=ctx.getBean("festival", Greeting.class);
		System.out.println(greeting.greet());
		
		Greeting greeting1=ctx.getBean("anniversaryGreeting", Greeting.class);
		//System.out.println(greeting1.greet());
		
	}

}
