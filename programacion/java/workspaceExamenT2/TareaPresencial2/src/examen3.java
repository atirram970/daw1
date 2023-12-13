import java.util.InputMismatchException;
import java.util.Scanner;

public class examen3 
{

	public static void main(String[] args) 
	{
		//declaracion e inicialización de variables
		Scanner scan = new Scanner(System.in);
		double peso = 0;
		double estatura = 0;
		double estaturaAlCuadrado = 0;
		double imc = 0;
		String rangoIMC = "";
		
		//un try para control de errores
		try 
		{
			//pedir peso
			System.out.println("Dame tu peso en kilogramos");
			peso = scan.nextDouble();
			
			//pedir estatura (el usuario debe de introducir su estatura en centimetros --> 174)
			System.out.println("Dame tu estatura en centimetros");
			estatura = scan.nextDouble();
			
			//calcular la potencia de la estatura
			estaturaAlCuadrado = Math.pow(estatura/100, 2);
			
			//calcular IMC
			imc = peso / estaturaAlCuadrado;
			
			//Calcular rangoIMC
			if (imc < 18.5) 
			{
				rangoIMC = "infrapeso";
			}
			else if (imc >= 18.5 && imc <=24.99) 
			{
				rangoIMC = "Ideal";
			}
			else if (imc > 24.99 && imc <= 29.99) 
			{
				rangoIMC = "Sobrepeso";
			}
			else if (imc >= 30) 
			{
				rangoIMC = "Obeso";
			}
			
			//Calcular rangoIdeal
			double rangoIdealMinimo = estaturaAlCuadrado * 18.5;
			double rangoIdealMaximo = estaturaAlCuadrado * 24.99;
			
			//mostrar resultado
			System.out.println("Estatura: " + estatura/100 + "m\tPeso: " + (int)peso + " kg");
			System.out.println("Su IMC es de " + imc + " y está dentro del rango " + rangoIMC);
			System.out.println("Su rango ideal está entre " + (int)rangoIdealMinimo + " y " + (int)rangoIdealMaximo + " kg");
		} 
		catch (InputMismatchException e) 
		{
			System.out.println("Se deben de introducir numeros enteros");
		}
	}

}

