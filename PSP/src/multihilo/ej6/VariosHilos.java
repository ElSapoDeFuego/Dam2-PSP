package multihilo.ej6;

public class VariosHilos {
public static void main(String[] args) {
	Thread hiloPar = new Thread(new HiloPar());
	Thread hiloImpar= new Thread(new HiloImpar());
	try {hiloImpar.start();
	
		hiloImpar.join();
		hiloPar.start();

		hiloPar.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
