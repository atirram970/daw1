package RepasoExamenUD6y7;

import java.util.ArrayList;

public class ejRepaso3 {

    public static void main(String[] args) {
    	ArrayList<Integer> numeros = new ArrayList<Integer>();
    	int numAleatorio = 0;
    	
    	for (int i = 0; i < 20; i++) {
			numAleatorio = (int) (Math.random() * (99 - 0 + 1) + 0);
			numeros.add(numAleatorio);
		}
    	System.out.println("Lista sin ordenar\n" + numeros);
    	numeros.sort(null);
    	System.out.println("Lista ordenada\n" + numeros);
    }
}
