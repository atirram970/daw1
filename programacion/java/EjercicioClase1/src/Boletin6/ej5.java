package Boletin6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ej5 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Date hoy = new Date();
		Date cumple = new Date();
		boolean fechaCorrecta = false;
		while (!fechaCorrecta) 
		{
			System.out.print("Introduce tu fecha de cumpleaños con formato (dd/MM/yyyy): ");
			String fechaCumpleaniosStr = scan.nextLine();
			try 
			{
				//obtiene la fecha del proximo cumpleaños
				cumple = obtenerFechaProxCumpleanios(fechaCumpleaniosStr);
				fechaCorrecta = true;
			} 
			catch (Exception e) 
			{
				System.out.print(e.getMessage());
			}
		}
		scan.close();
		// Se calcula la diferencia entre el cumpleaños y hoy
		long pasarMeses = 1000L * 60 * 60 * 24 * 30;
		long pasarSemanas = 1000L * 60 * 60 * 24 * 7;
		long pasarDias = 1000L * 60 * 60 * 24;
		long diferencia = cumple.getTime() - hoy.getTime();
		long meses = diferencia / pasarMeses;
		long semanas = (diferencia - meses * pasarMeses) / pasarSemanas;
		long dias = (diferencia - meses * pasarMeses - semanas * (1000 * 60 * 60 * 24 * 7)) / (1000 * 60 * 60 * 24);

		System.out.printf("Faltan %d meses, %d semanas y %d días para tu cumpleaños", meses, semanas, dias);
	}

	/**
	 * Obtiene la fecha del próximo cumpleaños a partir de la fecha de nacimiento.
	 * @param fechaStr
	 * @return fechaProxCumpleanios
	 * @throws Exception
	 */
	
	public static Date obtenerFechaProxCumpleanios(String fechaStr) throws Exception 
	{

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaNacimiento = null;
		try 
		{
			fechaNacimiento = dateFormat.parse(fechaStr);
		} 
		catch (ParseException e) 
		{
			throw new Exception("El formato no es el adecuado, por favor introduce una fecha correcta.");
		}
		
		//TODO: Lo que hay que calcular es si según la fecha que es el cumpleaños es en el año actual o en el siguiente.
		// para ello habrá que comparar los meses y modificar el año de la fecha de nacimiento
		//TODO: Podrían hacerse cálculos como en casos anteriores con los milisegundos de las fechas, pero en este caso se 
		// realizarán estos cálculos usando la clase Calendar. Ver documentación --> https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html
		
		// Un objeto calendar se inicializaliza de la siguiente manera
		Calendar calHoy = Calendar.getInstance();
		Calendar calFechaNac = Calendar.getInstance();
		calFechaNac.setTime(fechaNacimiento);
		Calendar fechaCumple = calFechaNac;
		
		if (calFechaNac.get(Calendar.MONTH) > calHoy.get(Calendar.MONTH) || (calFechaNac.get(Calendar.MONTH) == calHoy.get(Calendar.MONTH) && ))
		{
			fechaCumple.set(Calendar.YEAR, calHoy.get(Calendar.YEAR));
		}
		else
		{
			fechaCumple.set(Calendar.YEAR, calHoy.get(Calendar.YEAR) + 1);
		}
		System.out.println("La fecha del cumpleaños es: " + dateFormat.format(fechaCumple.getTime()));
		
		// Para obtener el año de una fecha se opera así
		int anioHoy = calHoy.get(Calendar.YEAR);
		System.out.println("Estamos en el año:" + anioHoy);
		return fechaCumple.getTime();

	}

}