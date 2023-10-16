/**
 * 
 */


import java.util.Scanner;

/**
 * 
 */
public class ej3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 	~~~~~~~~~~~~~~| CALCULADORA |~~~~~~~~~~~~~~
			1 - Suma
			2 - Resta
			3 - Multiplicación
			4 – División
			5 - Raíz cuadrada
			6 – Potencia
			0 - Salir del programa
			~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			Posteriormente se quedará a la espera de que el usuario introduzca un valor 
			numérico.
			Si introduce un 0 el programa mostrará un mensaje de despedida, que habrá 
			que confirmar pulsando cualquier tecla y después finalizará.
			Si se pulsa un valor comprendido entre 1 y 6 pedirá al usuario dos números y 
			devolverá el resultado de la operación escogida.
			Si se pulsa cualquier otra cosa el programa volverá a mostrar el menú tras un 
			mensaje de error instando a introducir un valor correcto
		 */
		int entradaUSU=7;
		
		do 
		{
			//declaracion ambos numeros
			Scanner scannerNUM1=new Scanner(System.in);
			int num1=scannerNUM1.nextInt();
			
			Scanner scannerNUM2=new Scanner(System.in);
			int num2=scannerNUM2.nextInt();
			
			//declaracion resultado
			double resultado;
			
			Scanner scannerUSU=new Scanner(System.in);
			System.out.println("1 - Suma\r\n"
					+ "			2 - Resta\r\n"
					+ "			3 - Multiplicación\r\n"
					+ "			4 – División\r\n"
					+ "			5 - Raíz cuadrada\r\n"
					+ "			6 – Potencia\r\n"
					+ "			0 - Salir del programa\n: ");
			entradaUSU=scannerUSU.nextInt();
			
			switch (entradaUSU) {
			case 1:
			{
				System.out.println("Has elegido sumar");
				
				scannerNUM1=new Scanner(System.in);
				System.out.println("Introduce el primer numero: ");
				num1=scannerNUM1.nextInt();
				
				scannerNUM2=new Scanner(System.in);
				System.out.println("Introduce el segundo numero: ");
				num2=scannerNUM2.nextInt();
				resultado=num1+num2;
				System.out.println("El resultado de sumar "+num1+" y "+num2+" es: "+resultado);
				break;
			}
			case 2:
			{
				System.out.println("Has elegido restar");
				
				scannerNUM1=new Scanner(System.in);
				System.out.println("Introduce el primer numero: ");
				num1=scannerNUM1.nextInt();
				
				scannerNUM2=new Scanner(System.in);
				System.out.println("Introduce el segundo numero: ");
				num2=scannerNUM2.nextInt();
				resultado=num1-num2;
				System.out.println("El resultado de restar "+num1+" y "+num2+" es: "+resultado);
				break;
			}
			case 3:
			{
				System.out.println("Has elegido multiplicar");
				
				scannerNUM1=new Scanner(System.in);
				System.out.println("Introduce el primer numero: ");
				num1=scannerNUM1.nextInt();
				
				scannerNUM2=new Scanner(System.in);
				System.out.println("Introduce el segundo numero: ");
				num2=scannerNUM2.nextInt();
				resultado=num1*num2;
				System.out.println("El resultado de multiplicar "+num1+" y "+num2+" es: "+resultado);
				break;
			}
			case 4:
			{
				System.out.println("Has elegido dividir");
				
				scannerNUM1=new Scanner(System.in);
				System.out.println("Introduce el primer numero: ");
				num1=scannerNUM1.nextInt();
				
				scannerNUM2=new Scanner(System.in);
				System.out.println("Introduce el segundo numero: ");
				num2=scannerNUM2.nextInt();
				resultado=num1/num2;
				System.out.println("El resultado de dividir "+num1+" y "+num2+" es: "+resultado);
				break;
			}
			case 5:
			{
				System.out.println("Has elegido hacer la raiz cuadrada");
				
				scannerNUM1=new Scanner(System.in);
				System.out.println("Introduce el primer numero: ");
				num1=scannerNUM1.nextInt();
				
				resultado=num1;
				System.out.println("El resultado de hacer la raiz cuadrada de: "+num1+" es: "+resultado);
				break;
			}
			case 6:
			{
				System.out.println("Has elegido hacer la potencia");
				
				scannerNUM1=new Scanner(System.in);
				System.out.println("Introduce el primer numero: ");
				num1=scannerNUM1.nextInt();
				
				resultado=num1*num1;
				System.out.println("El resultado de hacer la potencia de: "+num1+" es: "+resultado);
				break;
			}
			default:
				System.out.println("Entrada incorrecta");;
			}
		}
		while (entradaUSU!=0);
	}

}