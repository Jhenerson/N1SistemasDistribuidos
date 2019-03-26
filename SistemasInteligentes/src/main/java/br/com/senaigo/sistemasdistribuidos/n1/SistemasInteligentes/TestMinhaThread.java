package br.com.senaigo.sistemasdistribuidos.n1.SistemasInteligentes;

public class TestMinhaThread {

	public static void main(String[] args) {

		MinhaThread t1 = new MinhaThread("thread#1", 500);
		MinhaThread t2 = new MinhaThread("thread#2", 1000);
		MinhaThread t3 = new MinhaThread("thread#3", 1500);

		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		Thread thread3 = new Thread(t3);
		
		thread1.start();		
		thread2.start();		
		thread3.start();
	
		try {
			thread1.join(5000);
			thread2.join(5000);
			thread3.join(5000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}		
		
		
	}

}
