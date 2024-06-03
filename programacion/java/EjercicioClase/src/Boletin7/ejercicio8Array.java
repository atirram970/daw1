package Boletin7;

public class ejercicio8Array 
{
    public static void main(String[] args) 
    {
    	int cantidad = 20;
        int limInf = 0;
        int limSup = 100;
        int index = 0;

        int[] numeros = new int[cantidad];
        int[] temporal = new int[cantidad];
        
        //generar e introducir el numero aleatorio en el array
        for (int i = 0; i < cantidad; i++) 
        {
        	int numAleatorio = (int) (Math.floor(Math.random() * (limSup - limInf + 1)) + limInf);
            numeros[i] = numAleatorio;
        }

        //mostrar contenido del array sin modificar
        System.out.printf("Array Inicial -> ");
        for (int num : numeros) 
        {
            System.out.printf(num + " ");
        }
        System.out.println("\n");
        
        //si es par guardo los valores de numeros en las primeras celdas de mi array temporal
        
        for (int i = 0; i < cantidad; i++) 
        {
            if (numeros[i] % 2 == 0) 
            {
                temporal[index] = numeros[i];
                index++;
            }
        }

        //si es impar guardo los valores de numeros en las ultimas celdas de mi array temporal
        for (int i = 0; i < cantidad; i++) 
        {
            if (numeros[i] % 2 != 0) 
            {
                temporal[index] = numeros[i];
                index++;
            }
        }

        // Copiar los elementos del array temporal al array de numeros
        for (int i = 0; i < cantidad; i++) 
        {
            numeros[i] = temporal[i];
        }

        // Imprimir el array resultante
        System.out.printf("Array Final -> ");
        for (int num : numeros) 
        {
            System.out.printf(num + " ");
        }
    }
}