package exercicios2;

import exercicios1.ContaBancaria;

public class Banco {
	private String nome;
	private String cnpj;
	private Integer numeroDeContas;

	public Banco(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.numeroDeContas = 0;
	}

	public Pessoa cadastrarCliente(String nome, Integer idade, String profissao) {
		return new Pessoa(nome, idade, profissao);
	}

	public ContaBancaria abrirConta(Pessoa pessoa, Double saldo) {
		if (pessoa.getIdade() >= 18) {
			numeroDeContas++;
			System.out.println("Conta aberta com sucesso!");
			return new ContaBancaria(1 + numeroDeContas, pessoa.getNome(), saldo);
		} else {
			System.out.println("Não é possível abrir a conta para um menor de idade.");
			return null;
		}
	}

	public void depositar(ContaBancaria conta, Double saldo) {
		conta.depositar(saldo);
	}

	public void sacar(ContaBancaria conta, Double saldo) {
		conta.sacar(saldo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getNumeroDeContas() {
		return numeroDeContas;
	}

}
