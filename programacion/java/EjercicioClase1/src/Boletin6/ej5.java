/**
 * 
 */
package Boletin6;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 */
public class ej5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/*
		 	Crea una aplicación que nos pida por teclado que introduzcamos nuestra fecha 
			de cumpleaños y nos indique por pantalla cuantos meses, semanas y días nos 
			faltan para celebrar nuestro cumpleaños
		 */
		
		Date hoy = new Date();
		hoy.getTime();		
		long anios = 1970 + Long.MAX_VALUE/(1000);
		
		System.out.println(anios);
		
		
	}
		
}
