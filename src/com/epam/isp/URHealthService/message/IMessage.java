package com.epam.isp.URHealthService.message;

public abstract class  IMessage {
	
	private String msgBody;
	private String subject;
	

	public String getMsgBody() {
		return msgBody;
	}
	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public abstract boolean send();

}
