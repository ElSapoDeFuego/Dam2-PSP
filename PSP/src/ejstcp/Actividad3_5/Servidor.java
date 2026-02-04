package ejstcp.Actividad3_5;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;

public class Servidor {
	public static void main(String[] args) {
		int puertoEntrada = 50001;
		int puertoRecibido;

		byte[] mensajeRecibidoBytesParaDevolver;
		String mensajeRecibido = "";

		try (DatagramSocket socket = new DatagramSocket(puertoEntrada)) {
			socket.setSoTimeout(50000);
			System.out.println("Esperando a cliente");
			while (!mensajeRecibido.trim().equals("*")) {

				byte[] bufer = new byte[1024];
				DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);
				socket.receive(recibo);
				InetAddress IPOrigen = recibo.getAddress();
				puertoRecibido = recibo.getPort();
				mensajeRecibido = new String(recibo.getData(), 0, recibo.getLength()).toUpperCase();
				mensajeRecibidoBytesParaDevolver = mensajeRecibido.getBytes();
				System.out.println("Enviando: " + mensajeRecibido);
				DatagramPacket envio = new DatagramPacket(mensajeRecibidoBytesParaDevolver,
						mensajeRecibidoBytesParaDevolver.length, IPOrigen, puertoRecibido);
				socket.send(envio);
			}

		} catch (SocketTimeoutException e) {
			System.out.println("Tiempo agotado :");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
