package unidad6;

// 3) Crea una aplicación que pida la ruta de dos ficheros de texto y de una
// ruta de destino (solo la ruta a partir de la carpeta ficheros de nuestro
// proyecto, sin fichero al final). Debes copiar el contenido de los dos
// ficheros en uno, este tendrá el nombre de los dos ficheros separados por un
// guión, acabado con _copia y con la misma extensión que los dos ficheros.
// Solo podrá realizarse la copia si ambos ficheros tienen la misma extensión,
// este se guardara en la ruta donde le hayamos indicado por teclado.
// Para unir los ficheros en uno, crea un método donde le pases como parámetro
// todas las rutas. En este método, aparte de copiar debe comprobar que si
// existe el fichero de destino, nos muestre un mensaje informándonos de si
// queremos sobrescribir el fichero. Te recomiendo usar la clase File.
// Por ejemplo, si tengo un fichero A.txt con «ABC» como contenido, un fichero
// B.txt con «DEF» y una ruta de destino salida, el resultado sera un fichero
// llamado A - B_copia.txt en la ruta ficheros/salida con el contenido
// «ABCDEF».
// Puedes crear submétodos para realizar la copia de ficheros, piensa también
// como podrías optimizar esta copia, si los ficheros tuvieran mucho
// contenido.
// Recuerda que debes controlar las excepciones que puedan aparecer. En caso
// de error, mostrar la información del error.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class ej8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el nombre del primer fichero");
		String fileA = scan.nextLine();
		String rutaA = "ficheros/" + fileA;
		System.out.println("Introduce el nombre del segundo fichero");
		String fileB = scan.nextLine();
		String rutaB = "ficheros/" + fileB;
		System.out.println("Introduce la ruta de destino");
		String fileDestino = scan.nextLine();
		String rutaDestino = "ficheros/" + fileDestino + "/";
		String[] extAArray = rutaA.split("\\.");
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
		scan.close();
	}

}