package unidad6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej7 {

    public static void main(String[] args) {
        // Nombre del archivo
        Scanner scan = new Scanner(System.in);
        final String rutaArchivo = "ficheros/primos.dat";
        int cantidadNumLeer = 0;
        boolean correcto = false;
        int contador = 0;

        do {
            System.out.print("Introduce el número de números a leer: ");
            cantidadNumLeer = scan.nextInt();

            if (cantidadNumLeer > 0) {
                correcto = true;
            }
        } while (!correcto);

        // Limpiar el buffer del Scanner
        scan.nextLine();

        try {
        	BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
            System.out.println("Leyendo números del archivo:");
            String linea;
            while ((linea = br.readLine()) != null && contador < cantidadNumLeer) {
                int num = Integer.parseInt(linea);
                System.out.println(num);
                contador++;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        if (cantidadNumLeer > contador) {
            System.out.println("Has pedido leer: " + cantidadNumLeer + " números, pero hay solo: " + contador + " números en el archivo.");
        } else {
            System.out.println("Has pedido leer: " + cantidadNumLeer + " números.");
        }
    }

}
