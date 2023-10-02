package com.java8.stream.filters;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java8.features.Item;

public class GroupByItemCount {

	public static void main(String[] args) {
		List<Item> products=List.of(
				(new Item("Apple", 1, new BigDecimal(100))),
				(new Item("Banana", 1, new BigDecimal(150))),
				(new Item("Bread", 1, new BigDecimal(180))),
				(new Item("Grapes", 1, new BigDecimal(200))),
				(new Item("Pinapple", 1, new BigDecimal(300))),
				(new Item("Apple", 4, new BigDecimal(500)))
				);
		Map<String, Integer> productQtyMap =products.stream()
									.collect(Collectors.groupingBy(t -> t.getName(),
											Collectors.summingInt(t -> t.getQty())));
		System.out.println("Total Items Count By Product\t\n:"+productQtyMap);
		
		Map<String, Long> productsAmoutMap= products.stream()
									.collect(Collectors.groupingBy(t -> t.getName(),
											Collectors.summingLong(value -> value.getQty()* value.getPrice().longValue())));
		System.out.println("Total Order Value By Product\t\n:"+productsAmoutMap);
									
		
		
	}

}
