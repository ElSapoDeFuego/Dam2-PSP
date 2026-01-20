package EjRepaso.ej1;

import java.util.Scanner;

public class ej3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[10];
		for(int i = 0; i<5; i++) {
			System.out.println("Dame un numero("+(i+1)+"/5");
			numeros[i] = sc.nextInt();
		}
	}
}
