package caja;

public class pruebaArray {
	public static void main(String[] args) {
		// Crear una matriz 4x4
		int[][] matriz = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = i * 4 + j;
			}
		}

		// imprimir todos los elementos
		for (int i = 0; i < 4; i++) {
			System.out.println("\n");
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}

		System.out.println("\n");

		// Imprimir los elementos del borde
		for (int j = 0; j < 4; j++) {
            System.out.print(matriz[0][j] + " ");
        }
        for (int i = 1; i < 4; i++) {
            System.out.print(matriz[i][3] + " ");
        }
        for (int j = 2; j >= 0; j--) {
            System.out.print(matriz[3][j] + " ");
        }
        for (int i = 2; i > 0; i--) {
            System.out.print(matriz[i][0] + " ");
        }
	}

}
