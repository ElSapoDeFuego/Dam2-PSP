package multihilo.ej5;

public class DentroFuera {
	
	public static void main(String[] args) {
		new HiloFor().start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Estoy fuera del hilo");
		}
	}
}
