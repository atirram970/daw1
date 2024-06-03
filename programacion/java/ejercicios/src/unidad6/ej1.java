package unidad6;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ej1 {

	static final String FILE_IN = "ficheros/entrada.txt";
	static final String FILE_OUT = "ficheros/salida.txt";

	public static void main(String[] args) {
		try {
			File ficheroEntreada = new File(FILE_IN);
			FileReader fr = new FileReader(ficheroEntreada);

			int valor = fr.read();
			// El valor -1 representa el final de fichero (EOF)
			String line = "";
			while (valor != -1) {
				if (valor != 10 && valor != 13 && valor != 32 &&valor != -1) {
					line += (char) valor;
				} else {
					System.out.println(line);
					line = "";
				}
				valor = fr.read();
			}
			System.out.println(line);
			fr.close();
		} catch (IOException e) {
			System.out.println("Problemas con el E/S" + e);
		}
	}
}
