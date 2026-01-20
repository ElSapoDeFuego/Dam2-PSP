package prueba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pruebacmd {
public static void main(String[] args) {
	try {
		Process proc = new ProcessBuilder("cmd", "/c","dir").start();
		BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		String linea;
		while((linea=br.readLine())!=null) {
			System.out.println(linea);
		}
		br.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
