import java.io.IOException;
import java.io.InputStream;

public class Proceso1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		ProcessBuilder pb = new ProcessBuilder("javac", "LeerNombre.java");
		Process p = pb.start();
		ProcessBuilder pb1 = new ProcessBuilder("java", "LeerNombre", args[0]);
		Process p1 = pb1.start();
		p1.waitFor();
		InputStream is = p1.getInputStream();
		int hola;
		while ((hola = is.read()) != -1) {
			System.out.print((char) hola);
		}
		is.close();
	}
}
