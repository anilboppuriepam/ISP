package com.epam.isp.repository;

import java.util.ArrayList;
import java.util.List;

import com.epam.isp.model.Category;
import com.epam.isp.model.Product;

public class ProductContext extends IProductContext {

	List<com.epam.isp.model.Category> categories;
	List<Product> products;
	
	public ProductContext(){
	categories  =new ArrayList<>();
	
	Category   morningMeals  = new  Category (1, "Breakfast");
     Category  afternoonMeals = new  Category( 2,"Lunch" );
       Category eveningMeals =  new  Category( 3,  "Dinner");
      
      categories.add(morningMeals);
      categories.add(afternoonMeals);
      categories.add(eveningMeals);
      
      products =  new ArrayList<>();
      
      products.add(new Product (1, "li", 30, morningMeals,400));
      products.add(new Product ( 2, "Bread Omlet",25, morningMeals,  500));
      products.add(new Product ( 3, "Dosa", 35,morningMeals,600));

      products.add(new Product (4, "Chicken",  90,  afternoonMeals, 800));
      products.add(new Product ( 5,  "Pure Veg", 75, afternoonMeals, 700 ));
      products.add(new Product ( 6,   "Tuna Meals", 150, afternoonMeals, 900 ));

      products.add(new Product (7,   "Boneless Chicken",   100,   eveningMeals, 500));
      products.add(new Product (8,   "Pure veg with roti",   25,   eveningMeals, 450));
      products.add(new Product ( 9,   "Evening Dosa",   35,   eveningMeals,550));
	}
	@Override
	public List<Category> getCategories() {
		
		return categories;
	}

	@Override
	public List<Product> getProducts() {
		
		return products;
	}
}
