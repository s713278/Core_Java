package com.collections;


public class ProductDTO {

	private int id;
	private String name;
	private float price;
	private String category;
	
	public ProductDTO() {
		super();
	}

	public ProductDTO(int id, String name, float price,String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category =category;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", price=" + price+"]";
	}
	
	
	
}
