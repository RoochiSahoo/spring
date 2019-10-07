package com.zensar.spring;

public class AnniversaryGreeting implements Greeting {
	public AnniversaryGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("this is Default Constructor.");
	}

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "this is anniversary greeting";
	}

}
