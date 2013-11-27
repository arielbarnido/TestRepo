package com.spring.tutor.bo;

public class BasketballPlayer implements Player{

	private String type;
	
	public void setType(String type){
		this.type = type;
	}
	
	
	@Override
	public void move() {
		System.out.println(type + " is now moving...");
		
	}

}
