package exercicios1;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private Integer matricula;
    private List<Double> notas = new ArrayList<>();
    
    private Double media;

	public Aluno(String nome, Integer matricula, List<Double> notas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public List<Double> getNotas() {
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}
	
	public Double calcularMedia() {
		Double somaNotas = 0.0;
		for (Double nota : notas) {
			somaNotas += nota;
		}
		media = somaNotas / notas.size();
		return media;
	}
	
	public String verificarSituacao() {
		if(media >= 7) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
		
	}

}
