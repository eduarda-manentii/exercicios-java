package exercicios2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JogoCartas {
	private List<Carta> baralho;
	private List<List<Carta>> maosJogadores;

	public JogoCartas(int numJogadores) {
		baralho = new ArrayList<>();
		maosJogadores = new ArrayList<>();

		String[] naipes = { "Copas", "Ouros", "Espadas", "Paus" };
		String[] valores = { "Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei" };
		for (String naipe : naipes) {
			for (String valor : valores) {
				baralho.add(new Carta(naipe, valor));
			}
		}
		Collections.shuffle(baralho);

		for (int i = 0; i < numJogadores; i++) {
			maosJogadores.add(new ArrayList<>());
		}
	}

	public void distribuirCartas(int numCartasPorJogador) {
		for (int i = 0; i < numCartasPorJogador; i++) {
			for (List<Carta> mao : maosJogadores) {
				if (!baralho.isEmpty()) {
					mao.add(baralho.remove(0));
				}
			}
		}
	}

	public void jogarRodada() {
		for (int i = 0; i < maosJogadores.size(); i++) {
			List<Carta> mao = maosJogadores.get(i);
			if (!mao.isEmpty()) {
				Carta carta = mao.remove(0);
				System.out.println("Jogador " + (i + 1) + " jogou " + carta);
			} else {
				System.out.println("Jogador " + (i + 1) + " não tem mais cartas.");
			}
		}
	}

}
