package exercicios2;

import java.util.ArrayList;
import java.util.List;

import exercicios1.Livro;

public class Biblioteca {
	private List<Livro> acervo;

	public Biblioteca() {
		this.acervo = new ArrayList<>();
	}

	public void cadastrarLivro(String titulo, String autor, int quantidadePaginas) {
		for (Livro livro : acervo) {
			if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.getAutor().equalsIgnoreCase(autor)) {
				System.out.println("Livro já cadastrado.");
				return;
			}
		}
		Livro novoLivro = new Livro(titulo, autor, quantidadePaginas);
		acervo.add(novoLivro);
		System.out.println("Livro cadastrado com sucesso.");
	}

	public void pegarEmprestado(String titulo, String autor) {
		for (Livro livro : acervo) {
			if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.getAutor().equalsIgnoreCase(autor)) {
				if (livro.getDisponivel()) {
					livro.emprestar();
					System.out.println("Empréstimo realizado com sucesso.");
				} else {
					System.out.println("Livro já foi emprestado.");
				}
				return;
			}
		}
		System.out.println("Livro não existe no acervo.");
	}

	public void devolverLivro(String titulo, String autor) {
		for (Livro livro : acervo) {
			if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.getAutor().equalsIgnoreCase(autor)) {
				if (!livro.getDisponivel()) {
					livro.devolver();
					System.out.println("Devolução realizada com sucesso.");
				} else {
					System.out.println("Livro já foi devolvido.");
				}
				return;
			}
		}
		System.out.println("Livro não existe no acervo.");
	}

	public void verificarDisponibilidade(String titulo, String autor) {
		for (Livro livro : acervo) {
			if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.getAutor().equalsIgnoreCase(autor)) {
				livro.verificarDisponibilidade();
				return;
			}
		}
		System.out.println("Livro não existe no acervo.");
	}

}
