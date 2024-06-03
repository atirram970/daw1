package unidad6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {
        // Lee Por teclado un fichero y texto, escribe el texto en el archivo
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el nombre y ruta de un fichero: ");
        String ruta = "ficheros/" + scan.nextLine();
        System.out.print("Dame el texto que deseas introducir en el fichero: ");
        String texto = scan.nextLine();
        escribir(ruta, texto);
        String textoModificado = intercambiarMayusYMinus(ruta);
        System.out.println("Texto modificado: " + textoModificado);
        scan.close();
    }

    private static void escribir(String ruta, String texto) {
        try {
            FileWriter escritor = new FileWriter(ruta);
            escritor.write(texto);
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String intercambiarMayusYMinus(String ruta) {
        StringBuilder textoModificado = new StringBuilder();
        try {
            FileReader lector = new FileReader(ruta);
            int valor = lector.read();

            while (valor != -1) {
                char caracter = (char) valor;
                if (Character.isLowerCase(caracter)) {
                    caracter = Character.toUpperCase(caracter);
                } else if (Character.isUpperCase(caracter)) {
                    caracter = Character.toLowerCase(caracter);
                }
                textoModificado.append(caracter);
                valor = lector.read();
            }

            lector.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textoModificado.toString();
    }
}
