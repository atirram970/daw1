package Boletin6;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		int opcion;
		Scanner scanOpcion = new Scanner(System.in);
		Scanner scanDatos = new Scanner(System.in);
		do {
			System.out.println("¿Qué tipo de dato quieres crear?\n1. Entero\n2. Float\n3. Double\n4. Boolean\n5. Char\nIntroduce la opción deseada");
			boolean datoCorrecto = false;
			opcion = scanOpcion.nextInt();
			switch (opcion) {
			case 1:
				while (!datoCorrecto) {					
					int entero;
					try {
						System.out.println("Has elegido crear un entero. Introduce su valor");
						entero = UtilidadesEj06.introduceInt(scanDatos.next());
						datoCorrecto = true;
						System.out.printf("Has creado un entero con el valor: %d\n", entero);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				
				break;
			case 2:
				while (!datoCorrecto) {					
					float decimalFloat;
					try {
						System.out.println("Has elegido crear un float. Introduce su valor");
						decimalFloat = UtilidadesEj06.introduceFloat(scanDatos.next());
						datoCorrecto = true;
						System.out.printf("Has creado un float con el valor: %f\n", decimalFloat);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				
				break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		} while (opcion != 0);
		System.out.println("Gracias. Hasta luego!");
	}

}
