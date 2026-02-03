package ejstcp.Actividad3_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente1 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String host = "localhost";
		int puerto = 50000;
		System.out.println("Programa Cliente INICIADO..."
				+ "\nescribe algo");
		Socket cliente = new Socket(host, puerto);

		// flujo salida

		DataOutputStream salida = new DataOutputStream(cliente.getOutputStream());
		String respuesta = sc.nextLine();
		salida.writeUTF(respuesta);
		

		sc.close();
		salida.close();
		cliente.close();
	}
}
