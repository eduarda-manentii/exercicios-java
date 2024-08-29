package exercicios2;

import java.util.ArrayList;
import java.util.List;

public class Postagem {
	private Usuario autor;
    private String conteudo;
    private List<Comentario> comentarios;

    public Postagem(Usuario autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.comentarios = new ArrayList<>();
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }
}
