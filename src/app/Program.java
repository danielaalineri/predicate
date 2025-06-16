package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.productPredicate;

public class Program {
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(new productPredicate());
		
		for (Product product : list) {
			System.out.println(product);
			
		}
		
	}
	
	
}
