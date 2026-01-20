package multihilo.ej4;

public class VariosHilosR implements Runnable {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			Thread hilo = new Thread(new HiloCR(i));
			hilo.start();
		}
		System.out.println("Todos los hilos creados");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
