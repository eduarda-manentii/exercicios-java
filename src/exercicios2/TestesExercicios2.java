package exercicios2;

import java.time.LocalDate;

import exercicios1.ContaBancaria;
import exercicios1.Produto;

public class TestesExercicios2 {

	public static void main(String[] args) {
		// Exercício 1: Pessoa
		Pessoa pessoa = new Pessoa("Eduarda", 20, "programadora");
		pessoa.calcularAnosBissextos();
		pessoa.exibirInformacoes();
		
		//Exercícios 2: Banco
		Banco banco = new Banco("Nubank", "231355");
		ContaBancaria conta = banco.abrirConta(pessoa, 1500.50);
		banco.depositar(conta, 100.60);
		banco.sacar(conta, 50.10);
		
		//Exercícios 3: Loja Virtual
		LojaVirtual lojaVirtual = new LojaVirtual();
		Produto pao = lojaVirtual.cadastrarProduto("Pão Frânces", 1.50, 50);
		CarrinhoDeCompra carrinho = lojaVirtual.gerarCarrinhoDeCompra(pao, pessoa, 10);
		if(carrinho != null) {
			lojaVirtual.aplicarDescontos(carrinho);
			lojaVirtual.calcularValorTotal(carrinho);
		}
		
		//Exercícios 4: Agenda
		AgendaTelefonica agenda = new AgendaTelefonica();
		agenda.adicionarContato("Eduarda", "48991582108");
		Contato contato = agenda.buscarContato("Eduarda", "48991582108");
		agenda.editarContato(contato, "Eduarda Manenti", "48991503020");
		
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
		RedeSocial redeSocial = new RedeSocial();
        Usuario usuario1 = redeSocial.cadastrarUsuario("Alice");
        Usuario usuario2 = redeSocial.cadastrarUsuario("Bob");
        Usuario usuario3 = redeSocial.cadastrarUsuario("Charlie");
        usuario1.adicionarAmigo(usuario2);
        usuario1.publicarMensagem("Olá, mundo!");
        Postagem postagem1 = usuario2.publicarMensagem("Bom dia!");
        Postagem postagem2 = usuario3.publicarMensagem("Como vai?");
        usuario2.comentarEmPostagem(postagem1, "Oi Alice!");
        usuario3.comentarEmPostagem(postagem2, "Bom dia, Bob!");
        redeSocial.exibirPostagensDeUsuario("Alice");
        redeSocial.exibirPostagensDeUsuario("Bob");

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
		Calendario calendario = new Calendario();
        calendario.exibirCalendarioMes(2024, 8);
        LocalDate natal = LocalDate.of(2024, 12, 25);
        if (calendario.isFeriado(natal)) {
            System.out.println(natal + " é feriado: " + calendario.obterNomeFeriado(natal));
        } else {
            System.out.println(natal + " não é feriado.");
        }
        LocalDate dataInicial = LocalDate.of(2024, 1, 1);
        LocalDate dataFinal = LocalDate.of(2024, 12, 31);
        long diferencaDias = calendario.calcularDiferencaDias(dataInicial, dataFinal);
        System.out.println("Diferença em dias: " + diferencaDias);

		// Exercício 10: Adivinhação
		JogoAdivinhacao jogoAdivinhacao = new JogoAdivinhacao();
		jogoAdivinhacao.gerarNumero();
		jogoAdivinhacao.palpite(2);
	}
}
