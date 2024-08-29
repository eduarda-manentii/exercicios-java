package exercicios2;

import java.util.HashMap;
import java.util.Map;

public class RedeSocial {
	private Map<String, Usuario> usuarios;

    public RedeSocial() {
        this.usuarios = new HashMap<>();
    }

    public Usuario cadastrarUsuario(String nome) {
        if (!usuarios.containsKey(nome)) {
            Usuario usuario = new Usuario(nome);
            usuarios.put(nome, usuario);
            return usuario;
        }
        return null;
    }

    public Usuario buscarUsuario(String nome) {
        return usuarios.get(nome);
    }

    public void exibirPostagensDeUsuario(String nome) {
        Usuario usuario = buscarUsuario(nome);
        if (usuario != null) {
            System.out.println("Postagens de " + nome + ":");
            for (Postagem postagem : usuario.getPostagens()) {
                System.out.println(postagem.getConteudo());
                for (Comentario comentario : postagem.getComentarios()) {
                    System.out.println("  - " + comentario.getAutor().getNome() + ": " + comentario.getConteudo());
                }
            }
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
}
