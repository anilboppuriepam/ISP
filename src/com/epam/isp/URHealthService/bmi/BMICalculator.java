package com.epam.isp.URHealthService.bmi;

public class BMICalculator implements ICalculate{
	
	private double height;
	private double weight;
	private double heightInMeters;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeightInMeters() {
		return heightInMeters;
	}
	public void setHeightInMeters(double heightInMeters) {
		this.heightInMeters = heightInMeters;
	}
	
	public double calculate(){
		
		double heightSquare = (height * height);
		return (weight / heightSquare);
	}
	

}
