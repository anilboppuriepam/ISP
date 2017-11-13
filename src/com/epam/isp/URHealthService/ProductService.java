package com.epam.isp.URHealthService;

import java.util.List;

import com.epam.isp.model.IProductRepository;
import com.epam.isp.model.Product;

public class ProductService {
 
	private IProductRepository productRepository;
	
	public ProductService(IProductRepository productRepository){
		
		this.productRepository = productRepository;
	}

	 public List<Product> getAllProducts(){
		 List<Product> products = productRepository.getAllProducts();
		 return products;
	 }
}
