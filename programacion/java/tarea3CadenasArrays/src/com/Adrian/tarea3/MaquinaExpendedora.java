package com.Adrian.tarea3;

import java.util.Scanner;

public class MaquinaExpendedora 
{

    // Definición de productos y cantidades iniciales
    private static String[][] productos = 
    {
            {"Coca-Cola", "Sprite", "Fanta naranja"},
            {"Fanta limón", "Red Bull", "Monster"},
            {"Pepsi", "Schweppes tónica", "Agua mineral"},
            {"Cruzcampo", "Heineken", "Zumo de piña"}
    };

    private static int[][] cantidad = 
    {
            {5, 5, 5},
            {5, 5, 5},
            {5, 5, 5},
            {5, 5, 5}
    };

    private static int ventasTotales = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bucle principal del programa
        while (true) 
        {
            // Muestra el menú al usuario
            mostrarMenu();

            // Lee la opción seleccionada por el usuario
            int opcion = scanner.nextInt();

            // Realiza la acción correspondiente según la opción seleccionada
            switch (opcion) 
            {
                case 1:
                    pedirBebida(scanner);
                    break;
                case 2:
                    mostrarBebidasDisponibles();
                    break;
                case 3:
                    rellenarBebidas(scanner);
                    break;
                case 4:
                    apagarMaquina();
                    return;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo (1-4)");
            }
        }
    }

    // Muestra el menú de opciones al usuario
    private static void mostrarMenu() 
    {
        System.out.println("\nMenú:");
        System.out.println("1. Pedir bebida");
        System.out.println("2. Mostrar bebidas disponibles");
        System.out.println("3. Rellenar bebidas (Técnico)");
        System.out.println("4. Apagar máquina");
        System.out.print("Seleccione una opción: ");
    }

    // Procesa la opción de pedir una bebida
    private static void pedirBebida(Scanner scanner) 
    {
        System.out.print("Introduzca el código de la bebida que desea: ");
        int codigo = scanner.nextInt();

        //calcular posicion fila y columna
        int fila = ( codigo - 1 ) / 3; //por ejemplo el 4º --> (4-1)/3 = 3/3 = 1
        int columna = ( codigo - 1 ) % 3; //por ejemplo el 4º --> (4-1)/3 = 3/3 = resto es igual a 0

        // Verifica si el código es válido y hay unidades disponibles
        if (esCodigoValido(fila, columna) && cantidad[fila][columna] > 0) 
        {
            System.out.println("Dispensando " + productos[fila][columna]);
            cantidad[fila][columna]--;
            ventasTotales++;
        } 
        else 
        {
            System.out.println("No hay más unidades de esta bebida en la máquina.");
        }
    }

    // Verifica si una posición dada es válida en la matriz
    private static boolean esCodigoValido(int fila, int columna) 
    {
        return fila >= 0 && fila < productos.length && columna >= 0 && columna < productos[0].length;
    }

    // Muestra las bebidas disponibles al usuario
    private static void mostrarBebidasDisponibles() 
    {
        System.out.println("\nBebidas disponibles:");
        for (int i = 0; i < productos.length; i++) 
        {
            for (int j = 0; j < productos[i].length; j++) 
            {
                if (esCodigoValido(i, j) && cantidad[i][j] > 0) 
                {
                    int codigo = i * productos[i].length + j + 1;
                    System.out.println("Código: " + codigo + ", Nombre: " + productos[i][j]);
                }
            }
        }
    }

    // Procesa la opción de rellenar bebidas (solo accesible con contraseña)
    private static void rellenarBebidas(Scanner scanner) 
    {
        System.out.print("Ingrese la contraseña de técnico: ");
        String password = scanner.next();

        // Verifica si la contraseña es correcta
        if (password.equals("MaquinaExpendedora2024")) 
        {
            System.out.print("Introduzca la posición de la bebida a recargar (fila columna): ");
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            // Verifica si la posición es válida
            if (esCodigoValido(fila, columna)) 
            {
                System.out.print("Introduzca la cantidad a recargar: ");
                int cantidadRecargar = scanner.nextInt();

                cantidad[fila][columna] += cantidadRecargar;
                System.out.println("Recarga realizada con éxito.");
            } 
            else 
            {
                System.out.println("Posición de bebida no válida.");
            }
        } 
        else 
        {
            System.out.println("Contraseña incorrecta. Acceso denegado.");
        }
    }

    // Realiza las acciones necesarias antes de apagar la máquina
    private static void apagarMaquina() 
    {
        System.out.println("Apagando la máquina expendedora.");
        System.out.println("Ventas totales: " + ventasTotales);
    }
}
