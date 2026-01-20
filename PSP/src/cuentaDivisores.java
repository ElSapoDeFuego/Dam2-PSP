import java.util.ArrayList;

public class cuentaDivisores {
public static void main(String[] args) {
	int num=0, temp=1;
	ArrayList<Integer> divisores = new ArrayList<Integer>();
	num = Integer.parseInt(args[0]);
	while(num>=temp) {
		if(num%temp==0) {
			divisores.add(temp);
		}
		temp++;
	}
	System.out.println("Los divisores de num son:");
	for (Integer integer : divisores) {
		System.out.println(integer);
	}
}
}
