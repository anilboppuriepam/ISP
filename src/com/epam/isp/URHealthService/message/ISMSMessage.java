package com.epam.isp.URHealthService.message;

public abstract class ISMSMessage extends IMessage {

	private int mobileNo;
	
	public int getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	
}
