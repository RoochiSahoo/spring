package com.zensar.spring.performers;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	
	private Map<Instrument, String> instrumentSongMap;

	public Map<Instrument, String> getInstrumentSongMap() {
		return instrumentSongMap;
	}

	public void setInstrumentSongMap(Map<Instrument, String> instrumentSongMap) {
		this.instrumentSongMap = instrumentSongMap;
	}

	@Override
	public void prform() {
		// TODO Auto-generated method stub
		System.out.println("instrumentalist is playing songs");
		
			for(Map.Entry<Instrument, String> e:instrumentSongMap.entrySet())
			{
				System.out.print("song is "+e.getValue()+" played by ");
				//System.out.println("instrument is "+e.getKey());
				e.getKey().play();
			}
		
			

	}





	
}
