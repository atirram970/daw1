package Boletin6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Date hoy = new Date();
		Date cumple = new Date();
		boolean fechaCorrecta = false;
		while (!fechaCorrecta) {
			System.out.println("Introduce tu fecha de cumpleaños con formato (dd/MM/yyyy): ");
			String fechaNacStr = scan.nextLine();
			try {
				// Obtiene la fecha del próx. cumpleaños
				cumple = obtenerFechaProxCumpleanios(fechaNacStr);
				fechaCorrecta = true;
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}
		scan.close();
		// Se calcula la diferencia aproximada (meses con 30 días) entre el cumpleaños y
		// hoy
		// Hay que indicar en los números que son literales del tipo long, pues no se
		// pueden representar números como 1000*60*60*24*30=2.592.000.000 en un entero y
		// se produce overflow
		long pasarMeses = 1000L * 60 * 60 * 24 * 30;
		long pasarSemanas = 1000L * 60 * 60 * 24 * 7;
		long pasarDias = 1000L * 60 * 60 * 24;

		long diferencia = cumple.getTime() - hoy.getTime();
		long meses = diferencia / pasarMeses;
		long semanas = (diferencia - meses * pasarMeses) / pasarSemanas;
		long dias = (diferencia - meses * pasarMeses - semanas * pasarSemanas) / pasarDias;

		System.out.printf("Faltan %d meses, %d semanas y %d días para tu cumpleaños\n", meses, semanas, dias);
	}

	/**
	 * Obtiene la fecha del próximo cumpleaños a partir de la fecha de nacimiento.
	 * 
	 * @param fechaStr
	 * @return fechaProxCumpleanios
	 * @throws Exception
	 */
	public static Date obtenerFechaProxCumpleanios(String fechaStr) throws Exception {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaNacimiento = null;
		Date fechaProxCumpleanios = null;
		try {
			fechaNacimiento = dateFormat.parse(fechaStr);
		} catch (ParseException e) {
			// Si se produce un error de parseo, se lanza excepción con el mensaje
			// siguiente.
			throw new Exception("El formato no es el adecuado, por favor introduce una fecha correcta.");
		}

		// Lo que hay que calcular es si según la fecha que es el cumpleaños es en el
		// año actual o en el siguiente.
		// Para ello habrá que comparar los meses y modificar el año de la fecha de
		// nacimiento

		// Podrían hacerse cálculos como en casos anteriores con los milisegundos
		// de las fechas, pero en este caso se realizarán estos cálculos usando la clase
		// Calendar.
		// Ver documentación -->
		// https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html

		// Un objeto calendar se inicializaliza de la siguiente manera
		Calendar calHoy = Calendar.getInstance();
		Calendar calFechaNac = Calendar.getInstance();
		// De esta forma se le asigna el valor de una fecha guardado en un Date
		calFechaNac.setTime(fechaNacimiento);
		Calendar fechaCumple = calFechaNac;
		// Opción alternativa de comparación con compareTo
		if (calFechaNac.get(Calendar.MONTH) > calHoy.get(Calendar.MONTH)
		        || (calFechaNac.get(Calendar.MONTH) == calHoy.get(Calendar.MONTH)
		                && calFechaNac.get(Calendar.DATE) >= calHoy.get(Calendar.DATE))) {
			// Si el mes de nacimiento es mayor al actual o si es el mismo pero un día
			// posterior al actual, el año del siguiente cumpleaños será el año actual.
			fechaCumple.set(Calendar.YEAR, calHoy.get(Calendar.YEAR));
			fechaProxCumpleanios = fechaCumple.getTime();
		} else {
			// En caso contrario será en el año siguiente.
			fechaCumple.set(Calendar.YEAR, calHoy.get(Calendar.YEAR) + 1);
			fechaProxCumpleanios = fechaCumple.getTime();
		}
		System.out.println("La fecha del cumple es: " + dateFormat.format(fechaCumple.getTime()));

		return fechaProxCumpleanios;
	}

}
