package hilos;

public class Tictac implements Runnable {
	private String nombre;

	public Tictac(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public void run() {
		while (true) {

			try {
				Thread.sleep(1000);
				System.out.println(this.nombre);
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		Tictac tic = new Tictac("tic");
		Tictac tac = new Tictac("tac");
		Thread tiqui = new Thread(tic);
		Thread taca = new Thread(tac);
		tiqui.start();
		
	
	
		taca.start();
	}
}
