package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListContainsExample {

	public static void main(String[] args) {
		
		//Simple List Object
		List<String> list = new ArrayList<>();
		list.add("One");//0
		list.add("Two");//1
		list.add("Dean");//2
		//list.add(100); //3
		
		System.out.println("IS dean exited in list ?"+list.contains("Dean") + " Index is "+list.indexOf("Dean"));
		System.out.println("IS ___dean exited in list ?"+list.contains("____Dean")+ " Index is "+list.indexOf("____Dean"));
		
	
		
		//Add products to List
		List<ProductDTO> productList=new ArrayList<>();
		
		ProductDTO dto = new ProductDTO();
		dto.setId(1);
		dto.setName("IPhone-12");
		dto.setPrice(1000);
		dto.setCategory("Mobile");
		
		//Adding dto to productList
		productList.add(dto);
		productList.add(new ProductDTO(5, "OPPO", 1250,"Phone"));
		productList.add(new ProductDTO(2, "Samsung#1", 750,"Mobile"));
		productList.add(new ProductDTO(3, "Google Nexus 1", 1250,"Phone"));
		productList.add(new ProductDTO(4, "Google Nexus 2", 500,"Phone"));
		
		
		
		System.out.println("Is dto existed ??"+productList.contains(dto) + " Index ::"+productList.indexOf(dto));
	}

}
