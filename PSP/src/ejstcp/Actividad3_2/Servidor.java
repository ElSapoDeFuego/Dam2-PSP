package ejstcp.Actividad3_2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) throws IOException{
		int numeroPuerto = 50000;
		try (ServerSocket servidor = new ServerSocket(numeroPuerto);
				){
			Socket clienteConectado1 = null;
			System.out.println("Esperando al cliente....");
			clienteConectado1 = servidor.accept();
			
			
			//flujo entrada
			InputStream entrada1 = null;
			entrada1 = clienteConectado1.getInputStream();
			DataInputStream flujoEntrada1 = new DataInputStream(entrada1);
			
		
			// EL CLIENTE ME ENVIA UN MENSAJE
			System.out.println("Recibiendo del CLIENTE 1: \n\t" + flujoEntrada1.readUTF());

		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}
}
