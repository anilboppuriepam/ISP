package com.epam.isp.URHealthService.payment;

public class ZetaPayment extends PaymentServiceBase{
	
	private String accountId;
	private String accountPassword;
	private String productId;
	
	
       public ZetaPayment(String accountId, String accountPassword){
    	   
    	    this.accountId = accountId;
    	    this.accountPassword = accountPassword;
    	    this.productId = productId;
       }
       
       public PaymentResponse payToVendor(double amount, String transactionId){
    	   
    	   PaymentResponse paymentResponse = new PaymentResponse();
    	   
    	   MockZetaWebService worldPayWebService = new MockZetaWebService();
    	   String response = worldPayWebService.makePayment(amount, transactionId,accountId, accountPassword);
    	   paymentResponse.setMessage(response);
    	   
    	    if(response.contains("Z-E-T-A"))
    	    	paymentResponse.setSucces(true);
    	    else 
    	    	paymentResponse.setSucces(false);
    	    
    	    return paymentResponse;
       }
}
