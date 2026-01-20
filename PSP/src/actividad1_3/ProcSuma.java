package actividad1_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ProcSuma {
	public static void main(String[] args) {
		try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			String temp = "";
			int num1 = 0, num2 = 0, suma;
			try {
				bw.write("Dame el primer numero\n");
				bw.flush();
			
				temp = bf.readLine();
				num1 = Integer.parseInt(temp);
				bw.write("Dame el segundo\n");
				bw.flush();

				temp = bf.readLine();
				num2 = Integer.parseInt(temp);
				suma = num1+num2;
				bw.write("La suma es "+suma+"\n");
				bw.flush();
			} catch (NumberFormatException e) {
				System.out.println("Eso no es un numero");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
