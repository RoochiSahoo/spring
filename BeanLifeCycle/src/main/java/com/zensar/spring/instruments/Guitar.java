package com.zensar.spring.instruments;

public class Guitar implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
           System.out.println("guitar sound");
	}

	@Override
	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("guitar is tune");
		
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("clean");
		
	}

}
