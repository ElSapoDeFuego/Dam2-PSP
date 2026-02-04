package ejstcp.Actividad3_5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int puertoSalida = 50001;
		int puertoentrada = 50000;
		
		String mensaje = "";
		try (DatagramSocket socket = new DatagramSocket();) {
			while (!mensaje.equals("*")) {
				InetAddress destino = InetAddress.getLocalHost();

				try {
					
					
					System.out.println("Escribe lo que quieras enviar, si quieres parar pon *");
					mensaje = sc.nextLine();
					byte[] enviar = mensaje.getBytes();
					DatagramPacket envio = new DatagramPacket(enviar, enviar.length, destino, puertoSalida);

					socket.send(envio);
					byte[] bufer = new byte[1024];
					DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);
					socket.receive(recibo);
					String reciboString = new String(recibo.getData(), 0, recibo.getLength());
					System.out.println("Respuesta: "+ reciboString);
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SocketException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
