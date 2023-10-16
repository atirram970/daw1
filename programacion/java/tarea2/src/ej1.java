/**
 * 
 */


import java.util.Scanner;

/**
 * 
 */
public class ej1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 	Escribe un programa con una cadena de texto que contenga una contraseña 
			cualquiera. Después se pedirá al usuario que introduzca la contraseña, con 3 
			intentos. Cuando acierte mostrará un mensaje de éxito. Si excede el número de 
			intentos, avisa del error y termina el programa.
		 */
		String contrasena;
		Scanner scannerUSU=new Scanner(System.in);
		String contra_usu=scannerUSU.next();
		int contador=0;
		
		do 
		{
			//contraseña por defecto
			contrasena = "12345";
			//entrada de usuario
			scannerUSU=new Scanner(System.in);
			System.out.println("Introduce la contraseña: ");
			contra_usu=scannerUSU.next();
			if ((contrasena!=contra_usu && contador<=3))
			{
				System.out.println("Intento numero: "+contador);
				contador+=1;
			}
			else
			{
				System.out.println("Has acertado!");
			}
			
		}
		while (contrasena!=contra_usu && contador<=3);
		scannerUSU.close();
	}

}