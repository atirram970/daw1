package unidad6;

import java.io.*;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class ej3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el nombre del primer fichero: ");
		String fileA = scan.nextLine();
		String rutaA = "ficheros/" + fileA;
		System.out.print("Introduce el nombre del segundo fichero: ");
		String fileB = scan.nextLine();
		String rutaB = "ficheros/" + fileB;
		System.out.print("Introduce la ruta de destino: ");
		String fileDestino = scan.nextLine();
		String rutaDestino = "ficheros/" + fileDestino + "/";
		String extAArray[] = rutaA.split("\\.");
		int extALength = extAArray.length;
		String extA = extAArray[extALength - 1];
		String extB = rutaB.split("\\.")[rutaB.split("\\.").length - 1];
		String nuevoArchivo = "";
		if (StringUtils.equalsIgnoreCase(extA, extB)) {
			int indexPuntoA = StringUtils.lastIndexOf(fileA, ".");
			int indexPuntoB = StringUtils.lastIndexOf(fileB, ".");
			String parteA = StringUtils.substring(fileA, 0, indexPuntoA);
			String parteB = StringUtils.substring(fileB, 0, indexPuntoB);
			nuevoArchivo = rutaDestino + parteA + " - " + parteB + "_copia." + extA;
		}
		
		escribirNuevoFichero(nuevoArchivo, rutaA, rutaB);
		scan.close();
	}

	private static void escribirNuevoFichero(String nuevoFichero, String ficheroA, String ficheroB) {
		try {
			FileWriter fw = new FileWriter(nuevoFichero);
			//escribimos el texto en el fichero
			FileReader fr = new FileReader(ficheroA);
			char caracter = (char)fr.read();
			while (caracter != -1) {
				fw.write(fr.read());
				caracter = (char)fr.read();
			}
			fr.close();
			
			fr = new FileReader(ficheroB);
			caracter = (char)fr.read();
			while (caracter != -1) {
                fw.write(fr.read());
            }
			fw.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
