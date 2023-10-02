package com.java8.stream.filters;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.features.Item;

public class ItemPriceFilter {

	public static void main(String[] args) {
		List<Item> products=List.of(
				(new Item("Apple", 1, new BigDecimal(100))),
				(new Item("Banana", 1, new BigDecimal(150))),
				(new Item("Bread", 1, new BigDecimal(180))),
				(new Item("Grapes", 1, new BigDecimal(200))),
				(new Item("Pinapple", 5, new BigDecimal(300)))
				);
		List<Item> filteredProducts =products.stream()
		.filter(item->item.getPrice().intValue()>=150)
		.collect(Collectors.toList());
		filteredProducts.stream().forEach(t -> System.out.println(t));
		
		Long totalordersAmount= products.stream()
										.collect(Collectors.summingLong(item -> (item.getQty()*item.getPrice().longValue())));
		System.out.println("Total Order Value\t:"+totalordersAmount);
	}

}
