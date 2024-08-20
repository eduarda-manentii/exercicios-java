package exercicios2;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
	private List<Contato> contatos;

	public AgendaTelefonica() {
		this.contatos = new ArrayList<>();
	}

	public void adicionarContato(String nome, String telefone) {
		Contato contato = new Contato(nome, telefone);
		contatos.add(contato);
	}

	public void editarContato(String nomeAntigo, String novoNome, String telefoneAntigo, String telefoneNovo) {
		for (Contato contato : contatos) {
			if (contato.getNome().equalsIgnoreCase(nomeAntigo)
					|| contato.getTelefone().equalsIgnoreCase(telefoneAntigo)) {
				contato.setNome(novoNome);
				contato.setTelefone(telefoneNovo);
				System.out.println("Contato editado: " + contato);
				return;
			}
		}
		System.out.println("Contato não encontrado.");
	}

	public void removerContato(String nome, String telefone) {
		for (Contato contato : contatos) {
			if (contato.getNome().equalsIgnoreCase(nome) || contato.getTelefone().equalsIgnoreCase(telefone)) {
				contatos.remove(contato);
				System.out.println("Contato removido: " + contato);
				return;
			}
		}
		System.out.println("Contato não encontrado.");
	}

	public void buscarContato(String nome, String telefone) {
		for (Contato contato : contatos) {
			if (contato.getNome().equalsIgnoreCase(nome) || contato.getTelefone().equalsIgnoreCase(telefone)) {
				System.out.println("Contato encontrado: " + contato);
				return;
			}
		}
		System.out.println("Contato não encontrado.");
	}

}
