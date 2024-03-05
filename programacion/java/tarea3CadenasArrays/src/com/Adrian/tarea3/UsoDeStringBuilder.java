package com.Adrian.tarea3;

import java.util.Scanner;

public class UsoDeStringBuilder 
{
    public static void main(String[] args) 
    {
    	Scanner scanner = new Scanner(System.in);
    	
        // Ejemplo de una variable de tipo String
    	System.out.print("Introduzca una palabra: ");
        String fraseEntrada = scanner.next();
        scanner.nextLine();
        // Dos objetos StringBuilder para almacenar vocales y consonantes
        StringBuilder constructorVocales = new StringBuilder();
        StringBuilder constructorConsonantes = new StringBuilder();

        // Iterar a través de la cadena de entrada
        for (int i = 0; i < fraseEntrada.length(); i++) 
        {
            char caracterActual = fraseEntrada.charAt(i);

            // Verificar si el carácter actual es una vocal o una consonante
            if (esVocal(caracterActual)) 
            {
                constructorVocales.append(caracterActual);
            } 
            else 
            {
                constructorConsonantes.append(caracterActual);
            }
        }

        // Imprimir las vocales y consonantes
        System.out.println("Vocales: " + constructorVocales.toString());
        System.out.println("Consonantes: " + constructorConsonantes.toString());
    }

    // Método para verificar si un carácter es una vocal
    private static boolean esVocal(char c) 
    {
        return "aeiouAEIOUáéíóúÁÉÍÓÚ".indexOf(c) != -1;
    }
}
