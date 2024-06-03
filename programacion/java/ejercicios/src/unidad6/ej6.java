package unidad6;

import java.io.*;

public class ej6 {
    public static void main(String[] args) {
        // Nombre del archivo
        final String nombreArchivo = "ficheros/primos.dat";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (int i = 0; i <= 500; i++) {
                if (esPrimo(i)) {
                    writer.write(Integer.toString(i));
                    writer.newLine();
                }
            }
            System.out.println("Números primos entre 1 y 500 guardados en el archivo " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    // Función para verificar si un número es primo
    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
