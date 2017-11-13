package com.epam.isp.URHealthService.message;

public class SMS extends ISMSMessage {

	 private int mobileNo;
	 private String subject;
	 private String msgBody;
	
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}




	public String getSubject() {
		return subject;
	}




	public void setSubject(String subject) {
		this.subject = subject;
	}




	public String getMsgBody() {
		return msgBody;
	}




	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}




	@Override
	public boolean send() {
return true;
		
	}

}
