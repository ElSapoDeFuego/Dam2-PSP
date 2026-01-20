package EjRepaso.ej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ej2 {
	// 2. Leer por teclado dos tablas de 10 números enteros y mezclarlas en una
	// tercera de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("La primera lista:");
		ArrayList<Integer> numerillos = new ArrayList<Integer>();
		ArrayList<Integer> numerillos2 = new ArrayList<Integer>();
		int numTemp = 0;
		for (int i = 1; i < 11; i++) {
			System.out.println("Dame un numero (" + i + "/10):");
			numTemp = sc.nextInt();
			numerillos.add(numTemp);
		}
		System.out.println("La segunda lista:");
		for (int i = 1; i < 11; i++) {
			System.out.println("Dame un numero (" + i + "/10):");
			numTemp = sc.nextInt();
			numerillos2.add(numTemp);
		}
		Iterator<Integer> it = numerillos.iterator();
		Iterator<Integer> it2 = numerillos2.iterator();
		boolean tienePelos = false;
		ArrayList<Integer> numerillos3 = new ArrayList<Integer>();
		while (!tienePelos) {
			if (it.hasNext()) {
				numTemp = it.next();
				numerillos3.add(numTemp);
			} else {
				tienePelos = true;
			}
			if (it2.hasNext()) {
				numTemp = it2.next();
				numerillos3.add(numTemp);
			} else {
				tienePelos = true;
			}
		}
		for (Integer integer : numerillos3) {
			System.out.println(integer);
		}
	}
}
