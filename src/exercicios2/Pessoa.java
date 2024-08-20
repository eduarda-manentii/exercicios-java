package exercicios2;

public class Pessoa {
	private String nome;
	private Integer idade;
	private String profissao;

	public Pessoa(String nome, Integer idade, String profissao) {
		this.nome = nome;
		this.idade = idade;
		this.profissao = profissao;
	}

	public int calcularAnosBissextos() {
		int anosBissextos = 0;
		int anoAtual = 2024;
		int anoNascimento = anoAtual - idade;

		for (int ano = anoNascimento; ano <= anoAtual; ano++) {
			if (isAnoBissexto(ano)) {
				anosBissextos++;
			}
		}

		return anosBissextos;
	}

	private boolean isAnoBissexto(int ano) {
		return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
	}

	public void exibirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Profissão: " + profissao);
		System.out.println("Anos bissextos vividos: " + calcularAnosBissextos());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
