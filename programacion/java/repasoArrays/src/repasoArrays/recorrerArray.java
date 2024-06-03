package repasoArrays;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public class recorrerArray {

	public static void main(String[] args) {
		//array
		int[][] matriz = 
			{
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};
		//recorridos
	
		System.out.println("Recorrido normal");
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 3; j++) {
		        System.out.print(matriz[i][j] + " ");
		    }
		    System.out.println();
		}
		
		System.out.println("Recorrido inverso");
		for (int i = 2; i >= 0; i--) {
		    for (int j = 2; j >= 0; j--) {
		        System.out.print(matriz[i][j] + " ");
		    }
		    System.out.println();
		}
		
		System.out.println("De arriba hacia abajo y a derecha");
		for (int j = 0; j < 3; j++) {
		    for (int i = 0; i < 3; i++) {
		        System.out.print(matriz[i][j] + " ");
		    }
		    System.out.println();
		}

		System.out.println("De arriba hacia abajo y a izquierda");
		for (int j = 2; j >= 0; j--) {
		    for (int i = 0; i < 3; i++) {
		        System.out.print(matriz[i][j] + " ");
		    }
		    System.out.println();
		}

		System.out.println("Diagonal de arriba izquierda hacia abajo derecha");
		for (int i = 0; i < 3; i++) {
		    System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		System.out.println("Diagonal de arriba derecha a abajo izquierda");
		for (int i = 0; i < 3; i++) {
		    System.out.print(matriz[i][2 - i] + " ");
		}
		System.out.println();

		System.out.println("Diagonal de abajo izquierda hacia arriba derecha");
		boolean finalizadoAI_AD = false;
		do {
			int i = 2;
			int j = 0;
			System.out.print(matriz[i][j] + " ");
			i--;
			j++;
			System.out.print(matriz[i][j] + " ");
			i--;
			j++;
			System.out.print(matriz[i][j] + " ");
			System.out.println();
			finalizadoAI_AD = true;
		} while (!finalizadoAI_AD);
		
		System.out.println("Diagonal de abajo derecha hacia arriba izquierda");
		boolean finalizadoAD_AI = false;
		do {
			int i = 2;
			int j = 2;
			System.out.print(matriz[i][j] + " ");
			i--;
			j--;
			System.out.print(matriz[i][j] + " ");
			i--;
			j--;
			System.out.print(matriz[i][j] + " ");
			System.out.println();
			finalizadoAD_AI = true;
		} while (!finalizadoAD_AI);
		
		System.out.println("En sentido agujas reloj");
		boolean finalizado_AgujaReloj = false;
		do {
			// Primera fila
			for (int j = 0; j < 3; j++) {
			    System.out.print(matriz[0][j] + " ");
			}
			System.out.println();
			// Última columna
			System.out.println(matriz[1][2] + " ");
			
			// Última fila
			for (int j = 2; j >= 0; j--) {
			    System.out.print(matriz[2][j] + " ");
			}
			System.out.println();
			// Primera columna
			System.out.println(matriz[1][0] + " ");
			System.out.println();
			finalizado_AgujaReloj = true;
		} while (!finalizado_AgujaReloj);
		
		System.out.println("En sentido agujas reloj inverso");
		boolean finalizado_AgujaRelojInverso = false;
		do {
			// Primera columna
			for (int i = 0; i < 3; i++) {
			    System.out.print(matriz[i][0] + " ");
			}
			// Última fila
			for (int j = 1; j < 3; j++) {
			    System.out.print(matriz[2][j] + " ");
			}
			// Última columna
			for (int i = 1; i >= 0; i--) {
			    System.out.print(matriz[i][2] + " ");
			}
			// Primera fila
			for (int j = 1; j >= 1; j--) {
			    System.out.print(matriz[0][j] + " ");
			}
			System.out.println();
			finalizado_AgujaRelojInverso = true;
		} while (!finalizado_AgujaRelojInverso);
	}

}
