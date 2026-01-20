package act_procesoI_ej3;

public class GeneradorAleatorias {
	public static void main(String[] args) {
		
		int numAleatorio, min=0, max=10;
		numAleatorio = (int)(Math.random() * (max-min+1));
		System.out.println(numAleatorio);
	}
}
