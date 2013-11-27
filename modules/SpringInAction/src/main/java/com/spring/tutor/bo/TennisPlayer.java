package com.spring.tutor.bo;

public class TennisPlayer implements Player{

	private String type;
	
	public void setType(String type){
		this.type = type;
	}
	
	@Override
	public void move() {
		System.out.println(type + " is now moving...");
		
	}

}
