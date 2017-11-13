package com.epam.isp.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import com.epam.isp.URHealthService.ProductService;
import com.epam.isp.URHealthService.bmi.BMICalculator;
import com.epam.isp.URHealthService.message.IMessage;
import com.epam.isp.URHealthService.message.Mail;
import com.epam.isp.URHealthService.message.SMS;
import com.epam.isp.URHealthService.payment.MealCardType;
import com.epam.isp.URHealthService.payment.PaymentRequest;
import com.epam.isp.URHealthService.payment.PaymentResponse;
import com.epam.isp.URHealthService.payment.PaymentService;
import com.epam.isp.model.IProductRepository;
import com.epam.isp.model.Product;
import com.epam.isp.repository.IProductContext;
import com.epam.isp.repository.ProductContext;
import com.epam.isp.repository.ProductRepository;
import com.epam.isp.URHealthService.bmi.BMICategory;

public class ISPDemo {

	public static void main(String[] args) {
		IProductContext productContext = new ProductContext();
		IProductRepository productRepository = new ProductRepository(productContext);
		ProductService productService = new ProductService(productRepository);
		
		List<Product> products = productService.getAllProducts();
		System.out.println("***************************** UR Health BMI Calculator ***********************************");
		System.out.println("*****************************  BMI Categories  ***********************************");
		System.out.println(" Underwieght <= 18.5 \n  Normal weight > 18.5 and <= 24.9 \n  Overweight > 25 and <= 29.9 \n Obesity >= 30 ");
		System.out.println("***************************** End of BMI Categories ******************************");
		
		BMICalculator calculateBMI = new BMICalculator();
		System.out.println("Eneter weidht in kilograms :");
		Scanner scanner = new Scanner(System.in);
		double weight = scanner.nextDouble();
		System.out.println("Etner height in meters: ");
		double height = scanner.nextDouble();
		
		double bmi = calculateBMI.calculate();
		
		System.out.printf("Your BMI is:  %d: and BMI Catefory: %s, bmi",com.epam.isp.URHealthService.bmi.BMICategory.getBMICategory(bmi));
		
		System.out.println("*****************      *************************");
		System.out.println("************************** UR Health Store - Meal Plans *******************************");
		
		for(Product product:  products){
			
			System.out.printf("Meal  %s, Name : %s, Price Rs.%d Calories: %s", product.getMealCategory().getName(), product.getName(),product.getPrice(), product.getCalories());
			
		}
		
		System.out.println("*************************  **********************   *********************");
		System.out.println("Choose the meal name to place order");
		String productName = scanner.nextLine();
		
	     //products.toArray()<Product>().Find(x => x.Name.Contains(productName));
		
		Product selectedProduct = null;
		
		for(Product tempProduct : products){
			
			 if(tempProduct.getName().equals(productName))
				 selectedProduct = tempProduct;
				 
		}
		
		System.out.printf("You have choosen meal: %s, and price is Rs.%d", "XXXX", 0000);
		System.out.println("****************      ******************     ***********************");
		
		System.out.println("Our store supports Zeta / Sodexho. ");
		System.out.println("Please enter your card type to proceed for payment ....");
		String cardType = scanner.nextLine();
		System.out.println("**************    **********************   ***************");
		PaymentRequest paymentRequest = new PaymentRequest();
		paymentRequest.setAmount(selectedProduct.getPrice());
		
		if(cardType.equals("Sodexho"))
			paymentRequest.setCardType(MealCardType.SODEX);
		else if (cardType.equals("Zeta"))
			paymentRequest.setCardType(MealCardType.ZETA);
		
		//paymentRequest.setPaymentTransactionId("URHealth" + Guid.newGuid().toString());
		
		PaymentService paymentService = new PaymentService();
	    PaymentResponse paymentResponse = paymentService.pay(paymentRequest);
	    String status = (paymentResponse.isSucces() ? "Thank you for your payment! Your transaction is successful. You'll receive UR meal pack in 1 hour.": "Your card is declined, please refer your transaction id in future communication ."+ paymentRequest.getPaymentTransactionId());
	    System.out.println(status + " \n Transaction message:  " + paymentResponse.getMessage());
	    System.out.println("Would like to receive receipt through e-mail or SMS ");
	    String msgChoice = scanner.nextLine();
	    IMessage messageObject = null;
	    boolean isSent = false;
	    String msgResponse = "Receipt is not delivered";
	    
	    if(msgChoice.equals("e-mail")){
	    	
	    	  messageObject = new Mail();
	    	  isSent = messageObject.send();
	    	  msgResponse = isSent ? "E-mail is successfully sent with URHealth receipt" : "E-mail was not delivered"; 
	         
	    }else if(msgChoice.equals("sms")){
	    	 messageObject = new SMS();
	    	 msgResponse = isSent ? "E-mail is successfully sent with URHealth receipt" : "E-mail was not delivered";
	    	
	    }
	    System.out.println(msgResponse);
	    System.out.println("************************      *************************    *************************************");
	    scanner.next();
	}
}
