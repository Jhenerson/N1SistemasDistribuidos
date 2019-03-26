package br.com.senaigo.sistemasdistribuidos.n1.SistemasInteligentes;

public class TarefaRaizQuadrada implements Runnable {
	private int tempo = 0;
	private String nome;

	TarefaRaizQuadrada(String nome ,int tempo) {
		this.tempo = tempo;
		this.nome = nome;
	}

	public void run() {
		try {
			for (double i = 1; i <= 99; i++) {
				if (i % 2.0 != 0) {
					System.out.println("A raiz quadrada de " + (int)i +" é "+ Math.sqrt(i));
					Thread.sleep(tempo);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(nome + " Finalizou");

	}

}
