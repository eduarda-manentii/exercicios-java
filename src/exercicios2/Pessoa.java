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
	//Para ser bissexto, o ano deve ser:
	//->Divisível por 4. Sendo assim, a divisão é exata com o resto igual a zero;
	//->Não pode ser divisível por 100. Com isso, a divisão não é exata, ou seja, deixa resto diferente de zero;
	//->Pode ser que seja divisível por 400. Caso seja divisível por 400, a divisão deve ser exata, deixando o resto igual a zero.
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
