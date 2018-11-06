package aplicacao;

/*
 * Programa que, a partir de uma lista de produtos, 
 * gera uma nova lista contendo os nomes dos produtos em caixa alta.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Programa {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//implementação via expressão lambda declarada
		//func igual a p que recebe o getNome do produto em Upper
		Function<Product,String> func = p -> p.getNome().toUpperCase();
		
		List<String> nomes = list.stream().map(func).collect(Collectors.toList());
		
		nomes.forEach(System.out::println);

	}

}
