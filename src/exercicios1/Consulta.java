package exercicios1;

public class Consulta {
	private String data;
	private String tipo;
	private Double preco;
	
	public Consulta(String data, String tipo, Double preco) {
		this.data = data;
		this.tipo = tipo;
		this.preco = preco;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
}
