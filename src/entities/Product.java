package entities;

public class Product {
	
	private String nome;
	private Double preco;
	
	public Product(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	//m�todo est�tico
	public static String staticUpperCaseName(Product p) {
		return p.getNome().toUpperCase();
	}
	
	//m�todo n�o est�tico
	public String naoStaticUpperCaseName() {
		return getNome().toUpperCase();
	}

	@Override
	public String toString() {
		return "Product [nome: " + nome + ", preco: " + preco + "]";
	}
	
	
	
	
	
	
	

}
