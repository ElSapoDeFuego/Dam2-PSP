package ejstcp.Actividad3_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente1 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String host = "localhost";
		int puerto = 50000;
		System.out.println("Programa Cliente INICIADO...");
		Socket cliente = new Socket(host, puerto);

		// flujo salida
		DataOutputStream flujoSalida = new DataOutputStream(cliente.getOutputStream());
		String lineaRecibida;
		lineaRecibida = sc.nextLine();

		flujoSalida.writeUTF(lineaRecibida);

		// flujo entrada
		DataInputStream flujoEntrada = new DataInputStream(cliente.getInputStream());

		sc.close();
		flujoEntrada.close();
		flujoSalida.close();
		cliente.close();
	}
}
