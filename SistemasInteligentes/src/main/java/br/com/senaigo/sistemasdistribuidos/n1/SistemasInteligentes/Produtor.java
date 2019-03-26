package br.com.senaigo.sistemasdistribuidos.n1.SistemasInteligentes;

import java.util.Random;

public class Produtor implements Runnable {

	Cubiculo cubiculo = new Cubiculo();

	public Produtor(Cubiculo cub) {
		this.cubiculo = cub;
	}

	public void gerarPalavra() {
		Random gerador = new Random();
		String palavra = "";
		for (int i = 0; i < 5; i++) {
			char aux = (char) (gerador.nextInt(26) + 65);
			palavra += aux;

		}
		cubiculo.amarzenarPalavra("Produtor", palavra);
		System.out.println("Palavra gerada == \"" + palavra + "\"");
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			gerarPalavra();
		}
	}

}