package unidad5.cuentasBancarias;
import java.util.HashMap;
import java.util.Scanner;

public class ejRepaso5 {

    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String palabra = "";

        diccionario.put("amor", "Love");
        diccionario.put("casa", "House");
        diccionario.put("amigo", "Friend");
        diccionario.put("tiempo", "Time");
        diccionario.put("agua", "Water");
        diccionario.put("árbol", "Tree");
        diccionario.put("sol", "Sun");
        diccionario.put("luna", "Moon");
        diccionario.put("felicidad", "Happiness");
        diccionario.put("tristeza", "Sadness");
        diccionario.put("familia", "Family");
        diccionario.put("libro", "Book");
        diccionario.put("perro", "Dog");
        diccionario.put("gato", "Cat");
        diccionario.put("comida", "Food");
        diccionario.put("sonrisa", "Smile");
        diccionario.put("sueño", "Dream");
        diccionario.put("esperanza", "Hope");
        diccionario.put("cielo", "Sky");
        diccionario.put("tierra", "Earth");

        System.out.print("Dame una palabra en español: ");
        palabra = scan.next().toLowerCase(); // Convertir la palabra ingresada a minúsculas

        if (diccionario.containsKey(palabra)) {
            System.out.println(palabra + " Significa: " + diccionario.get(palabra));
        } else {
            System.out.println("La palabra no está en el diccionario.");
        }

        scan.close();
    }
}
