package com.adriantirado.tarea2;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int entradaUSU = 7;
        Scanner scannerUSU = new Scanner(System.in);

        while (entradaUSU != 0) {
            double resultado;
            System.out.println("1 - Suma\n" + "2 - Resta\n" + "3 - Multiplicación\n" + "4 – División\n" + "5 - Raíz cuadrada\n" + "6 – Potencia\n" + "0 - Salir del programa\n: ");
            entradaUSU = scannerUSU.nextInt();

            switch (entradaUSU) 
            {
                case 1: 
                {
                    System.out.println("Has elegido sumar");
                    System.out.println("Introduce el primer numero: ");
                    int N1 = scannerUSU.nextInt();
                    System.out.println("Introduce el segundo numero: ");
                    int N2 = scannerUSU.nextInt();
                    resultado = N1 + N2;
                    System.out.println("El resultado de sumar " + N1 + " más " + N2 + " es: " + resultado);
                    break;
                }
                case 2: 
                {
                    System.out.println("Has elegido restar");
                    System.out.println("Introduce el primer numero: ");
                    int N1 = scannerUSU.nextInt();
                    System.out.println("Introduce el segundo numero: ");
                    int N2 = scannerUSU.nextInt();
                    resultado = N1 - N2;
                    System.out.println("El resultado de restar " + N1 + " menos " + N2 + " es: " + resultado);
                    break;
                }
                case 3: 
                {
                    System.out.println("Has elegido multiplicar");
                    System.out.println("Introduce el primer numero: ");
                    int N1 = scannerUSU.nextInt();
                    System.out.println("Introduce el segundo numero: ");
                    int N2 = scannerUSU.nextInt();
                    resultado = N1 * N2;
                    System.out.println("El resultado de multiplicar " + N1 + " por " + N2 + " es: " + resultado);
                    break;
                }
                case 4: 
                {
                    System.out.println("Has elegido dividir");
                    System.out.println("Introduce el primer numero: ");
                    int N1 = scannerUSU.nextInt();
                    System.out.println("Introduce el segundo numero: ");
                    int N2 = scannerUSU.nextInt();
                    resultado = N1 / N2;
                    System.out.println("El resultado de dividir " + N1 + " entre " + N2 + " es: " + resultado);
                    break;
                }
                case 5: 
                {
                    System.out.println("Has elegido hacer la raiz cuadrada");
                    System.out.println("Introduce el primer numero: ");
                    int N1 = scannerUSU.nextInt();
                   
                    resultado = Math.sqrt(N1);
                    System.out.println("El resultado de la raiz cuadrada de: " + N1 + " es: " + resultado);
                    break;
                }
                case 6: 
                {
                    System.out.println("Has elegido hacer la potencia");
                    System.out.println("Introduce el numero: ");
                    int NUM = scannerUSU.nextInt();
                    System.out.println("Introduce la potencia: ");
                    int POT = scannerUSU.nextInt();
                    resultado = NUM ^ POT;
                    System.out.println("El resultado de la potencia de: " + NUM + " elevado a " + POT + " es: " + resultado);
                    break;
                }
                default:
                    System.out.println("Entrada incorrecta");
            }
        }
        scannerUSU.close();
    }
}