package exercicios1;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
	private String nome;
	private Integer idade;
	private List<Consulta> historicoConsultas = new ArrayList<>();;
	
	public Paciente(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
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
	
	public List<Consulta> getHistoricoConsultas() {
		return historicoConsultas;
	}
	
	public void setHistoricoConsultas(List<Consulta> historicoConsultas) {
		this.historicoConsultas = historicoConsultas;
	}
	
	public void adicionarConsulta(String data, String tipo, Double preco) {
		Consulta consulta = new Consulta(data, tipo, preco);
		historicoConsultas.add(consulta);
	}
	
	public void exibirConsultas() {
		for (Consulta consulta : historicoConsultas) {
			System.out.println("Consulta -> Data: " + consulta.getData() + 
					" Tipo: " + consulta.getTipo() + 
					" Preço: " + consulta.getPreco());
		}
	}

}
