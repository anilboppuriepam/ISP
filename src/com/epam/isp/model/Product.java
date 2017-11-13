package com.epam.isp.model;

public class Product {

	 private String name;
	 private double price;
	 private int id;
	 private Category mealCategory;
	 private int calories;
	public Product(int id, String name, double price, Category category,
			int calories) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.setMealCategory(category);
		this.calories = calories;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public Category getMealCategory() {
		return mealCategory;
	}
	public void setMealCategory(Category mealCategory) {
		this.mealCategory = mealCategory;
	}
	 
	 
}
