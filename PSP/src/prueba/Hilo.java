package prueba;

public class Hilo implements Runnable{
	String color;
	
	public Hilo(String color) {
		super();
		this.color = color;
	System.out.println("Creado");
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hola");
	}
}
