package com.zensar.spring.performers;

import java.util.Enumeration;
import java.util.Properties;

public class Instrumentalist implements Performer {
	private Properties instrumentSongProps;

	
	public Properties getInstrumentSongProps() {
		return instrumentSongProps;
	}


	public void setInstrumentSongProps(Properties instrumentSongProps) {
		this.instrumentSongProps = instrumentSongProps;
	}


	@Override
	public void prform() {
		// TODO Auto-generated method stub
		Enumeration instrument=instrumentSongProps.keys();
		while (instrument.hasMoreElements()) {
			String guitar = (String) instrument.nextElement();
			String song=instrumentSongProps.getProperty(guitar);
			System.out.println(song+" by"+guitar);
			System.out.println("instrumentalist is playing song");
		}
		
	}
	
	
		
			

	





	
}
