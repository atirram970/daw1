package RepasoExamenUD6y7;

import java.util.ArrayList;
import java.util.Scanner;

public class ejRepaso2 {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	ArrayList<Integer> numeros = new ArrayList<>();
    	int numero = 0;
    	for (int i = 0; i < 10; i++) {
			System.out.println("Dame un numero: ");
			numero = scan.nextInt();
			numeros.add(numero);
		}
    	numeros.sort(null);
    	System.out.println(numeros);
    	scan.close();
    }
}
