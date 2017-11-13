package com.epam.isp.repository;

import java.util.List;

import com.epam.isp.model.IProductRepository;
import com.epam.isp.model.Product;

public class ProductRepository implements IProductRepository{

	private IProductContext dbContext;
	
	
	public ProductRepository(IProductContext dbContext) {
		this.dbContext = dbContext;
	}


	@Override
	public List<Product> getAllProducts() {
		List<Product> products = dbContext.getProducts();
		return products;
	}
	
	

}
