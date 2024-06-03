package RepasoExamenUD6y7.ud7;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ejRepaso1 {
    public static void main(String[] args) {
        try {
            // Abrir el archivo
            File file = new File("ficheros/archivo.txt");
            FileReader fileReader = new FileReader(file);

            int character;
            while ((character = fileReader.read()) != -1) {
                if (character != ' ') {
                    System.out.print((char) character);
                }
            }
            System.out.println();

            // Cerrar el archivo
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}
