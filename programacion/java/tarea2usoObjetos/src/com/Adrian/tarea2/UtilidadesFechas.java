package com.Adrian.tarea2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilidadesFechas 
{
	public static String calculadoraEdad(String fechaPasada) 
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaCumple = new Date();
		try 
		{
			fechaCumple = dateFormat.parse(fechaPasada);
		} 
		catch (ParseException e) 
		{
			
		}
		Date currentDate = new Date();
		int edad = (int) ((currentDate.getTime() - fechaCumple.getTime()) / (1000l * 60 * 60 * 24 * 365));
		if (edad < 0)
		{
			return "Aun no ha nacido";
		}
		else
		{
			return "Su edad es: " + edad;
		}
	}
	
	public static String esFechaPasada(String fechaPasada) 
	{
        String respuesta = "";
        try 
        {
        	//formateador de fecha
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            //obtener fecha a traves de string pasado por parametro
            Date fecha = dateFormat.parse(fechaPasada);
            //obtener fecha ahora
            Date fechaAhora = new Date();
            //pasar a string la fecha
            String fechaActual = dateFormat.format(fechaAhora.getTime());
            //de ese string pasarlo a una fecha
            Date fechaHoy = dateFormat.parse(fechaActual);
            //comparar ambas fechas (si es -1 es anterior, si es 0 son mismo dia y si es +1 es posterior)
            int comparacion = fecha.compareTo(fechaHoy);
            if (comparacion == 0)
            {
                respuesta = "La fecha dada es igual a la fecha actual";
            }
            else if (comparacion < 0) 
            {
                respuesta = "La fecha es anterior";
            } 
            else if (comparacion > 0) 
            {
                respuesta = "La fecha es posterior";
            } 
          
        } 
        catch (Exception e) 
        {
            respuesta = "Has introducido una fecha con un formato incorrecto";
        }
        return respuesta;
    }
	
	public static String formatearFecha(String fechaPasada, String formato) 
	{
		try 
		{
			SimpleDateFormat formateador = new SimpleDateFormat(formato); 
			Date fecha = new Date();
			//pasar a string la fecha
	        String fechaActual = formateador.format(fecha.getTime());
	        //de ese string pasarlo a una fecha
	        Date fechaFormatear = formateador.parse(fechaActual);
			System.out.println("Fecha sin formatear: " + fechaPasada);
			return formateador.format(fechaFormatear);
		}
		catch (Exception e) 
		{
			
		}
		return "";
	}
	
	public static boolean esAnioBisiesto(String fechaPasada)
	{
		boolean esBisiesto = false;
        
        String fechaActual = fechaPasada;
        int anio = Integer.parseInt(fechaActual);
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0))
        {
			esBisiesto = true;
		}
		return esBisiesto;
		
	}
}
