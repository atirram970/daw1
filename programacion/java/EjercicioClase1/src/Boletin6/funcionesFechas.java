package Boletin6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class funcionesFechas {

	/**
	 * i) formatearFecha: Formatearía una fecha dada en una cadena con un formato
	 * pasado por parámetro. devuelve nulo si la fecha y formato no son correctos
	 */
	public static Date formatearFecha(String fecha, String formato) {
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		Date result = new Date();
		try {
			result = sdf.parse(fecha);
		} catch (ParseException e) {
			System.err.println("La fecha y formato introducidos no son correctos, la fecha se devuelve nula");
			result = null;
		}
		return result;
	}

	/**
	 * a) calcularEdad: Este método podría aceptar una fecha de nacimiento
	 * en formato dd/MM/aaaa y calcular la edad actual en base a la fecha actual.
	 */
	public static int calcularEdad(String fechaNac) {
		int edad = 0;
		Date fechaNacDate = formatearFecha(fechaNac, "dd/MM/yyyy");
		Calendar hoyCal = Calendar.getInstance();
		Calendar fechaNacCal = Calendar.getInstance();
		fechaNacCal.setTime(fechaNacDate);
		if (hoyCal.get(Calendar.DAY_OF_YEAR) > fechaNacCal.get(Calendar.DAY_OF_YEAR)) {
			edad = hoyCal.get(Calendar.YEAR) - fechaNacCal.get(Calendar.YEAR);
		} else {
			edad = hoyCal.get(Calendar.YEAR) - fechaNacCal.get(Calendar.YEAR) - 1;
		}
		return edad;
	}
	/**
	 * d) esFechaPasada: Determinaría si una fecha dada ya ha pasado en comparación
	 * con la fecha actual.
	 */
	public static boolean esFechaPasada(Date fecha) {
		Date now = new Date(); 
		return fecha.getTime() > now.getTime();
		
	}
}