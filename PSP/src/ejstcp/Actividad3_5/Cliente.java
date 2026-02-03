package ejstcp.Actividad3_5;

public class Cliente {
public static void main(String[] args) {
	DatagramPacket envio = new DatagramPacket(mensaje, mensaje.length, destino, port);
	DatagramSocket socket = new DatagramSocket(34567);//Puerto local
	socket.send(envio);
	socket.close();
}
}
