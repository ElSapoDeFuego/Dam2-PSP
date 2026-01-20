package act_procesoI_ej3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ej {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean esFin = false;
		String any = "";
		for (; !esFin;) {
			System.out.println("Dime lo que sea, si quieres parar pon 'fin'");
			any = sc.nextLine().toLowerCase();
			if (any.equals("fin")) {
				System.exit(0);
			} else {
				try {
					
					Process p2 = new ProcessBuilder("java", "act_procesoI_ej3.GeneradorAleatorias", any).start();
					try {
						p2.waitFor();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					BufferedReader bf = new BufferedReader(new InputStreamReader(p2.getInputStream()));
					String num;
					while((num=bf.readLine())!=null) {
						System.out.println(num);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
