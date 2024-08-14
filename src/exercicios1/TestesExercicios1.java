package exercicios1;

import java.util.ArrayList;
import java.util.List;

public class TestesExercicios1 {

	public static void main(String[] args) {
		//Exercicio 1: Círculo
		Circulo circulo = new Circulo(2.5);
		Double perimetroDoCirculo = circulo.calcularPerimetro();
		Double areaDoCirculo = circulo.calcularArea();
		System.err.println("O perímetro do Círculo é: " + perimetroDoCirculo);
		System.err.println("A área do Círculo é: " + areaDoCirculo);
		
		//Exercício 2: ContaBancária
		ContaBancaria contaBancaria = new ContaBancaria(666, "Eduarda Manenti", 6.5);
		contaBancaria.depositar(5623.5);
		contaBancaria.sacar(100.6);
		System.out.println("O saldo atual da conta da titular " 
			+ contaBancaria.getNomeTitular() 
			+ " é: R$" + contaBancaria.getSaldo());
		
		//Exercício 3: Retângulo
		Retangulo retangulo = new Retangulo(10.6, 18.0);
		Double perimetroDoRetangulo = retangulo.calcularPerimetro();
		Double areaDoRetangulo = retangulo.calcularArea();
		System.err.println("O perímetro do Retangulo é: " + perimetroDoRetangulo);
		System.err.println("A área do Retangulo é: " + areaDoRetangulo);
		
		//Exercício 4: Aluno
		List<Double> notas = new ArrayList<>();
		notas.add(10.0);
		notas.add(8.7);
		notas.add(5.3);
		Aluno aluno = new Aluno("Eduarda Nunes Manenti", 1245885, notas);
		Double media = aluno.calcularMedia();
		System.err.println("A média do aluno é: " + media);
		
		//Exercício 5: Funcionário
		Funcionario funcionario = new Funcionario("Eduarda Manenti", 1500.0,"Chefe", 12.0, 100.5);
		Double salario = funcionario.calcularSalarioLiquido();
		System.out.println("O salário do funcionário é: R$" + salario);
		
		//Exercício 6: Produto
		Produto produto = new Produto("Livro", 35.8, 3);
		Double valorTotal = produto.calcularValorTotalEstoque();
		System.out.println("O Valor da quantidade total do produto é: " + valorTotal + "R$");
		
		//Exercício 7: Triangulo
		Triangulo triangulo = new Triangulo(2.0, 2.0, 2.0);
		Double areaDoTriangulo = triangulo.calcularAltura();
		System.out.println("A área do Triangulo é: " + areaDoTriangulo);
		
		//Exercício 8: Carro
		Carro carro = new Carro("Dudas", "dudinkas", 100.5);
		carro.acelerar(20.5);
		carro.frear(5.2);
		carro.exibirInformacoes();

		//Exercício 9: Paciente
		Paciente paciente = new Paciente("Eduarda Manenti", 20);
		paciente.adicionarConsulta("14/08/2024", "Dentista", 120.3);
		paciente.adicionarConsulta("11/05/2024", "Oftamologista", 302.3);
		paciente.exibirConsultas();
		
		//Exercício 10: Livro
		Livro livro = new Livro("Amar é assim", "Eduarda Manenti", 400);
		livro.devolver();
		livro.emprestar();
		livro.emprestar();
		livro.devolver();
		livro.verificarDisponibilidade();
		

	}

}
