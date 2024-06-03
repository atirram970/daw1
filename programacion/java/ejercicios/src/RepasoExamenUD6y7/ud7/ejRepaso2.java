package RepasoExamenUD6y7.ud7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejRepaso2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la ruta del archivo
        System.out.print("Ingrese la ruta del archivo: ");
        File file = new File(scanner.nextLine());

        // Pedir el texto a escribir en el archivo
        System.out.print("Ingrese el texto a escribir: ");
        String textToWrite = scanner.nextLine();

        // Escribir el texto en el archivo
        String textWithAlternatingCase = getTextWithAlternatingCase(textToWrite);
        writeTextToFile(file, textWithAlternatingCase);

        // Mostrar el texto con alternancia de mayúsculas y minúsculas
        System.out.println("Texto con alternancia de mayúsculas y minúsculas: " + textWithAlternatingCase);
    }

    public static void writeTextToFile(File file, String textToWrite) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(textToWrite);
            bufferedWriter.flush();
            bufferedWriter.close();

            System.out.println("Texto escrito en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static String getTextWithAlternatingCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    result.append(Character.toLowerCase(c));
                } else {
                    result.append(Character.toUpperCase(c));
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
