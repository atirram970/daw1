package examenFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SuperEcoMercado {
    private static Map<String, Float> productos = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean compraIniciada = false;
        while (true) {
            try {
                System.out.print("INPUT: ");
                String input = scanner.nextLine();
                if (input.trim().isEmpty()) {
                    continue;
                }

                String[] linea = input.split(" ");
                if (linea.length == 0) {
                    continue;
                }

                if ("0".equals(linea[0])) {
                    mostrarCompra();
                } else if ("UPDATE".equals(linea[0]) && linea.length > 1 && compraIniciada) {
                    String archivo = linea[1];
                    actualizarProductos(archivo);
                } else if (esNumeroEntero(linea[0])) {
                    System.out.println("num entero");
                    compraIniciada = true;
                } else {
                    System.out.println("Comando no reconocido");
                }
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }
    }

    private static void mostrarCompra() {
        System.out.println("\nProducto\tPrecio\tCantidad\tSubtotal");
        System.out.println("------------------------------------------------------------------");
        for (Map.Entry<String, Float> entry : productos.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + formateaFloat(entry.getValue()) + "\t\t1\t\t" + formateaFloat(entry.getValue()));
        }
        System.out.println("------------------------------------------------------------------");
    }

    public static boolean esNumeroEntero(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String formateaFloat(float numero) {
        return String.format("%.2f", numero);
    }

    public static void actualizarProductos(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("ficheros/" + fileName));
            String line = br.readLine();
            while (null != line) {
                String[] partes = line.split(";");
                if (partes.length == 2) {
                    String producto = partes[0].trim().toUpperCase();
                    float precio = Float.parseFloat(partes[1].trim());
                    if (precio > 0) {
                        productos.put(producto, precio);
                    } else if (precio <= 0) {
                        productos.remove(producto);
                    }
                }
                line = br.readLine();
            }
            System.out.println("PRODUCTOS ACTUALIZADOS CON ÉXITO");
            br.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
