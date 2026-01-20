package practicas.Actividad2_6;

import java.time.LocalDateTime;

public class Productor extends Thread {
	private static int numProductorGlobal = 0;
	private Fichero archivo;
	private int numProductor;

	public Productor(Fichero archivo) {
		super();
		this.archivo = archivo;
		this.numProductor = numProductorGlobal;
		numProductorGlobal++;
	}

	@Override
	public void run() {
		boolean loConsiguio=false;
		while(!loConsiguio) {
			 archivo.reescribirFichero();
		}
	}

	public static int getNumProductorGlobal() {
		return numProductorGlobal;
	}

	public static void setNumProductorGlobal(int numProductorGlobal) {
		Productor.numProductorGlobal = numProductorGlobal;
	}

	public Fichero getArchivo() {
		return archivo;
	}

	public void setArchivo(Fichero archivo) {
		this.archivo = archivo;
	}

	public int getNumProductor() {
		return numProductor;
	}

	public void setNumProductor(int numProductor) {
		this.numProductor = numProductor;
	}

}
