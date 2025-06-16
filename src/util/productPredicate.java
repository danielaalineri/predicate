package util;

import java.util.function.Predicate;

import entities.Product;

public class productPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPreco() >= 100.0;
	}

}
