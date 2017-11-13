package com.epam.isp.URHealthService.message;

public abstract class IEmailMessage extends  IMessage{
	
	private String toAddress;
	private String ccAddress;
	public String getToAddress() {
		return toAddress;
	}
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	public String getCcAddress() {
		return ccAddress;
	}
	public void setCcAddress(String ccAddress) {
		this.ccAddress = ccAddress;
	}
	
	

}
