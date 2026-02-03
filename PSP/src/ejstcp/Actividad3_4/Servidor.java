package ejstcp.Actividad3_4;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) {
		int puerto = 50000;
		try {
			ServerSocket servidor = new ServerSocket(puerto);
			System.out.println("Esperando a un cliente");
			Socket clienteConectado;
		
			int contador = 1;
			while (contador <= 4) {
				clienteConectado = servidor.accept();
				DataOutputStream salidaACliente = new DataOutputStream(clienteConectado.getOutputStream());
				System.out.println("Atendiendo al cliente "+contador);
				salidaACliente.writeUTF("Eres el cliente numero "+contador);
				contador++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
