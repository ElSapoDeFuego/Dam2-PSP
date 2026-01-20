package prueba;

public class hiloExamen {
public static void main(String[] args) {
	Thread hola = new Thread(new Hilo("negro"));
	hola.start();
	System.out.println(hola.getState());
	try {
		Thread.sleep(2000);
		System.out.println(hola.getState());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(hola.getState());
	System.out.println(hola.getState());
	System.out.println(hola.getState());

}
}
