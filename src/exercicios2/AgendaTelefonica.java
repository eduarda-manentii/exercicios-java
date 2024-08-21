package exercicios2;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
	private List<Contato> contatos;

	public AgendaTelefonica() {
		this.contatos = new ArrayList<>();
	}

	public Contato adicionarContato(String nome, String telefone) {
		Contato contato = new Contato(nome, telefone);
		contatos.add(contato);
		return contato;
	}

	public void editarContato(Contato contato, String novoNome, String telefoneNovo) {
		for (Contato contato2 : contatos) {
			if (contato2.getNome().equalsIgnoreCase(contato.getNome())
					|| contato.getTelefone().equalsIgnoreCase(contato.getTelefone())) {
				contato2.setNome(novoNome);
				contato2.setTelefone(telefoneNovo);
				System.out.println("Contato editado: " + contato2.getNome());
				return;
			}
		}
		System.out.println("Contato não encontrado.");
	}

	public void removerContato(String nome, String telefone) {
		for (Contato contato : contatos) {
			if (contato.getNome().equalsIgnoreCase(nome) || contato.getTelefone().equalsIgnoreCase(telefone)) {
				contatos.remove(contato);
				System.out.println("Contato removido: " + contato.getNome());
				return;
			}
		}
		System.out.println("Contato não encontrado.");
	}

	public Contato buscarContato(String nome, String telefone) {
		for (Contato contato : contatos) {
			if (contato.getNome().equalsIgnoreCase(nome) || contato.getTelefone().equalsIgnoreCase(telefone)) {
				System.out.println("Contato encontrado: " + contato.getNome());
				return contato;
			}
		}
		System.out.println("Contato não encontrado.");
		return null;
	}

}
