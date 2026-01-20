package actividad1_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main_Act1_3 {
	public static void main(String[] args) {
		try {
			System.out.println("Vamos a hacer una suma");
			
			Process suma = new ProcessBuilder("java","actividad1_3.ProcSuma").start();
			BufferedReader salidaHijo = new BufferedReader(new InputStreamReader(suma.getInputStream()));
		     BufferedWriter entradaHijo = new BufferedWriter(new OutputStreamWriter(suma.getOutputStream()));  
		     BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		     
		     String linea, entradaUsuario;
	            while ((linea = salidaHijo.readLine()) != null) {
	                System.out.println(linea);
	                entradaUsuario = teclado.readLine();
	                entradaHijo.write(entradaUsuario+"\n");
	                entradaHijo.flush();
	            }
	            BufferedReader aborto = new BufferedReader(new InputStreamReader(suma.getErrorStream()));
	            while ((linea = aborto.readLine()) != null) {
	                System.out.println(linea);
	                
	            }
	            entradaHijo.close();
	            salidaHijo.close();
	            teclado.close();
	            aborto.close();
	            
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
