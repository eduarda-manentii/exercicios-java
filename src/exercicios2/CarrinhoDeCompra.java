package exercicios2;

import exercicios1.Produto;

public class CarrinhoDeCompra {
	Produto produto;
	Pessoa cliente;
	Integer quantidadeItens;
	Double valorTotal;

	public CarrinhoDeCompra(Produto produto, Pessoa cliente, Integer quantidadeItens) {
		this.produto = produto;
		this.cliente = cliente;
		this.quantidadeItens = quantidadeItens;
		this.valorTotal = produto.getPreco() * quantidadeItens;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public Integer getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(Integer quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
