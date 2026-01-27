package ejstcp.Actividad3_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Cliente2 {
	public static void main(String[] args) throws Exception {
		String host = "localhost";
		int puerto = 50000;
		System.out.println("Programa Cliente INICIADO...");
		Socket cliente = new Socket(host, puerto);

		// flujo salida
		DataOutputStream flujoSalida = new DataOutputStream(cliente.getOutputStream());

		flujoSalida.writeUTF("Saludos al Servidor 😃😃😃, puerto del cliente 2:" + cliente.getLocalPort() + "/n"
				+ "ip del cliente 2: " + cliente.getInetAddress() + "\n");

		// flujo entrada
		DataInputStream flujoEntrada = new DataInputStream(cliente.getInputStream());

		flujoEntrada.close();
		flujoSalida.close();
		cliente.close();
	}
}
