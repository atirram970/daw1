package repasoArrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class buscaMinas {
	private static int[][] tablero;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion = -1;
		boolean opcCorrecta = false;
		while (!opcCorrecta) {
			mostrarMenu();
			try {
				opcion = scanner.nextInt();
				if (opcion == 0 || opcion == 1 || opcion == 2) {
					opcCorrecta = true;
				} else {
					System.out.println("Por favor introduce una opción válida");
				}
			} catch (InputMismatchException e) {
				scanner.next();
				System.out.println("Por favor introduce una opción válida");
			}
		}
		switch (opcion) {
		case 1:
			System.out.println("Has elegido crear un tablero fácil de Buscaminas");
			tablero = crearTablero(9);
			break;
		case 2:
			System.out.println("Has elegido crear un tablero difícil de Buscaminas");
			tablero = crearTablero(16);
			break;
		case 0:
			// No hacemos nada
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
		mostrarTablero(tablero);
		System.out.println("Hasta luego!");
	}

	private static void mostrarTablero(int[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				System.out.print(tablero[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

	private static int[][] crearTablero(int tamanio) {
		int bombas = 0;
		switch (tamanio) {
		case 9:
			bombas = 10;
			break;
		case 16:
			bombas = 40;
			break;
		default:
			throw new IllegalArgumentException("El tamaño de tablero es incorrecto");
		}
		// Creamos el tablero
		int[][] tablero = new int[tamanio][tamanio];
		// Ubicamos las bombas
		while (bombas > 0) {
			int fila = calcularNumeroAleatorio(0, tamanio - 1);
			int columna = calcularNumeroAleatorio(0, tamanio - 1);
			if (tablero[fila][columna] == 0) {
				tablero[fila][columna] = -1;
				bombas--;
			}
		}
		// Calculamos las bombas próximas
		for (int i = 0; i < tamanio; i++) {
			for (int j = 0; j < tamanio; j++) {
				if (tablero[i][j] != -1) {
					int cuentaBombas = 0;
					if (i == 0 && j == 0) {
						// esq sup izqda
						for (int x = i; x <= i + 1; x++) {
							for (int z = j; z <= j + 1; z++) {
								if (tablero[x][z] == -1) {
									cuentaBombas++;
								}
							}
						}
						tablero[i][j] = cuentaBombas;
					} else if (i == 0 && j == tamanio - 1) {
						// esq sup dcha
						for (int x = i; x <= i + 1; x++) {
							for (int z = j - 1; z <= j; z++) {
								if (tablero[x][z] == -1) {
									cuentaBombas++;
								}
							}
						}
						tablero[i][j] = cuentaBombas;
					} else if (i == 0 && j >= 1 && j <= tamanio - 2) {
						// borde superior
						for (int x = i; x <= i + 1; x++) {
							for (int z = j - 1; z <= j + 1; z++) {
								if (tablero[x][z] == -1) {
									cuentaBombas++;
								}
							}
						}
						tablero[i][j] = cuentaBombas;
					} else if (i >= 1 && i <= tamanio - 2 && j == 0) {
						// borde izquierdo
						for (int x = i - 1; x <= i + 1; x++) {
							for (int z = 0; z <= 1; z++) {
								if (tablero[x][z] == -1) {
									cuentaBombas++;
								}
							}
						}
						tablero[i][j] = cuentaBombas;
					} else if (i > 0 && i < tamanio - 1 && j > 0 && j < tamanio - 1) {
						// caso general
						for (int x = i - 1; x <= i + 1; x++) {
							for (int z = j - 1; z <= j + 1; z++) {
								if (tablero[x][z] == -1) {
									cuentaBombas++;
								}
							}
						}
						tablero[i][j] = cuentaBombas;
					}
				}
			}
		}
		// Devolvemos el tablero
		return tablero;
	}

	private static int calcularNumeroAleatorio(int limInf, int limSup) {
		return (int) (Math.random() * (limSup - limInf + 1) + limInf);
	}

	/**
	 * 
	 */
	private static void mostrarMenu() {
		System.out.println("Bienvenido al juego Buscaminas");
		System.out.println("Elige una opción para jugar");
		System.out.println("1. Fácil");
		System.out.println("2. Difícil");
		System.out.println("0. Salir");
	}

}