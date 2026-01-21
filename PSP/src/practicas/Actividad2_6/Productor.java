package practicas.Actividad2_6;

import java.time.LocalDateTime;

public class Productor extends Thread {
	private static int numProductorGlobal = 0;
	private Fichero archivo;
	private int numProductor;

	public Productor(Fichero archivo) {
		super();
		this.archivo = archivo;
		this.numProductor = getNumProductorGlobal();
		setNumProductorGlobal(getNumProductorGlobal() + 1);
	}

	@Override
	public void run() {

		int cont = 0;
		while (cont < 5) {
			archivo.reescribirFichero();
			try {
				cont++;
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
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
