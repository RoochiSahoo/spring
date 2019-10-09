package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.Greeting;

public class SpringMain {
	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("greeting.xml");
		
		
		Greeting greeting=ctx.getBean("festival", Greeting.class);
		System.out.println(greeting.greet());
		
		Greeting greeting1=ctx.getBean("anniversaryGreeting", Greeting.class);
		//System.out.println(greeting1.greet());
		
	}

}
