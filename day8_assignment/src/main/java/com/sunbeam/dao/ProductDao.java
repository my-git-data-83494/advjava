package com.sunbeam.dao;

import com.sunbeam.entities.Product;

public interface ProductDao {
	String add(Product product);
	Product getProductDetailsById(Long productId);
}

