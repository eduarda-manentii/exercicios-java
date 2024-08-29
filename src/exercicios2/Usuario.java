package exercicios2;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
	private List<Usuario> amigos;
	private List<Postagem> postagens;
	
	public Usuario(String nome) {
	    this.nome = nome;
	    this.amigos = new ArrayList<>();
	    this.postagens = new ArrayList<>();
	}
	
	public String getNome() {
	    return nome;
	}
	
	public List<Usuario> getAmigos() {
	    return amigos;
	}
	
	public List<Postagem> getPostagens() {
	    return postagens;
	}		
	
	public void adicionarAmigo(Usuario amigo) {
	    if (!amigos.contains(amigo)) {
	        amigos.add(amigo);
	        amigo.getAmigos().add(this);
	    }
	}
	
	public Postagem publicarMensagem(String mensagem) {
	    Postagem postagem = new Postagem(this, mensagem);
	    postagens.add(postagem);
	    return postagem;
	}
	
	public void comentarEmPostagem(Postagem postagem, String comentario) {
	    postagem.adicionarComentario(new Comentario(this, comentario));
	}			
}
 