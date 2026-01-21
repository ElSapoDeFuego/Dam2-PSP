package practicas.Actividad2_6;

import java.io.File;

public class MainFichero {
	public static void main(String[] args) {
		int cont = 0;
		File archivo = new File("hola.txt");
		Fichero fichero = new Fichero(archivo);
		while (cont < 6) {
			Productor pro1 = new Productor(fichero);
			Consumidor cons1 = new Consumidor(fichero);
			pro1.start();
			cons1.start();
			try {
				pro1.join();
				cons1.join();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cont++;

		}
	}
}
