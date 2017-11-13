package com.epam.isp.URHealthService.payment;

public class PaymentServiceFactory {

	public static PaymentServiceBase getPaymentServiceForm(MealCardType mealCardType){
		PaymentServiceBase paymentServiceBase = null;
		switch(mealCardType){
		case SODEX:
		{
			paymentServiceBase =  new SodexhoPayment("Tom","password");
			break;
			
		}
		case ZETA:
		{
			paymentServiceBase = new ZetaPayment("Jerry","password");
			break;
		
		}
		
	}
		return paymentServiceBase;
}
}
