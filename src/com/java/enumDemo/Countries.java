package com.java.enumDemo;

public enum Countries {
	
	USA ("US"), 
	CANADA("CN"), 
	CHINA("CH"), 
	APAN("JP");
	
	private final String shortCode;
	
	
	private Countries(String shortCode) {
		this.shortCode = shortCode;
	}
	
	public String getCountryCode(){
		
		return this.shortCode;
	}
	

	
	

}
