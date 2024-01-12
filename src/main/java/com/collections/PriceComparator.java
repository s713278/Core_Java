package com.collections;

import java.util.Comparator;

public class PriceComparator implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		return (int)(o2.getPrice() - o1.getPrice());
	}

}
