package practicas.Actividad2_6;

public class Consumidor extends Thread {
	private static int numConsumidorGlobal = 0;
	private Fichero archivo;
	private int numConsumidor;

	public Consumidor(Fichero archivo) {
		super();
		this.archivo = archivo;
		this.numConsumidor = getNumConsumidor();
		setNumConsumidorGlobal(getNumConsumidorGlobal()+1);
	}
	
	@Override
	public void run() {
		archivo.leerFichero();
		try {
		Thread.sleep(2000);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int getNumConsumidorGlobal() {
		return numConsumidorGlobal;
	}

	public static void setNumConsumidorGlobal(int numConsumidorGlobal) {
		Consumidor.numConsumidorGlobal = numConsumidorGlobal;
	}

	public Fichero getArchivo() {
		return archivo;
	}

	public void setArchivo(Fichero archivo) {
		this.archivo = archivo;
	}

	public int getNumConsumidor() {
		return numConsumidor;
	}

	public void setNumConsumidor(int numConsumidor) {
		this.numConsumidor = numConsumidor;
	}

}
