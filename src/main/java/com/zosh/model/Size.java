package com.zosh.model;

public class Size {
	private String name;
	private Integer quantity;
	
	
	public Size() {
		
	}
	public Size(String name, Integer quantity) {
		
		this.name = name;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Size [name=" + name + ", quantity=" + quantity + "]";
	}
	
	
}
