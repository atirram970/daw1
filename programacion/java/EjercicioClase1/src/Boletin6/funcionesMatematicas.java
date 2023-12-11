package Boletin6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class funcionesMatematicas {
	/**
	 * a) Devuelve verdadero si el número que se pasa como parámetro es capicúa y
	 * falso
	 * en caso contrario.
	 * 
	 * @param numero
	 * @return esCapicua
	 */
	public static boolean esCapicua(long numero) {
		boolean esCapicua = numero == voltea(numero);
		return esCapicua;
	}

	/**
	 * b) Devuelve verdadero si el número que se pasa como parámetro es primo y
	 * falso
	 * en caso contrario.
	 * 
	 * @param i
	 * @return esPrimo
	 */
	public static boolean esPrimo(long i) {

		boolean esPrimo = true;
		int index = 2;
		while (index < (i / 2 + 1) && esPrimo) {
			if (i % index == 0) {
				esPrimo = false;
			}
			index++;
		}
		return esPrimo;
	}

	/**
	 * c) Devuelve el menor primo que es mayor al número que se pasa como parámetro.
	 * 
	 * @param inicio
	 * @return
	 */
	public static long siguientePrimo(long inicio) {
		boolean esPrimo = false;
		long incremento = 1l;
		while (!esPrimo) {
			esPrimo = esPrimo(inicio + incremento);
			incremento++;
		}
		return inicio + incremento - 1;
	}

	/**
	 * d) Dada una base y un exponente devuelve la potencia
	 * Sin utilizar ninguna librería de matemáticas
	 * 
	 * @param base
	 * @param exp
	 * @return result
	 */
	public static long potencia(int base, int exp) {
		/*
		 * Otra opción, usando la clase Math
		 * Math.pow(base, exp);
		 */

		long result = 1;
		if (exp < 0) {
			for (int i = 0; i > exp; i--) {
				result *= base;
			}
			result = 1 / result;
		} else {
			for (int i = 0; i < exp; i++) {
				result *= base;
			}
		}
		return result;
	}

	/**
	 * e) Cuenta el número de dígitos de un número entero.
	 * 
	 * @param numero
	 * @return numDigitos
	 */
	public static int digitos(long numero) {
		int numDigitos = 0;
		long aux = numero;
		if (numero < 0) {
			aux = -numero;
		}
		while (aux > 0) {
			aux = aux / 10;
			numDigitos++;
		}
		return numDigitos;
	}

	/**
	 * f) Le da la vuelta a un número
	 * 
	 * @param numero
	 * @return result
	 */
	public static long voltea(long numero) {
		long result = 0l;
		long aux = numero * 10 + 1;
		boolean quitaUno = false;
		while (aux != 0) {
			if (quitaUno) {
				result = (result * 10) + (aux % 10);
			}
			aux = aux / 10;
			quitaUno = true;
		}
		return result;
	}

	/**
	 * g) digitoN: Devuelve el dígito que está en la posición n de un número entero.
	 * Contando de izquierda a derecha y empezando por el 1
	 */
	public static int digitoN(long numero, int n) {
		long volteado = voltea(numero);
		while (n > 1) {
			volteado = volteado / 10;
			n--;
		}
		return (int) volteado % 10;
	}

	/**
	 * h) posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
	 * dentro de un número entero. Si no se encuentra, devuelve -1.
	 * 
	 * @param numero
	 * @param n
	 * @return result
	 */
	public static int posicionDeDigito(long numero, int n) throws Exception {
		int i = 1, result = -1;
		while (i <= digitos(numero) && digitoN(numero, i) != n) {
			i++;
		}
		if (i != digitos(numero)) {
			result = i;
		}
		if (result == -1) {
			throw new Exception("El dígito indicado no está en el número" + numero);
		}
		return result;
	}

	/**
	 * i) quitaPorDetras: Le quita a un número n dígitos por detrás (por la
	 * derecha).
	 */
	public static long quitaPorDetras(long numero, int n) {
		return numero / potencia(10, n);
	}

	/**
	 * j) quitaPorDelante: Le quita a un número n dígitos por delante (por la
	 * izquierda).
	 */
	// public static long quitaPorDelante(long numero, int n) {

	/**
	 * t) cambioExacto. Realiza un método que dada una cantidad de euros que el
	 * usuario introduce por teclado mostrará los billetes y monedas de cada tipo
	 * que serán necesarios para alcanzar dicha cantidad (utilizando los billetes y
	 * monedas de euro). Hay que indicar el mínimo de billetes y monedas posible.
	 * Por ejemplo, si el usuario introduce 145,50 el programa indicará que será
	 * necesario 1 billete de 100 €, 2 billetes de 20 €, 1 billete de 5 € y una
	 * moneda de 50cts (no será válido por ejemplo 29 billetes de 5 y 5 monedas de
	 * 10 cts, que aunque sume 145,50 € no es el mínimo número de billetes posible).
	 */
	public static void cambioExacto(double importe) {
		String valorDosDecimales = "";
		valorDosDecimales += importe;
		int lugar = funcionesCadenas.buscarCaracter(valorDosDecimales, '.');
		// importe = valorDosDecimales.
		double restante = importe;
		while (restante > 0) {
			if (restante >= 500) {
				System.out.println("500: " + (int) restante / 500);
				restante = restante % 500;
			} else if (restante >= 200) {
				System.out.println("200: " + (int) restante / 200);
				restante = restante % 200;
			} else if (restante >= 100) {
				System.out.println("100: " + (int) restante / 100);
				restante = restante % 100;
			} else if (restante >= 50) {
				System.out.println("50: " + (int) restante / 50);
				restante = restante % 50;
			} else if (restante >= 20) {
				System.out.println("20: " + (int) restante / 20);
				restante = restante % 20;
			} else if (restante >= 10) {
				System.out.println("10: " + (int) restante / 10);
				restante = restante % 10;
			} else if (restante >= 5) {
				System.out.println("5: " + (int) restante / 5);
				restante = restante % 5;
			} else if (restante >= 2) {
				System.out.println("2: " + (int) restante / 2);
				restante = restante % 2;
			} else if (restante >= 1) {
				System.out.println("1: " + (int) restante / 1);
				restante = restante % 1;
			} else if (restante >= 0.5) {
				System.out.println("50 cts: " + (int) restante / 0.5);
				restante = restante % 0.5;
			} else if (restante >= 0.2) {
				System.out.println("20 cts: " + (int) restante / 0.2);
				restante = restante % 0.2;
			} else if (restante >= 0.1) {
				System.out.println("10 cts: " + (int) restante / 0.1);
				restante = restante % 0.1;
			} else if (restante >= 0.05) {
				System.out.println("5 cts: " + (int) restante / 0.05);
				restante = restante % 0.05;
			} else if (restante >= 0.02) {
				System.out.println("2 cts: " + (int) restante / 0.02);
				restante = restante % 0.02;
			} else if (restante >= 0.01) {
				System.out.println("1 ct: " + (int) restante / 0.01);
				restante = restante % 0.01;
			}

		}
	}

	/**
	 * Devuelve true si es par y false si es impar
	 * 
	 * @param numero
	 * @return
	 */
	public static boolean esPar(long numero) {
		return numero % 2 == 0;
	}

	/**
	 * Devuelve un array de la cantidad de números enteros que se le pasa como
	 * parámetro
	 * 
	 * @param numEnteros
	 * @return numeros
	 */
	public static int[] getNumerosEnteros(int numEnteros) {
		Scanner scan = new Scanner(System.in);
		// 1. Declaramos un array con espacio para numEnteros elementos de tipo int
		int[] numeros = new int[numEnteros];
		// 2. Un bucle que pida numEnteros enteros al usuario y lo guardamos en el array
		System.out.println("Este programa pide " + numEnteros + " enteros");
		for (int i = 0; i < numeros.length; i++) {
			boolean correcto = false;
			while (!correcto) {
				try {
					System.out.printf("Introduce un entero. Quendan %d números por introducir.\n", numEnteros - i);
					numeros[i] = scan.nextInt();
					correcto = true;
				} catch (InputMismatchException e) {
					// no hago nada y vuelve a ejecutar el while
					scan.next();
					System.out.println("El número introducido no es un entero");
				}
			}
		}
		scan.close();
		return numeros;
	}

	/**
	 * Devuelve un array con un número de números aleatorios que se pasa en el
	 * primer parámetro.
	 * Los números aleatorios generados estarán entre el valorInicial y el
	 * valorFinal pasados como parámetros.
	 * 
	 * @param numeros
	 * @param valorInicial
	 * @param valorFinal
	 * @return arrayNumAleatorios
	 */
	public static long[] getNumerosAleatorios(int numeros, long valorInicial, long valorFinal) {
		long[] arrayNumAleatorios = new long[numeros];
		for (int index = 0; index < numeros; index++) {
			long numAleatorio = (long) (Math.random() * (valorFinal - valorInicial + 1) + valorInicial);
			arrayNumAleatorios[index] = numAleatorio;
		}
		return arrayNumAleatorios;
	}

	/**
	 * Devuelve un array con un número de números aleatorios que se pasa en el
	 * primer parámetro.
	 * Los números aleatorios generados estarán entre el valorInicial y el
	 * valorFinal pasados como parámetros.
	 * 
	 * @param numeros
	 * @param valorInicial
	 * @param valorFinal
	 * @return arrayNumAleatorios
	 */
	public static int[] getNumerosAleatorios(int numeros, int valorInicial, int valorFinal) {
		int[] arrayNumAleatorios = new int[numeros];
		for (int index = 0; index < numeros; index++) {
			int numAleatorio = (int) (Math.random() * (valorFinal - valorInicial + 1) + valorInicial);
			arrayNumAleatorios[index] = numAleatorio;
		}
		return arrayNumAleatorios;
	}

}