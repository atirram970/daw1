/**
 * 
 */
package Boletin2;

import java.util.Scanner;

/**
 * 
 */
public class ejCalculaTipoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ejercicio calcular nota tipo test
		
		//Pedimos la cantidad de preguntas
		Scanner scanner1=new Scanner(System.in);
		System.out.println("Introduce el número de preguntas: ");
		int numPreguntas=scanner1.nextInt();
		
		//Pedimos la cantidad de aciertos
		Scanner scanner2=new Scanner(System.in);
		System.out.println("Introduce el número de aciertos: ");
		int numAciertos=scanner2.nextInt();
		
		//Pedimos la cantidad de errores
		Scanner scanner3=new Scanner(System.in);
		System.out.println("Introduce el número de errores: ");
		int numErrores=scanner3.nextInt();
		
		//colocamos la formula
		double Nota=((numAciertos-(numErrores/2f))*10f)/numPreguntas;
		//transformamos la nota a int
		int NotaRedondeada = (int) Nota;

		//Prueba de errores
		int totalRespuestas=(numPreguntas+numErrores);
		if (totalRespuestas>numPreguntas)
		{
			System.out.println("Número érroneo de respuestas");
			System.exit(0);
		}
		
		//Mostrar ambas notas en caso de error
		System.out.println(Nota);
		System.out.println(NotaRedondeada);
		
		//Encargado de elegir el mes segun el numero
		switch ( NotaRedondeada ) 
		{
		case 0,1,2,3,4: {
			System.out.println("Insuficiente");
			break;
		}
		case 5,6: {
			System.out.println("Suficiente");
			break;
		}
		case 7,8: {
			System.out.println("Notable");
			break;
		}
		case 9,10: {
			System.out.println("Sobresaliente");
			break;
		}
		default:
			System.out.println("Se ha introducido un valor incorrecto");
		}
		scanner1.close();
		scanner2.close();
		scanner3.close();
	}

}
