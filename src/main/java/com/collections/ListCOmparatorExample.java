package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListCOmparatorExample {

	public static void main(String[] args) {

		// Simple List Object

		// Add products to List
		List<ProductDTO> productList = new ArrayList<>();

		ProductDTO dto = new ProductDTO();
		dto.setId(1);
		dto.setName("IPhone-12");
		dto.setPrice(1000);
		dto.setCategory("Mobile");
		// Adding dto to productList
		productList.add(dto);
		productList.add(new ProductDTO(5, "OPPO", 1250, "Phone"));
		productList.add(new ProductDTO(2, "Samsung#1", 750, "Mobile"));
		productList.add(new ProductDTO(3, "Google Nexus 1", 1250, "Phone"));
		productList.add(new ProductDTO(4, "Google Nexus 2", 500, "Phone"));

		System.out.println(" DEFAULT DISPALYE ORDER");
		for (int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i).toString());
		}
		
		System.out.println(" DISPLAY THE PRODUCTS BY PRICE");
		productList.sort(new PriceComparator());
		for (int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i).toString());
		}
		

	}

}
