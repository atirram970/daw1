package RepasoExamenUD6y7.ud6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ejRepaso1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Llamada al método a) para almacenar nombres en un HashSet
        HashSet<String> nombres1 = obtenerNombres(scan);
        limpiarPantalla();

        // Llamada al método a) por segunda vez
        HashSet<String> nombres2 = obtenerNombres(scan);
        limpiarPantalla();

        // Mostrar nombres que aparecen en ambos HashSet (método b)
        mostrarNombresEnAmbos(nombres1, nombres2);
        limpiarPantalla();

        // Mostrar nombres diferentes (método c)
        mostrarNombresDiferentes(nombres1, nombres2);
        limpiarPantalla();

        // Mostrar todos los nombres ordenados alfabéticamente (método d)
        mostrarNombresOrdenados(nombres1, nombres2);
        scan.close();
    }

    // Método que solicita nombres y los almacena en un HashSet hasta que se ingresa "fin"
    public static HashSet<String> obtenerNombres(Scanner scan) {
        HashSet<String> personas = new HashSet<>();
        String nombre = "";
        boolean fin = false;
        do {
            System.out.println("Dame un nombre: ");
            nombre = scan.nextLine();
            if (nombre.equals("fin")) {
                fin = true;
            } else {
                personas.add(nombre);
            }
        } while (!fin);
        return personas;
    }

    // Método para limpiar la pantalla (no es estándar, depende del sistema operativo)
    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Método para mostrar los nombres que aparecen en ambos HashSet (método b)
    public static void mostrarNombresEnAmbos(HashSet<String> nombres1, HashSet<String> nombres2) {
        System.out.println("Nombres que aparecen en ambos HashSet:");
        nombres1.retainAll(nombres2);
        for (String nombre : nombres1) {
            System.out.println(nombre);
        }
    }

    // Método para mostrar los nombres diferentes (método c)
    public static void mostrarNombresDiferentes(HashSet<String> nombres1, HashSet<String> nombres2) {
        System.out.println("Nombres diferentes:");
        HashSet<String> nombresDiferentes = new HashSet<>(nombres1);
        nombresDiferentes.addAll(nombres2);
        nombres1.retainAll(nombres2);
        nombresDiferentes.removeAll(nombres1);
        for (String nombre : nombresDiferentes) {
            System.out.println(nombre);
        }
    }

    // Método para mostrar todos los nombres ordenados alfabéticamente (método d)
    public static void mostrarNombresOrdenados(HashSet<String> nombres1, HashSet<String> nombres2) {
        System.out.println("Todos los nombres ordenados alfabéticamente:");
        List<String> nombresOrdenados = new ArrayList<>(nombres1);
        nombresOrdenados.addAll(nombres2);
        Collections.sort(nombresOrdenados);
        for (String nombre : nombresOrdenados) {
            System.out.println(nombre);
        }
    }
}
