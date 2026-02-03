package ejstcp.Actividad3_4;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	public static void main(String[] args) {
		String host = "localhost";
		int puerto = 50000;

		try {
			Socket cliente = new Socket(host, puerto);
			DataInputStream entrada = new DataInputStream(cliente.getInputStream());
			
			System.out.println(entrada.readUTF());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
