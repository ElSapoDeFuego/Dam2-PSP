package EjRepaso.ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class ej1 {
public static void main(String[] args) {
	//1. Leer 5 números y mostrarlos en el mismo orden introducido.
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> numerillos = new ArrayList<Integer>();
	int numTemp=0;
	for(int num = 1 ; num<6;num++) {
		System.out.println("Dame un numero ("+num+"/5):");
		numTemp = sc.nextInt();
		numerillos.add(numTemp);
	}
	for (Integer integer : numerillos) {
		System.out.println(integer);
	}
}
}
