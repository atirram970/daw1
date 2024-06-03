package examen;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// Empresa mostrar sueldos
		
		//declaracion de scaner para tomar el valor del sueldo y de la opcion seguir por parte del usuario
		Scanner ScanSueldo = new Scanner(System.in);
		Scanner Seguir = new Scanner(System.in);
		//declaro la opcion seguir vacia para que no provoque problemas
		String seguir = "";
		//inicializo el sueldo del empleado a 0 para evitar problemas
		int sueldo = 0;
		//inicializo el incremento del salario en double porque necesito que se multiplique por decimales y los double son compatibles con decimales
		double incremento = 0;
		//incializo el resultado a 0 para evitar problemas
		int resultado = 0;
		
		//hago uso del bucle do-while ya que necesito que se ejecute una vez para comprobar si el usuario quiere salir o no
		do 
		{
			//le pido al usuario el sueldo del empleado
			System.out.println("Dame el sueldo del empleado: ");
			//guardo el sueldo en la variable integer "sueldo"
			sueldo = ScanSueldo.nextInt();
			//si el sueldo es mayor o igal a 0 y es menor o igual a 9000€ el incremento es del 20%
			if (sueldo >= 0 && sueldo <= 9000) 
			{
				incremento = sueldo * 0.2;
			}
			//si el sueldo es mayor a 9000 sin incluirlo y menor o igual a 15000€ el incremento es del 10%
			else if (sueldo > 9000 && sueldo <= 15000) 
			{
				incremento = sueldo * 0.1;
			}
			//si el sueldo es mayor a 15000 sin incluirlo y menor o igual a 20000€ el incremento es del 5%
			else if (sueldo > 15000 && sueldo <= 20000) 
			{
				incremento = sueldo * 0.05;
			}
			//si el sueldo es mayor a 20000€ el incremento es del 1%
			else if (sueldo > 20000) 
			{
				incremento = sueldo * 0.01;
			}
			
			//declaro resultado como la suma del sueldo + el casting de incremento de double a integer para que se redondee automaticamente
			//tambien se podria haber usado Math.round
			resultado =  sueldo + (int) incremento;
			
			//muestro el menu del salario con su sueldo actual, el incremento y el total
			System.out.println("Sueldo actual: " + sueldo + "\nIncremento: " + (int) incremento + "\n Nuevo sueldo =" + resultado);
			//le pregunto al usuario si desea salir del programa
			System.out.println("¿Desea salir S/N? ");
			//guardo la variable de tipo String
			seguir = ScanSueldo.next();
			
		} while (!seguir.equalsIgnoreCase("S"));
		//este while se ejecutara mientras que seguir no equivalga a "s" o a "S" ya que el ignoreCase significa que tome el valor 
		//ya sea mayuscula o minuscula
		
		//cierro los dos escaner para que no ocurran problemas, ya que si se dejan abiertos ocurren ciertos fallos
		ScanSueldo.close();
		Seguir.close();
	}

}
