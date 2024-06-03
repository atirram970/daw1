package Boletin10;

public class ExpresionesRegulares 
{

	public static void main(String[] args) 
	{
		String cadena = "Solo sé que no se nada";
		String codigo = "abc1234";
			
		//Devuelve false
		String patronEj1 = "Solo";
		System.out.println("Ejemplo 1: " + cadena + " - Patrón: " + patronEj1 + " Resultado: " + cadena.matches(patronEj1));
			
		//Devuelve true
		String patronEj2 = "Solo.*";
		System.out.println("Ejemplo 2: " + cadena + " - Patrón: " + patronEj2 + " Resultado: " + cadena.matches(patronEj2));
			
		//Devuelve false
		String patronEj3 = ".*[xyz].*";
		System.out.println("Ejemplo 3: " + cadena + " - Patrón: " + patronEj3 + " Resultado: " + cadena.matches(patronEj3));
			
		//Devuelve true
		String patronEj4 = ".*[qnd].*";
		System.out.println("Ejemplo 4: " + cadena + " - Patrón: " + patronEj4 + " Resultado: " + cadena.matches(patronEj4));
			
		//Devuelve true
		String patronEj5 = ".*[^xyz].*";
		System.out.println("Ejemplo 5: " + cadena + " - Patrón: " + patronEj5 + " Resultado: " + cadena.matches(patronEj5));
			
		//Devuelve true
		String patronEj6 = "Solo sé q?ue n?o se? na?da";
		System.out.println("Ejemplo 6: " + cadena + " - Patrón: " + patronEj6 + " Resultado: " + cadena.matches(patronEj6));
			
		//Devuelve false
		String patronEj7 = "[a-z].*";
		System.out.println("Ejemplo 7: " + cadena + " - Patrón: " + patronEj7 + " Resultado: " + cadena.matches(patronEj7));
			
		//Devuelve true
		String patronEj8 = "[A-Z].*";
		System.out.println("Ejemplo 8: " + cadena + " - Patrón: " + patronEj8 + " Resultado: " + cadena.matches(patronEj8));
		
		//Devuelve true
		String patronEj9 = "[a-z]{3}\\d{4}"; //equivaldria a [a-z][a-z][a-z][0-9][0-9][0-9][0-9]
		System.out.println("Ejemplo 9: " + cadena + " - Patrón: " + patronEj8 + " Resultado: " + cadena.matches(patronEj9));
		
		//Devuelve true
		String patronEj10 = "[a-z]{3}\\d*";
		System.out.println("Ejemplo 10: " + cadena + " - Patrón: " + patronEj10 + " Resultado: " + cadena.matches(patronEj10));
		
		//Devuelve true
		String patronEj11 = "^[a-zA-Z]{3}$\\d*";
		System.out.println("Ejemplo 11: " + cadena + " - Patrón: " + patronEj11 + " Resultado: " + cadena.matches(patronEj11));
		
		//Validación de un numero entero
		String entero = "+5";
		String patronEj12 = "^(-?|\\+?)\\d+$";
		System.out.println("Ejemplo 12: " + entero + " - Patrón: " + patronEj12 + " Resultado: " + entero.matches(patronEj12));
		
		//validación de ip
		String ip = "192.168.1.10";
		String patronEj13 = "((\\d|[1-9]\\d|((1\\d\\d)|(2[0-4]\\d)|(25[0-5])))\\.){3}(\\d|[1-9]\\d|((1\\d\\d)|(2[0-4]\\d)|(25[0-5])))";
		System.out.println("IP: " + ip + " - Patrón: " + patronEj13 + " Resultado: " + ip.matches(patronEj13));
		
		//validación matricula coche
		String matricula = "2010BVA";
		String patronEj14 = "^\\d{4}[B-DF-HJ-NPR-TV-Z]{3}$";
		System.out.println("Matrícula Coche: " + matricula + " - Patrón: " + patronEj14 + " Resultado: " + matricula.matches(patronEj14));
		
		//validación numero hexadecimal
		String hexadecimal = "89A7FF";
		String patronEj15 = "^0|([1-9A-F][0-9A-F]*)$";
		System.out.println("Número Hexadecimal: " + hexadecimal + " - Patrón: " + patronEj15 + " Resultado: " + hexadecimal.matches(patronEj15));
		
		//validación numero real
		String numeroReal = "+1.009.567,814";
		String patronEj16 = "^(([+-]?)[1-9]{1,3}(.[0-9]{3})*,)|(0|[+-]?)$";
		System.out.println("Número real: " + numeroReal + " - Patrón: " + patronEj16 + " Resultado: " + numeroReal.matches(patronEj16));
		
		//validación de usuario de twitter --> empieza @ y puede tener letrsa mayus/minus _ y números. y va de 4 a 20 caracteres
		String usuario = "@adriermaki";
		String patronEj17 = "@\\w{5,15}$";
		System.out.println("NombreUsuario: " + usuario + " - Patrón: " + patronEj17 + " Resultado: " + usuario.matches(patronEj17));
		
		//validación ISBN --> 2 tipos = 10 y otro de 13
		//13 aparecer juntos con espacios o guiones, si aparecen separados serán en grupos de 3-1-3-5-1 los 3 primeros son 978 o 979
		//10 aparecer juntos con espacios o guiones, si aparecen separados serán en grupos de 1-3-5-1
		String isbn10 = "0-123-12345-7";
		String isbn13 = "978 0 123 12345 7";
		String patronEj18 = "^()|()$";
		System.out.println("ISBN 10: " + isbn10 + " - Patrón: " + patronEj17 + " Resultado: " + isbn10.matches(patronEj18));
		System.out.println("ISBN 13: " + isbn13 + " - Patrón: " + patronEj17 + " Resultado: " + isbn13.matches(patronEj18));
	}

}
