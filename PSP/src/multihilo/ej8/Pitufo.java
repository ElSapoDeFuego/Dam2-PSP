package multihilo.ej8;

public class Pitufo implements Runnable {
	private String nombre;

	public Pitufo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void run() {
		for (int i = 1; i < 4; i++) {
			System.out.println(nombre + " come un " + i + "º pan con queso");
		}
		System.out.println(nombre+" terminó");
	}

}
