package com.epam.isp.URHealthService.payment;

public class SodexhoPayment extends PaymentServiceBase{

	 private String accountName;
	 private String password;
	public SodexhoPayment(String accountName, String password) {
		super();
		this.accountName = accountName;
		this.password = password;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 
	public PaymentResponse payToVendor(double amount,String transactionId){
		
		MockSodexoWebService sodexoWebService = new MockSodexoWebService();
		PaymentResponse paymentResponse = new PaymentResponse();
		String token = sodexoWebService.obtainToken(accountName, password);
		String response = sodexoWebService.makePayment(amount, transactionId, token);
		paymentResponse.setMessage(response);
		
		if(response.contains("SODEXO-1111"))
		     paymentResponse.setSucces(true);
		  else
		    	 paymentResponse.setSucces(false);
		return paymentResponse;
	}
	 
}
