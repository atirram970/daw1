package examen;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// Menu mostrar notas
		
		//declaro el escaner de opcion de nota de programacion y nota de lenguaje de marcas
		Scanner Opcion = new Scanner(System.in);
		Scanner NotaPROGRAMACION = new Scanner(System.in);
		Scanner NotaLGMS = new Scanner(System.in);
		//inicializo la variable opc en 3 para evitar posibles errores
		int opc=3;
		//declaro las notas en double para que puedan mostrar decimales
		double notaLGMS=0;
		double notaPROGRAMACION=0;
		
		//hago uso del bucle do-while para que se ejecute aunque sea por 1 vez
		do 
		{
			//muestro el menu
			System.out.println("---------------| MENÚ PRINCIPAL |---------------\n| 1 - Módulo de Programación                   |\n| 2 - Módulo de Lenguaje de Marcas             |\n| 0 - Resumen y salida del programa            |\n------------------------------------------------");
			//guardo la opcion del usuario
			opc = Opcion.nextInt();
			
			//si usuario elige la 1a opcion
			if (opc == 1) 
			{
				//pido la nota de programacion
				System.out.println("Dame la nota de Programación: ");
				//tomo ese valor
				notaPROGRAMACION = NotaPROGRAMACION.nextInt();
				//si la nota es menor o igual a 0 o mayor o igual a 10
				if (notaPROGRAMACION <=0 || notaPROGRAMACION >=10) 
				{
					//muestro mensaje de error
					System.out.println("No se puede tener una nota inferior a 0 o superior a 10");
					//declaro la nota de programacion como nula
					notaPROGRAMACION = 0;
				}
			}
			else if (opc == 2) 
			{
				//pido nota lenguaje de marcas
				System.out.println("Dame la nota de Lenguaje de Marcas: ");
				//tomo la nota de lenguaje de marcas
				notaLGMS = NotaLGMS.nextInt();
				//si la nota es menor o igual a 0 o mayor o igual a 10
				if (notaLGMS <=0 || notaLGMS >=10) 
				{
					//muestro mensaje de error
					System.out.println("No se puede tener una nota inferior a 0 o superior a 10");
					//declaro la nota de lenguaje de marcas como nula
					notaLGMS = 0;
				}
			}
			//si usuario elige 0
			else if (opc == 0)
			{
				//muestro resultado
				System.out.println("Calificaciones DAW");
				//si la nota de programacion es 0
				if (notaPROGRAMACION == 0) 
				{
					//el modulo de programacion no evalua
					System.out.println("Módulo de Programación: NOEV");
				}
				else
				{
					//el  modulo de programacion evalua
					System.out.println("Módulo de Programación: " + notaPROGRAMACION);
				}
				//si la nota de lenguaje de marcas es 0
				if (notaLGMS == 0) 
				{
					//el modulo de lenguaje de marcas no evalua
					System.out.println("Módulo de Lenguaje de Marcas: NOEV");
				}
				else
				{
					//el modulo de lenguaje de marcas evalua
					System.out.println("Módulo de Lenguaje de Marcas: " + notaLGMS);
				}
			}
			else
			{
				//mensaje de error en caso de que el usuario introduzca un valor que no sea 0, 1 o 2
				System.out.println("Error, se debe de introducir un numero del 0 al 2\nIntentalo de nuevo...");
			}
					
		} 
		while (opc!=0);
		
		//cerrar los scaner para evitar posibles problemas
		Opcion.close();
		NotaPROGRAMACION.close();
		NotaLGMS.close();
	}

}
