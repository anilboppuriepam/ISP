package com.epam.isp.repository;

import java.util.List;

import com.epam.isp.model.Category;
import com.epam.isp.model.Product;

public abstract class IProductContext {

	 private List<Category> categories;
	 private List<Product> products;
	public List<Category> getCategories() {
		return categories;
	}
	public List<Product> getProducts() {
		return products;
	}
	 
	 
	 
}
