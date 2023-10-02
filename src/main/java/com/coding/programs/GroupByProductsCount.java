package com.coding.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Walmart
public class GroupByProductsCount {

	
	public static Map<String,Long> getProductsGrupByCount(Map<String, List<String>> inputMap){
		//Iterator<List<String>> it= inputMap.values().iterator();
		List<String> productsList=new ArrayList<>();
		for(Iterator<List<String>> it= inputMap.values().iterator();it.hasNext();) {
			productsList.addAll(it.next());
			
		}
		//inputMap.values().stream().collect()
		Map<String,Long> productsCount=productsList
		.stream()
		.collect(Collectors.groupingBy(s->s,Collectors.counting()));
		return productsCount;
	}
	public static void main(String[] args) {
		Map<String, List<String>> inputMap=new HashMap<>();
		inputMap.put("100", List.of("bananas","apples"));
		inputMap.put("101", List.of("bananas","cherries"));
		inputMap.put("102", List.of("apples","apples"));
		inputMap.put("103", List.of("mangos","grapes"));
		
		System.out.println("GroupByProductsCount :"+getProductsGrupByCount(inputMap));
	}

}
