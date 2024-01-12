package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListExample {

	public static void main(String[] args) {
		
		//Simple List Object
		List<String> list = new ArrayList<>();
		list.add("One");//0
		list.add("Two");//1
		//list.add(new Date());//2
		//list.add(100); //3
		
		//Dispaly the list items
		for(int i=0;i<list.size();i++) {
			System.out.println("List item #"+i+" ::"+list.get(i));  
			
		}
		
		
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
		
		
		for(int i=0;i<productList.size() ;i++) {
			System.out.println(productList.get(i).toString());
		}
		
		
		//MAp created for holding matched products based on category
		Map<String, List<ProductDTO>> productsGroup = new HashMap<>();

		for(int i=0;i<productList.size() ;i++) {
			
			//Get the current ProductDTO
			ProductDTO productDTO = productList.get(i);
			
			//Check any matched value for a category
			List<ProductDTO> matchedProducts=  productsGroup.get(productDTO.getCategory());
			if(matchedProducts == null) {
				matchedProducts = new ArrayList<>();
				matchedProducts.add(productDTO);
				productsGroup.put(productDTO.getCategory(), matchedProducts);
			}else {
				matchedProducts.add(productDTO);
				productsGroup.put(productDTO.getCategory(), matchedProducts);
			}
		}
		
		//Display the grouping result.
		
		System.out.println("No Of Groups Should Be 2 Only ::" +productsGroup.size());
		//System.out.println("Result \t:"+productsGroup);
		productsGroup.entrySet().forEach(entry -> System.out.println(entry));
		//Group by category
			//Where key should by category
				//Value should be List of ProductDTOs
		
		
		List<ProductDTO> filteresList = new ArrayList<>();
		System.out.println("## PRODUCTS WHOSE PROCE IS >= 1000 ##");
		for(int i=0;i<productList.size() ;i++) {
			if(productList.get(i).getPrice() >=1000) {
				filteresList.add(productList.get(i));
				System.out.println(productList.get(i).toString());
			}
			
		}
	}

}
