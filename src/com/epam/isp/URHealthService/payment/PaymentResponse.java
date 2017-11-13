package com.epam.isp.URHealthService.payment;

public class PaymentResponse {

	private boolean succes;
	private String message;
	public boolean isSucces() {
		return succes;
	}
	public void setSucces(boolean succes) {
		this.succes = succes;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
