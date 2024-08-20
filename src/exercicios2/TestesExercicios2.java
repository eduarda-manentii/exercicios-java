package exercicios2;

public class TestesExercicios2 {

	public static void main(String[] args) {
		// Exercício 5: Máquina de Venda
		MaquinaDeVendas maquina = new MaquinaDeVendas();
		maquina.cadastrarProduto("Refrigerante", 3.50, 10);
		maquina.cadastrarProduto("Salgadinho", 2.00, 5);
		maquina.cadastrarProduto("Chocolate", 4.00, 2);
		maquina.exibirEstoque();
		maquina.inserirDinheiro(5.00);
		maquina.selecionarProduto("Chocolate");
		maquina.exibirEstoque();
		double troco = maquina.retornarTroco();
		System.out.println("Troco retornado: " + troco);

		// Exercício 6: Jogo de Cartas
		JogoCartas jogo = new JogoCartas(2);
		jogo.distribuirCartas(5);
		jogo.jogarRodada();

		// Exercício 7: Rede social

		// Exercício 8: Biblioteca
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.cadastrarLivro("Livro A", "Autor A", 100);
		biblioteca.cadastrarLivro("Livro B", "Autor B", 200);
		biblioteca.cadastrarLivro("Livro A", "Autor A", 150);
		biblioteca.verificarDisponibilidade("Livro A", "Autor A");
		biblioteca.pegarEmprestado("Livro A", "Autor A");
		biblioteca.pegarEmprestado("Livro A", "Autor A");
		biblioteca.devolverLivro("Livro A", "Autor A");
		biblioteca.devolverLivro("Livro A", "Autor A");

		// Exercício 9: Calendário

		// Exercício 10: Adivinhação
		JogoAdivinhacao jogoAdivinhacao = new JogoAdivinhacao();
		jogoAdivinhacao.gerarNumero();
		jogoAdivinhacao.palpite(2);
	}
}
