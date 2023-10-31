/**
 * 
 */
package Boletin5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 */
public class fechas {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		LocalDate ahora = LocalDate.now();
		System.out.println("Fecha con LocalDate: " + ahora);
		DateTimeFormatter formatLocalDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Fecha con LocalDate formateada: " + ahora.format(formatLocalDate));
		
		LocalDate ayer = LocalDate.parse("30/10/2023", formatLocalDate);
		System.out.println("ayer fue: " + ayer.format(formatLocalDate));
		
		LocalTime HoraActual = LocalTime.now();
		System.out.println("Fecha con LocalDate: " + HoraActual);
		DateTimeFormatter formatLocalTime = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("Fecha con LocalTime formateada: " + HoraActual.format(HoraActual));
		
		Date hoy = new Date();
		System.out.println("Fecha con Date: " + hoy);
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy, HH:mm");
		System.out.println("Fecha con Date formateada: " + formatDate.format(hoy));
		SimpleDateFormat formatDate2 = new SimpleDateFormat("'Son las' HH 'y' mm 'del dia' dd 'de' MM 'de' yyyy ");
		System.out.println("Fecha con Date formateada: " + formatDate2.format(hoy));
		SimpleDateFormat formatDateMinutos = new SimpleDateFormat("mm");
		String minutos = formatDateMinutos.format(hoy);
	}

}
