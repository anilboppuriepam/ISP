package com.epam.isp.URHealthService.payment;

public class PaymentRequest {
  private MealCardType cardType;
  private String paymentTransactionId;
 private double amount;
public MealCardType getCardType() {
	return cardType;
}
public void setCardType(MealCardType cardType) {
	this.cardType = cardType;
}
public String getPaymentTransactionId() {
	return paymentTransactionId;
}
public void setPaymentTransactionId(String paymentTransactionId) {
	this.paymentTransactionId = paymentTransactionId;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
 
 
  
}
