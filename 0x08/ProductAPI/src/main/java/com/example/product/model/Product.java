package com.example.product.model;

import io.swagger.annotations.Api;

import java.math.*;
import java.time.LocalDateTime;
import java.util.*;

public class Product {
	
	private Long id;
	private String code;
	private String name;
	private String description;
	private BigDecimal price;
	private LocalDateTime createdOne;
	private Boolean status;
	
	public Product(){}
	
	public Product(Long id, String code, String name, String description, BigDecimal price, LocalDateTime createdOne, Boolean status) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.description = description;
		this.price = price;
		this.createdOne = createdOne;
		this.status = status;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if (!(o instanceof Product)) return false;
		
		Product product = (Product) o;
		
		if (!Objects.equals(id, product.id)) return false;
		if (!Objects.equals(code, product.code)) return false;
		if (!Objects.equals(name, product.name)) return false;
		if (!Objects.equals(description, product.description)) return false;
		if (!Objects.equals(price, product.price)) return false;
		if (!Objects.equals(createdOne, product.createdOne)) return false;
		return (!Objects.equals(status, product.status));
	}
	
	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (code != null ? code.hashCode() : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (price != null ? price.hashCode() : 0);
		result = 31 * result + (createdOne != null ? createdOne.hashCode() : 0);
		result = 31 * result + (status != null ? status.hashCode() : 0);
		return result;
		}
	
	@Override
	public String toString() {
		return "Product{" + "id=" + id + ", code='" + code + '\'' + ", name='" + name + '\'' + 
								", description='" + description + '\'' + ", price=" + price + 
								", createdOne=" + createdOne + ", status=" + status + '}';
	}
}