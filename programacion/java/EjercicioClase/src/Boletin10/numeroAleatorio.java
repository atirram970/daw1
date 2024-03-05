package Boletin10;

public class numeroAleatorio 
{

    public static void main(String[] args) 
    {
        int[] listaNumeros = new int[5];
        int numAleatorio = 0;
        int numAuxiliar = 0;

        for (int i = 0; i < 5; i++) 
        {
            boolean esIgual = true;
            do {
                numAleatorio = (int) (Math.random() * (10 - 1 + 1) + 1);
                if (numAleatorio != numAuxiliar) 
                {
                    esIgual = false;
                }
                numAuxiliar = numAleatorio;
            } 
            while (esIgual);

            listaNumeros[i] = numAleatorio;
        }

        for (int i = 0; i < 5; i++) 
        {
            System.out.println(listaNumeros[i]);
        }
    }
}
