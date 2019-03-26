package br.com.senaigo.sistemasdistribuidos.n1.SistemasInteligentes;

public class MinhaThread implements Runnable {

	private String nome;
	private long tempo;

	public MinhaThread(String nome, long tempo) {
		this.nome = nome;
		this.tempo = tempo;
	}

	public void run() {

		boolean interrupt = false;

		try {

			for (int i = 0; i < 5; i++) {
				System.out.println(nome + " contador: " + i);
				Thread.sleep(tempo);

			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		System.out.println(nome + " finalizado.");
	}
}
