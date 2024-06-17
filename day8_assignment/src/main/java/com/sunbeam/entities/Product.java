package com.sunbeam.entities;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Category category;
	private String productName;
	private double price;
	private int availableQuantity;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int availableQuantity, Category category, double price, String productName) {
		super();
		this.availableQuantity = availableQuantity;
		this.category = category;
		this.price = price;
		this.productName = productName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", category=" + category + ", productName=" + productName + ", price=" + price
				+ ", availableQuantity=" + availableQuantity + "]";
	}
	
	
	
	
}
