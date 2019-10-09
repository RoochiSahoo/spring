package com.zensar.spring.performers;

import org.springframework.beans.factory.BeanNameAware;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer,BeanNameAware {
	private String name;
	private Instrument instrument;
	private String song;
	public Instrumentalist() {
		// TODO Auto-generated constructor stub
		System.out.println("instrumentalist is created");
	}


	public Instrument getInstrument() {
		return instrument;
	}


	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("instrument is set");
	}


	public String getSong() {
		return song;
	}


	public void setSong(String song) {
		this.song = song;
		System.out.println("song is set");
	}


	@Override
	public void prform() {
		// TODO Auto-generated method stub
		System.out.println("Song is played by: "+name);
		instrument.play();
		

	}


	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		
	}

}