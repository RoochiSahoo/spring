package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.instruments.Instrument;
@Component("freakster")
public class Instrumentalist implements Performer {
	
	@Autowired
	@Qualifier("keyboard")
	private Instrument instrument;
	@Value("raabta")
	private String song;
	
	


	@Override
	public void prform() {
		// TODO Auto-generated method stub
		System.out.println("instrumentalist is playing a song "+song);
		instrument.play();

	}

}
