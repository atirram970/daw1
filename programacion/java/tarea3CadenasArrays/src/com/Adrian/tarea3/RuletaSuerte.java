package com.Adrian.tarea3;

import java.util.Scanner;

public class RuletaSuerte 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while (!salir) 
        {
            System.out.println("1.- Jugar");
            System.out.println("2.- Finalizar el juego");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            switch (opcion) 
            {
                case 1:
                    System.out.println("¡Vamos a jugar!");
                    juegoRuleta();
                    break;
                case 2:
                    System.out.println("Gracias por jugar. ¡Hasta la próxima!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige 1: para jugar o 2: para finalizar el juego.");
            }
        }
	}

	private static void juegoRuleta() 
	{
		Scanner scanner = new Scanner(System.in);
		
		//Array de todas las frases
		String[] frases = {
				"Risotto con setas y parmesano", 
				"Pollo al curry con arroz basmati", 
				"Pescado en salsa de limón y alcaparras",
				"Ensalada de quinoa con aguacate y aderezo cítrico",
				"Ternera estofada con patatas y zanahorias",
				"Sushi de salmón y aguacate fresco",
				"Sushi de salmón y aguacate fresco",
				"Lasaña de carne con ricotta y espinacas",
				"Tarta de chocolate con ganache y frambuesas",
				"Tacos de carnitas con salsa de mango"
				};
		//generar frase aleatoria y que no se repita la anterior
		 int numero = (int)(Math.random() * frases.length);
		 int ultimoNumero = numero;
		 while (numero == ultimoNumero)
		 {
			 numero = (int)(Math.random() * frases.length);
		 }
		 ultimoNumero = numero;
		 String fraseActual = frases[numero];
		 String fraseOculta = fraseActual.replaceAll("[a-zA-Z]", "_");
		 char nuevaFraseOculta = fraseOculta;
		 boolean adivinando = true;
		 while (adivinando)
		 {
			 System.out.println("C.- Comprar letra\n R.- Resolver frase\n S.- Salir");
			 int opcionJuego = scanner.nextInt();
			 switch (opcionJuego) 
			 {
             case 'C':
                 System.out.println("Introduce una letra:");
                 char letra = scanner.next().charAt(0);
                 for (int i = 0; i < fraseActual.length(); i++) 
                 {
                	 
                     if (fraseActual.charAt(i) == letra) 
                     {
                         nuevaFraseOculta.setCharAt(i, letra);
                         fraseOculta = nuevaFraseOculta;
                     }
                 }
                 break;
             case 'R':
                 System.out.println("Introduce la frase:");
                 // Limpiar el buffer
                 scanner.nextLine();  
                 String fraseIntroducida = scanner.nextLine();
                 adivinando = !resolverFrase(fraseIntroducida);
                 break;
             case 'S':
                 adivinando = false;
                 break;
         }
     }
     break;
	}
}
