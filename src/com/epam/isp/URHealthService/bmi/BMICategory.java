package com.epam.isp.URHealthService.bmi;

public class BMICategory {

	public static String getBMICategory(double bmiValue){
		
		String bmiCategory = "";
		
		if(bmiValue <= 18.5)
			bmiCategory = "Under weight";
		else if(bmiValue > 18.5 && bmiValue <=24.9)
			bmiCategory = "Normal weight";
		else if (bmiValue > 25 && bmiValue < 29.9) 
			bmiCategory = "Over weight";
			else
				bmiCategory = "Obesity";
		     return bmiCategory;	
		
	}
}
