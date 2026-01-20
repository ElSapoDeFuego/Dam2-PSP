package practicas.voluntaria2_4;

import java.util.Scanner;

public class solicitarMain {
	public static void main(String[] args) {
		String cadena = "";
		MyHilo hilo = new MyHilo();
		System.out.println(
				"Si quieres suspender el hilo pon 's' y si quieres reanudarlo pon 'r', termina el programa poniendo '-1'");

		boolean miPrimeraVez = true;
		hilo.start();
		Scanner sc = new Scanner(System.in);
		while (!cadena.equals("-1")) {

			//esto es solo para que no haga el syso dos veces
			if (miPrimeraVez == true) {
				miPrimeraVez = false;
			} else {
				System.out.println(
						"Si quieres suspender el hilo pon 's' y si quieres reanudarlo pon 'r', termina el programa poniendo '-1'");
			}
			
			cadena = sc.next();
			if (cadena.equals("s")) {
				hilo.Suspende();
			} else if (cadena.equals("r")) {
				hilo.Reanuda();
			} else if (cadena.equals("-1")) {
				hilo.setFin(true);
			}
		}

	}
}
