package com.Adrian.tarea3;

import java.util.Scanner;
import java.util.Random;

public class RuletaSuerte 
{
    public static void main(String[] args) 
    {
        String[] platos = 
        {
            "Risotto con setas y parmesano",
            "Pollo al curry con arroz basmati",
            "Pescado en salsa de limón y alcaparras",
            "Ensalada de quinoa con aguacate y aderezo cítrico",
            "Ternera estofada con patatas y zanahorias",
            "Sushi de salmón y aguacate fresco",
            "Pizza con mozzarella y albahaca",
            "Lasaña de carne con ricotta y espinacas",
            "Tarta de chocolate con ganache y frambuesas",
            "Tacos de carnitas con salsa de mango"
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean continuar = true;
        while (continuar) 
        {
            System.out.println("1.- Jugar");
            System.out.println("2.- Finalizar el juego");

            int opcion = scanner.nextInt();

            if (opcion == 1) 
            {
                String fraseElegida = platos[random.nextInt(platos.length)];
                StringBuilder progresoFrase = new StringBuilder(fraseElegida.replaceAll("[a-zA-Zñóí]", "_"));

                String opcionSubMenu = "";
                boolean fraseEncontrada = false;
                
                while (!opcionSubMenu.equals("S") && !fraseEncontrada) 
                {
                    System.out.println("Progreso: " + progresoFrase);
                    System.out.println("C.- Comprar letra");
                    System.out.println("R.- Resolver frase");
                    System.out.println("S.- Salir");

                    System.out.println(fraseElegida); //Para saber frase elegida
                    
                    opcionSubMenu = scanner.next().toUpperCase();
                    switch (opcionSubMenu) 
                    {
                        case "C":
                            System.out.print("Introduce una letra: ");
                            String letra = scanner.next().toUpperCase();

                            if (letra.length() == 1 && Character.isLetter(letra.charAt(0))) 
                            {
                                boolean letraEncontrada = false;
                                for (int i = 0; i < fraseElegida.length(); i++) 
                                {
                                    if (Character.toUpperCase(fraseElegida.charAt(i)) == letra.charAt(0)) 
                                    {
                                        progresoFrase.setCharAt(i, fraseElegida.charAt(i));
                                        letraEncontrada = true;
                                    }
                                }
                                if (!letraEncontrada) 
                                {
                                    System.out.println("La letra ingresada no está en la frase.");
                                }
                            } 
                            else 
                            {
                                System.out.println("Por favor, ingrese una letra válida.");
                            }
                            break;
                        case "R":
                            System.out.print("Introduce la frase para resolver: ");
                            scanner.nextLine(); // Limpiar el buffer del scanner
                            String fraseUsuario = scanner.nextLine().toUpperCase();

                            if (fraseUsuario.equals(fraseElegida.toUpperCase())) 
                            {
                                System.out.println("¡Enhorabuena! Has resuelto la frase.");
                                fraseEncontrada = true;
                            } 
                            else 
                            {
                                System.out.println("La frase ingresada no coincide con la frase a adivinar.");
                            }
                            break;
                        case "S":
                            System.out.println("Has elegido salir de La ruleta");
                            break;
                        default:
                            System.out.println("Opción inválida");
                    }

                    if (!continuar) 
                    {
                        break;
                    }
                }
            } 
            else if (opcion == 2) 
            {
                System.out.println("¡Hasta luego!");
                continuar = false;
            } 
            else 
            {
                System.out.println("Opción inválida");
            }
        }

        // Cierre del recurso Scanner
        scanner.close();
    }
}
