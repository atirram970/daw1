package unidad6.edificio_corregido;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Creo un objeto edificio
		Edificio edif = new Edificio();
		Scanner scanner = new Scanner(System.in);
		int opc = 0;
		do {
			System.out.println("######### MENÚ #########");
			System.out.println("1. Persona accede al edificio");
			System.out.println("2. Persona abandona el edificio");
			System.out.println("3. Persona accede a zona privada");
			System.out.println("4. Persona abandona zona privada");
			System.out.println("5. Registro de persona con acceso a zona privada");
			System.out.println("6. Mostrar personas en el edificio");
			System.out.println("7. Mostrar personas en la zona privada");
			System.out.println("0. Salir");
			System.out.println("--------------------------------");
			System.out.println("Seleccione la opción deseada...");
			try {
				opc = scanner.nextInt();
			} catch (InputMismatchException e) {
				scanner.nextLine();
				opc = -1;
			} finally {
				scanner.nextLine();
			}

			try {
				switch (opc) {
				case 1:
					System.out.println("Introduce el DNI del visitante");
					String dniEntrada = scanner.nextLine();
					Persona visitanteEntrada = edif.getVisitante(dniEntrada);
					if (null == visitanteEntrada) {
						System.out.println("Introduce el nombre del visitante");
						String nombre = scanner.nextLine();
						System.out.println("Introduce los apellidos del visitante");
						String apellidos = scanner.nextLine();
						visitanteEntrada = new Persona(nombre, apellidos, dniEntrada);
					}
					Registro entrada = new Registro(visitanteEntrada, new Date(), true);
					edif.nuevaEntrada(entrada);
					break;
				case 2:
					System.out.println("Introduce el DNI del visitante que abandona el edificio");
					String dniSalida = scanner.nextLine();
					Persona visitanteSalida = edif.getVisitante(dniSalida);
					if (null == visitanteSalida) {
						throw new EdificioException(
						        "El visitante de salida siempre debe estar registrado en el sistema");
					}
					Registro salida = new Registro(visitanteSalida, new Date(), false);
					edif.salidaVisitante(salida);
					break;
				case 3:
					System.out.println("Introduce el DNI del visitante VIP");
					String dniEntradaVIP = scanner.nextLine();
					Persona visitanteEntradaVIP = edif.getVisitanteVIP(dniEntradaVIP);
					if (null == visitanteEntradaVIP) {
						throw new EdificioException("El visitante no tiene acceso a la zona privada");
					} else {
						Registro entradaVIP = new Registro(visitanteEntradaVIP, new Date(), true);
						edif.nuevaEntradaVIP(entradaVIP);
					}
					break;
				case 4:
					System.out.println("Introduce el DNI del visitante que abandona la zona privada");
					String dniSalidaVIP = scanner.nextLine();
					Persona visitanteSalidaVIP = edif.getVisitante(dniSalidaVIP);
					if (null == visitanteSalidaVIP) {
						throw new EdificioException(
						        "El visitante de salida siempre debe estar registrado en el sistema");
					}
					Registro salidaVIP = new Registro(visitanteSalidaVIP, new Date(), false);
					edif.salidaVisitanteVIP(salidaVIP);
					break;
				case 5:
					System.out.println("Introduce el DNI del visitante VIP");
					String dniVIP = scanner.nextLine();
					Persona visitanteVIP = edif.getVisitante(dniVIP);
					if (null == visitanteVIP) {
						System.out.println("Introduce el nombre del visitante");
						String nombre = scanner.nextLine();
						System.out.println("Introduce los apellidos del visitante");
						String apellidos = scanner.nextLine();
						visitanteVIP = new Persona(nombre, apellidos, dniVIP);
					}
					edif.altaVIP(visitanteVIP);
					break;
				case 6:
					edif.imprimirVisitantesActuales();
					break;
				case 7:
					edif.imprimirVisitantesVIPActuales();
					break;
				case 0:
					System.out.println("Gracias, hasta la próxima!");
					break;

				default:
					System.err.println("Opción no válida. Elija una opción disponible");
					break;
				}
			} catch (EdificioException e) {
				System.err.println(e.getMessage());
			}

		} while (opc != 0);
		scanner.close();
	}

}
