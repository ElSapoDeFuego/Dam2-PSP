package multihilo.ej8;

import java.util.ArrayList;
import java.util.List;

public class Comer {
	public static void main(String[] args) {
		List<String> nombres = List.of ("Papá pitufo", "Pitufina", "Filósofo", "Pintor",
				"Gruñón", "Bromista", "Dormilón", "Tímido", "Tontín", "Bonachón", "Romántico");
		for (String nombre : nombres) {
			Thread pitufin = new Thread(new Pitufo(nombre));
			pitufin.start();
			try {
				pitufin.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	
		
	}

	
	

}
