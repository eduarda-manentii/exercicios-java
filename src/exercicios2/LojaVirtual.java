package exercicios2;

import exercicios1.Produto;

public class LojaVirtual {

	public Produto cadastrarProduto(String nomeProduto,  Double preco, Integer quantidadeEstoque) {
		return new Produto(nomeProduto, preco, quantidadeEstoque);
	}

	public CarrinhoDeCompra gerarCarrinhoDeCompra(Produto produto, Pessoa cliente, Integer quantidadeItens) {
		if(produto.getQuantidadeEstoque() <= quantidadeItens) {
			produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidadeItens);
			return new CarrinhoDeCompra(produto, cliente, quantidadeItens);
		} else {
			System.out.println("Quantidade suficiente do item em estoque.");
			return null;
		}
	}

	public void aplicarDescontos(CarrinhoDeCompra carrinhoDeCompra) {
	    double valorTotal = carrinhoDeCompra.getValorTotal();
	    if (valorTotal > 50) {
	        carrinhoDeCompra.setValorTotal(valorTotal * 0.85);
	    } else if (valorTotal > 30) {
	        carrinhoDeCompra.setValorTotal(valorTotal * 0.90);
	    } else if (valorTotal > 10) {
	        carrinhoDeCompra.setValorTotal(valorTotal * 0.95);
	    } else {
	        System.out.println("Valor total não elegível para descontos.");
	    }
	}

	public Double calcularValorTotal(CarrinhoDeCompra carrinhoDeCompra) {
			return carrinhoDeCompra.getValorTotal();
	}

}
