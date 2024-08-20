package exercicios2;

import java.util.Random;

public class JogoAdivinhacao {
	private Integer numeroAleatorio;

	public JogoAdivinhacao() {
	}

	public void gerarNumero() {
		Random random = new Random();
		numeroAleatorio = random.nextInt(10);
	}

	public void palpite(Integer palpite) {
		if (palpite == numeroAleatorio) {
			System.out.println("Você está correto!");
		} else {
			System.out.println("Palpite incorreto!");
		}
	}

}
