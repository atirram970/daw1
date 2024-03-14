package Boletin8;

import java.util.Scanner;

public class ej6Maestro 
{
	/**
	 * Desarrolla un programa que implemente el clásico juego de las tres en raya,
	 * destinado a dos jugadores. El tablero constará de 3 filas (1, 2 y 3) y 3
	 * columnas (A, B y C), y se mostrará en la pantalla. Los jugadores se
	 * alternarán para ingresar sus movimientos, representados por "X" y "O"
	 * respectivamente. El juego continuará hasta que uno de los jugadores logre
	 * alinear tres de sus símbolos en línea horizontal, vertical o diagonal, o
	 * hasta que el tablero se llene sin que ningún jugador logre la victoria. En
	 * ese momento, se declarará el resultado del juego como ganador, empate o
	 * ninguna conclusión. Además, después de cada movimiento, el programa mostrará
	 * el estado actual del tablero para que los jugadores puedan seguir el progreso
	 * del juego.
	 */
	public static void main(String[] args) 
	{
		final String JUGADOR = "O";
		final String ORDENADOR = "X";
		Scanner scan = new Scanner(System.in);
		String[][] tablero = new String[3][3];
		int movimientos = 0;
		boolean jugadorGana = false;
		boolean ordenadorGana = false;
		String nombreFila = "cba";
		String coordenadas;

		// inicializa el tablero
		for (int row = 0; row < 3; row++) 
		{
			for (int col = 0; col < 3; col++) 
			{
				tablero[row][col] = "-";
			}
		}

		// Juego mientras que me mantengo en el do-while
		do {

			pintarTablero(tablero, nombreFila);

			// Pide las coordenadas al jugador
			int fila;
			int columna;
			do 
			{
				System.out.print("Introduzca las coordenadas, por ejemplo b2 (debe estar desocupada): ");
				coordenadas = scan.nextLine();
				// Devuelve el índice de la letra
				fila = nombreFila.indexOf(coordenadas.charAt(0));
				// Pasa el carácter a int
				columna = coordenadas.charAt(1) - 1 - 48;
			} 
			while (!tablero[fila][columna].equals("-"));
			tablero[fila][columna] = JUGADOR;
			movimientos++;

			// Condiciones para que gane el jugador
			jugadorGana = ((tablero[0][0] == JUGADOR) && (tablero[0][1] == JUGADOR) && (tablero[0][2] == JUGADOR)
			        || (tablero[1][0] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[1][2] == JUGADOR)
			        || (tablero[2][0] == JUGADOR) && (tablero[2][1] == JUGADOR) && (tablero[2][2] == JUGADOR)
			        || (tablero[0][0] == JUGADOR) && (tablero[1][0] == JUGADOR) && (tablero[2][0] == JUGADOR)
			        || (tablero[0][1] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][1] == JUGADOR)
			        || (tablero[0][2] == JUGADOR) && (tablero[1][2] == JUGADOR) && (tablero[2][2] == JUGADOR)
			        || (tablero[0][0] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][2] == JUGADOR)
			        || (tablero[0][2] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][0] == JUGADOR));

			if (!jugadorGana && (movimientos < 9)) 
			{
				// Juega el ordenador
				do 
				{
					fila = (int) (Math.random() * 3);
					columna = (int) (Math.random() * 3);
				} 
				while (!tablero[fila][columna].equals("-"));

				tablero[fila][columna] = ORDENADOR;
				movimientos++;
				// Condiciones para que gane el ordenador
				ordenadorGana = ((tablero[0][0] == ORDENADOR) && (tablero[0][1] == ORDENADOR)
				        && (tablero[0][2] == ORDENADOR)
				        || (tablero[1][0] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && (tablero[1][2] == ORDENADOR)
				        || (tablero[2][0] == ORDENADOR) && (tablero[2][1] == ORDENADOR) && (tablero[2][2] == ORDENADOR)
				        || (tablero[0][0] == ORDENADOR) && (tablero[1][0] == ORDENADOR) && (tablero[2][0] == ORDENADOR)
				        || (tablero[0][1] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && (tablero[2][1] == ORDENADOR)
				        || (tablero[0][2] == ORDENADOR) && (tablero[1][2] == ORDENADOR) && (tablero[2][2] == ORDENADOR)
				        || (tablero[0][0] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && (tablero[2][2] == ORDENADOR)
				        || (tablero[0][2] == ORDENADOR) && (tablero[1][1] == ORDENADOR)
				                && (tablero[2][0] == ORDENADOR));
			}

		} 
		while (!jugadorGana && !ordenadorGana && (movimientos < 9));
		scan.close();

		// Juego terminado, mostrar resultado final
		pintarTablero(tablero, nombreFila);
		if (jugadorGana) 
		{
			System.out.println("¡Enhorabuena! ¡Has ganado!");
		} 
		else if (ordenadorGana) 
		{
			System.out.println("¡Lo siento! Gana el ordenador.");
		} 
		else 
		{
			System.out.println("¡Empate!");
		}
	}

	/**
	 * Pinta el tablero con los datos guardados actualmente
	 * 
	 * @param tablero
	 * @param nombreFila
	 */
	public static void pintarTablero(String[][] tablero, String nombreFila) 
	{		
		//definiendo colores
		final String RESET = "\u001B[0m";
		final String AZUL = "\u001B[34m";
		final String ROJO = "\u001B[31m";
		
		for (int row = 0; row < 3; row++) 
		{
			System.out.print(nombreFila.charAt(row) + "\t");
			for (int col = 0; col < 3; col++) 
			{
				if(tablero[row][col] == "O")
				{
					System.out.print(AZUL + tablero[row][col] + "\t" + RESET);
				}
				else if(tablero[row][col] == "X")
				{
					System.out.print(ROJO + tablero[row][col] + "\t" + RESET);
				}
				else
				{
					System.out.print(tablero[row][col] + "\t");
				}
				
			}
			System.out.print("\n\n");
		}
		System.out.println("\t1\t2\t3\n");
	}
}