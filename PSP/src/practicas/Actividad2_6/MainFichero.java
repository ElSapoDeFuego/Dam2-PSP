package practicas.Actividad2_6;

import java.io.File;

public class MainFichero {
	public static void main(String[] args) {
		int cont = 0;
		File archivo = new File("horas.txt");
		Fichero fichero = new Fichero(archivo);
		Productor pro1 = new Productor(fichero);
		Consumidor cons1 = new Consumidor(fichero);
		pro1.start();
		cons1.start();
	}
}
