package com.epam.isp.URHealthService.payment;

public abstract class PaymentServiceBase {

	public abstract PaymentResponse payToVendor(double amount,String transactionId);
}
