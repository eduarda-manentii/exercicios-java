package exercicios1;

public class Produto {
	private String nome;
	private Double  preco;
	private Integer quantidadeEstoque;
	
	public Produto(String nome, Double preco, Integer quantidadeEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
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

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public Double calcularValorTotalEstoque() {
		return preco * quantidadeEstoque;
	}
	
	public Boolean verificarDisponibilidade() {
		if(quantidadeEstoque > 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
