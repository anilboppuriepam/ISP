package com.epam.isp.URHealthService.payment;

public class PaymentService {

	 public PaymentResponse pay(PaymentRequest paymentRequest){
		 
		 PaymentServiceBase paymentService = PaymentServiceFactory.getPaymentServiceForm(paymentRequest.getCardType());
         PaymentResponse paymentResponse = paymentService.payToVendor(paymentRequest.getAmount(), paymentRequest.getPaymentTransactionId());
	      return paymentResponse;
	 }
}
