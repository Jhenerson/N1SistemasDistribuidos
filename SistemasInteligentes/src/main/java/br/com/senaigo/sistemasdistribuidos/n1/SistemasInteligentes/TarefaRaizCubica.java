package br.com.senaigo.sistemasdistribuidos.n1.SistemasInteligentes;

public class TarefaRaizCubica implements Runnable {

	private int tempo = 0;
	private String nome;

	public TarefaRaizCubica(String nome, int tempo) {
		this.tempo = tempo;
		this.nome = nome;
	}

	public void run() {
		try {
			for (int i = 2; i < 1001; i++) {
				if (i % 2 == 0) {
					if (i % 20 == 0) {
						System.out.println("A raiz cúbica de " + (int) i + " é " + Math.cbrt(i));
					}
				}
				Thread.sleep(tempo);
			}

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(nome + " Finalizou.");

	}

}
