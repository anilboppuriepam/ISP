package com.epam.isp.URHealthService.payment;

public class MockSodexoWebService {
 
	public String obtainToken(String accountName,String password){
		return "S-O-D-E-X-O";
				
		
	}
	public String makePayment(double amount, String transactionId,String token){
		
		return "SODEXO-1111";
	}
	
}
