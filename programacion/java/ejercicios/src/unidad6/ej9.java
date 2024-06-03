package unidad6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ej9 {

	public static void main(String[] args) {
		// Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
		// contenidas en un fichero de texto. El nombre del fichero que contiene las
		// palabras se debe pasar como argumento en la línea de comandos. El nombre
		// del fichero resultado debe ser el mismo que el original añadiendo la
		// coletilla sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una línea

		Scanner scan = new Scanner(System.in);

		System.out.println("Dame la ruta y nombre del fichero: ");
		String ruta = scan.nextLine();

		File fichero = new File(ruta);

		if (fichero.exists()) {
			System.out.println("El fichero existe");

			try {
				BufferedReader br = new BufferedReader(new FileReader(fichero));
				List<String> palabras = br.lines().collect(Collectors.toList());
				Collections.sort(palabras);
				FileWriter fw = new FileWriter(fichero.getAbsolutePath() + "_sort.txt");
			} catch (IOException e) {
				System.out.println("Error al leer o escribir el fichero: " + e.getMessage());
			}
		} else {
			System.out.println("El fichero no existe, no se puede continuar");
		}

		scan.close();
	}

}