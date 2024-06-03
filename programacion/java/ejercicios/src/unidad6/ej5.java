package unidad6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean positivo = false;
        int cantidadAleatorios = 0;
        
        do {
            System.out.print("Introduce Nº de numeros aleatorios que se van a generar: ");
            cantidadAleatorios = scan.nextInt();
            
            if(cantidadAleatorios > 0) {
                positivo = true;
            }
        } while (!positivo);
        
        scan.nextLine(); // Limpiar el buffer del Scanner
        
        System.out.println("Dame la ruta del fichero en el que se van a escribir los numeros: ");
        String ruta = scan.nextLine();
        
        escribeFichero(cantidadAleatorios, ruta);
        leeFichero(ruta);
    }

    private static void escribeFichero(int cantidadAleatorios, String ruta) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta, true))) {
            for (int i = 0; i < cantidadAleatorios; i++) {
                int numAleatorio = generarNumAleatorio(0, 100);
                dos.writeInt(numAleatorio);
            }
            System.out.println("Números escritos en el fichero.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }

    private static void leeFichero(String ruta) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(ruta))) {
            System.out.println("Leyendo números del fichero:");
            while (dis.available() > 0) {
                int num = dis.readInt();
                System.out.println(num);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    private static int generarNumAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
