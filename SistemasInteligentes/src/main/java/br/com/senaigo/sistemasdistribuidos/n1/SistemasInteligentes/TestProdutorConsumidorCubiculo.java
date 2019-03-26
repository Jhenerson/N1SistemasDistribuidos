package br.com.senaigo.sistemasdistribuidos.n1.SistemasInteligentes;

public class TestProdutorConsumidorCubiculo {

	public static void main(String[] args) {
		Cubiculo cubiculo = new Cubiculo();

		Consumidor consmidor = new Consumidor(cubiculo);
		Produtor produtor = new Produtor(cubiculo);

		new Thread(consmidor).start();
		new Thread(produtor).start();
	}
}
