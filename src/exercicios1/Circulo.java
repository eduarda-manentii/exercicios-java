package exercicios1;

public class Circulo {
	private Double raio;

	public Circulo(Double raio) {
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return 3.14 * (raio * raio);
	}

	public double calcularPerimetro() {
		return 2 * 3.14 * raio;
	}

}
