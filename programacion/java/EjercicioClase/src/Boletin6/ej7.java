package Boletin6;

public class ej7 {

	public static void main(String[] args) {
		System.out.println("Probamos la función esPrimo:");
		Long test1 = 1L;
		Long test2 = 17L;
		Long test3 = 0L;
		Long test4 = -200L;
		Long test5 = 37L;
		Long test6 = -1L;
		char test7 = 'C';
		funcionesMatematicas.esPrimo(test1);
		System.out.println(test1 + ": " + funcionesMatematicas.esPrimo(test1));
		System.out.println(test2 + ": " + funcionesMatematicas.esPrimo(test2));
		System.out.println(test3 + ": " + funcionesMatematicas.esPrimo(test3));
		System.out.println(test4 + ": " + funcionesMatematicas.esPrimo(test4));
		System.out.println(test5 + ": " + funcionesMatematicas.esPrimo(test5));
		System.out.println(test6 + ": " + funcionesMatematicas.esPrimo(test6));
		System.out.println(test7 + ": " + funcionesMatematicas.esPrimo(test7));
		System.out.println("-----------------------------------");
		System.out.println("Probamos la función siguientePrimo:");
		System.out.println(test1 + ": " + funcionesMatematicas.siguientePrimo(test1));
		System.out.println(test2 + ": " + funcionesMatematicas.siguientePrimo(test2));
		System.out.println(test3 + ": " + funcionesMatematicas.siguientePrimo(test3));
		System.out.println(test4 + ": " + funcionesMatematicas.siguientePrimo(test4));
		System.out.println(test5 + ": " + funcionesMatematicas.siguientePrimo(test5));
		System.out.println(test6 + ": " + funcionesMatematicas.siguientePrimo(test6));
		System.out.println(test7 + ": " + funcionesMatematicas.siguientePrimo(test7));
		System.out.println("-----------------------------------");
//		long sigPrimo = FuncionesMatematicas.siguientePrimo(inicioPrimo);
//		System.out.println("sigPrimo:" + sigPrimo);
//		System.out.println("inicioPrimo:" + inicioPrimo);
		
		System.out.println("digitos: " + funcionesMatematicas.digitos(-11l));
		System.out.println("voltea: "+ funcionesMatematicas.voltea(0000001l));
		System.out.println("esCapicua2: "+ funcionesMatematicas.esCapicua(1010l));
		System.out.println("esCapicua2: "+ funcionesMatematicas.esCapicua(123l));
		System.out.println("esCapicua2: "+ funcionesMatematicas.esCapicua(2313123l));
		System.out.println("esCapicua2: "+ funcionesMatematicas.esCapicua(24455676554422l));
		System.out.println("esCapicua2: "+ funcionesMatematicas.esCapicua(1011l));
		System.out.println("esCapicua2: "+ funcionesMatematicas.esCapicua(88888l));
		System.out.println("voltear2: "+ funcionesMatematicas.voltea(12300l));
		//System.out.println("voltear2: "+ FuncionesMatematicas.voltear2(34258l));
		
		

	}

}