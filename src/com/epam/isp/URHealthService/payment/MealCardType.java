package com.epam.isp.URHealthService.payment;

public enum MealCardType {

	SODEX(1),ZETA(2);
	
	private final int shortCode;
	
	MealCardType(int code){
		
		this.shortCode = code;
	}
	public int getShortCode(){
		
		return this.shortCode;
	}
}
