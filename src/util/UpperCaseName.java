package util;

import java.util.function.Function;

import entities.Product;

//Function possui dois tipos, Function <Entrada;Saida> 
public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getNome().toUpperCase();
	}

}
