package com.zensar.spring.performers;

import java.util.List;
import java.util.Set;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	private Set<Instrument> instruments;
	private String song;
	public Instrumentalist() {
		// TODO Auto-generated constructor stub
		System.out.println("instrumentalist is created");
	}






	public String getSong() {
		return song;
	}


	public void setSong(String song) {
		this.song = song;
		System.out.println("song is set");
	}
	public Set<Instrument> getInstruments() {
		return instruments;
	}






	public void setInstruments(Set<Instrument> instruments) {
		this.instruments = instruments;
	}


	@Override
	public void prform() {
		// TODO Auto-generated method stub
		System.out.println("instrumentalist is playing a song "+song);
		for(Instrument i:instruments) {
			i.play();		
			}
		

	}






	
}
