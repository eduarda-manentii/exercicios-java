package exercicios1;

public class Livro {
	private String titulo;
	private String autor;
	private Integer quantidadePaginas;
	private Boolean disponivel;
	
	public Livro(String titulo, String autor, Integer quantidadePaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.quantidadePaginas = quantidadePaginas;
		this.disponivel = true;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getQuantidadePaginas() {
		return quantidadePaginas;
	}

	public void setQuantidadePaginas(Integer quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}
	
	public boolean getDisponivel() {
		return disponivel;
	}
	
	public void emprestar() {
		if(disponivel) {
			disponivel = false;
		}
	}
	
	public void devolver() {
		if(!disponivel) {
			disponivel = true;
		}
	}
	
	public void verificarDisponibilidade() {
		if(disponivel) {
			System.err.println("O livro está disponível.");
		} else {
			System.err.println("O livro não está disponível.");
		}
	}

}
