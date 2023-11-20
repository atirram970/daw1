package com.Adrian.tarea2;

public class UsoDeObjetos 
{
	public static void main(String[] args) 
	{
		Long test1 = 1L;
		Long test2 = 10L;
		Long test3 = 0L;
		Long test4 = -100L;
		Long test5 = 50L;
		Long test6 = -1L;
		char test7 = 'C';
		
		//pruebas para esPrimo
		System.out.println("Probando la funcion esPrimo");
		System.out.println(test1 + ": " + UtilidadesMatematicas.esPrimo(test1));
		System.out.println(test2 + ": " + UtilidadesMatematicas.esPrimo(test2));
		System.out.println(test3 + ": " + UtilidadesMatematicas.esPrimo(test3));
		System.out.println(test4 + ": " + UtilidadesMatematicas.esPrimo(test4));
		System.out.println(test5 + ": " + UtilidadesMatematicas.esPrimo(test5));
		System.out.println(test6 + ": " + UtilidadesMatematicas.esPrimo(test6));
		System.out.println(test7 + ": " + UtilidadesMatematicas.esPrimo(test7));
		
		//pruebas para voltea
		System.out.println("Probando la funcion voltea");
		System.out.println("voltea (numero): "  + UtilidadesMatematicas.voltea(test1));
		System.out.println("esPrimo (numero): "  + UtilidadesMatematicas.voltea(test2));
		System.out.println("esPrimo (numero): "  + UtilidadesMatematicas.voltea(test3));
		System.out.println("esPrimo (numero): "  + UtilidadesMatematicas.voltea(test4));
		System.out.println("esPrimo (numero): "  + UtilidadesMatematicas.esPrimo(test5));
		System.out.println("esPrimo (numero): "  + UtilidadesMatematicas.esPrimo(test6));
		System.out.println("esPrimo (numero): "  + UtilidadesMatematicas.esPrimo(test7));
		
		//pruebas para digitos
		System.out.println("Probando la funcion digitos");
		System.out.println("digitos (numero): "  + UtilidadesMatematicas.digitos(test1));
		System.out.println("digitos (numero): "  + UtilidadesMatematicas.digitos(test2));
		System.out.println("digitos (numero): "  + UtilidadesMatematicas.digitos(test3));
		System.out.println("digitos (numero): "  + UtilidadesMatematicas.digitos(test4));
		System.out.println("digitos (numero): "  + UtilidadesMatematicas.digitos(test5));
		System.out.println("digitos (numero): "  + UtilidadesMatematicas.digitos(test6));
		System.out.println("digitos (numero): "  + UtilidadesMatematicas.digitos(test7));
		
		//pruebas para potencia
		System.out.println("Probando la funcion potencia");
		System.out.println("Probando la funcion potencia");
		System.out.println("digitoN (numero,exponente): "  + UtilidadesMatematicas.potencia(1,0));
		System.out.println("digitoN (numero,exponente): "  + UtilidadesMatematicas.potencia(-1,1));
		System.out.println("digitoN (numero,exponente): "  + UtilidadesMatematicas.potencia(-1,2));
		//System.out.println("digitoN (numero,exponente): "  + UtilidadesMatematicas.potencia(c,0));
		System.out.println("digitoN (numero,exponente): "  + UtilidadesMatematicas.potencia('v',0));
		//System.out.println("digitoN (numero,exponente): "  + UtilidadesMatematicas.potencia("d",0));
		
		//UtilidadesCadenasTexto
		//pruebas para palindromo
		System.out.println("Probando la funcion esPalindromo");
		System.out.println("esPalindromo (frase): "  + UtilidadesCadenasTexto.esPalindromo("ojorojo"));
		System.out.println("esPalindromo (frase): "  + UtilidadesCadenasTexto.esPalindromo("ana"));
		System.out.println("esPalindromo (frase): "  + UtilidadesCadenasTexto.esPalindromo("hola caracola"));
		
		//pruebas heterograma
		System.out.println("Probando la funcion esHeterograma");
		System.out.println("esHeterograma (frase): "  + UtilidadesCadenasTexto.esHeterograma("hola"));
		System.out.println("esHeterograma (frase): "  + UtilidadesCadenasTexto.esHeterograma("centrifugado"));
		System.out.println("esHeterograma (frase): "  + UtilidadesCadenasTexto.esHeterograma("acondicionar"));
		
		//pruebas contar palabras
		System.out.println("Probando la funcion contarPalabras");
		System.out.println("contarPalabras (palabra): " + UtilidadesCadenasTexto.contarPalabras("aeiou"));
		System.out.println("contarPalabras (palabra): " + UtilidadesCadenasTexto.contarPalabras("habichuela"));
		
		//UtilidadesFechas
		//pruebas calcular edad
		System.out.println("Probando la funcion calculadoraEdad");
		System.out.println("calculadoraEdad (dia, mes, año): " + UtilidadesFechas.calculadoraEdad("21/04/2002"));
		System.out.println("calculadoraEdad (dia, mes, año): " + UtilidadesFechas.calculadoraEdad("23/08/1976"));
		System.out.println("calculadoraEdad (dia, mes, año): " + UtilidadesFechas.calculadoraEdad("15/07/2007"));
		System.out.println("calculadoraEdad (dia, mes, año): " + UtilidadesFechas.calculadoraEdad("16/09/2047"));
		
		//pruebas esFechaPasada
		System.out.println("Probando la funcion esFechaPasada");
		System.out.println("esFechaPasada (dia, mes, año): " + UtilidadesFechas.esFechaPasada("19/11/2023"));
		System.out.println("esFechaPasada (dia, mes, año): " + UtilidadesFechas.esFechaPasada("20/11/2023"));
		System.out.println("esFechaPasada (dia, mes, año): " + UtilidadesFechas.esFechaPasada("21/11/2023"));
		
		//pruebas formatearFecha
		System.out.println("Probando la funcion formatearFecha");
		System.out.println("esFechaPasada (dia,mes,año,dd/MM/yyyy): " + UtilidadesFechas.formatearFecha("20/11/2023", "dd/MM/yyyy"));
		System.out.println("esFechaPasada (dia,mes,año,dd/MM/yyyy): " + UtilidadesFechas.formatearFecha("20/11/2023", "yyyy/dd/MM"));
	}

}
