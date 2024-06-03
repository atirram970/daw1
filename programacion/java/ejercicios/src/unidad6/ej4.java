package unidad6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// Crea una aplicación que copie un fichero binario a otra localización.
		// En lugar de leer y escribir byte a byte, crea un array de bytes con el tamaño
		// del fichero de
		// origen (utiliza el método available()), copia el contenido del fichero a este
		// array
		// y escribe a partir de este array.
		// Recuerda que debes controlar las excepciones que puedan aparecer. En caso
		// de error, mostrar el error.

		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el nombre del fichero: ");
		String fileOrigen = scan.nextLine();
		String rutaOrigen = "ficheros/" + fileOrigen;
		System.out.print("Introduce la ruta del archivo copiado: ");
		String fileDestino = scan.nextLine();
		String rutaDestino = "ficheros/" + fileDestino + "/";

		try {
			//Se usa FileInputStream y FileOutputStream porque estamos añadiendo un flujo de bytes
			FileInputStream fis = new FileInputStream(fileOrigen);
			FileOutputStream fos = new FileOutputStream(fileDestino);
			//Creamos un array de bytes que tenga de capacidad los bytes que quedan por leer
			byte[] bytes = new byte[fis.available()];
			//Leemos el flujo de entrada el número de bytes que indica el tamaño del array
			fis.read(bytes);
			//El FileOutputString escribe en el fichero de salida el flujo con el array de bytes
			fos.write(bytes);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		scan.close();
	}

}
