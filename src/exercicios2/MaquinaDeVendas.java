package exercicios2;

import java.util.ArrayList;
import java.util.List;

import exercicios1.Produto;

public class MaquinaDeVendas {
	private List<Produto> estoque;
	private double saldo;

	public MaquinaDeVendas() {
		this.estoque = new ArrayList<>();
		this.saldo = 0.0;
	}

	public void cadastrarProduto(String nome, double preco, int quantidade) {
		Produto produto = new Produto(nome, preco, quantidade);
		estoque.add(produto);
	}

	public void selecionarProduto(String nome) {
		Produto produtoSelecionado = null;

		for (Produto produto : estoque) {
			if (produto.getNome().equalsIgnoreCase(nome)) {
				produtoSelecionado = produto;
				break;
			}
		}

		if (produtoSelecionado == null) {
			System.out.println("Produto não encontrado.");
		} else if (produtoSelecionado.getQuantidadeEstoque() == 0) {
			System.out.println("Produto esgotado.");
		} else if (saldo < produtoSelecionado.getPreco()) {
			System.out.println("Saldo insuficiente. Insira mais dinheiro.");
		} else {
			produtoSelecionado.setQuantidadeEstoque(produtoSelecionado.getQuantidadeEstoque() - 1);
			saldo -= produtoSelecionado.getPreco();
			System.out.println("Você comprou: " + produtoSelecionado.getNome());
			System.out.println("Troco: " + saldo);
			saldo = 0.0;
		}
	}

	public void inserirDinheiro(double valor) {
		saldo += valor;
		System.out.println("Você inseriu: " + valor + ". Saldo atual: " + saldo);
	}

	public double retornarTroco() {
		double troco = saldo;
		saldo = 0.0;
		return troco;
	}

	public void exibirEstoque() {
		System.out.println("Estoque atual:");
		for (Produto produto : estoque) {
			System.out.println(produto.getNome() + " - Preço: " + produto.getPreco() + " - Quantidade: "
					+ produto.getQuantidadeEstoque());
		}
	}
}
