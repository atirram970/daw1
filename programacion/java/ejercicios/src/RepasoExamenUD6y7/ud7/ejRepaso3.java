package RepasoExamenUD6y7.ud7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejRepaso3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la ruta de los dos archivos
        System.out.print("Ingrese la ruta del primer archivo: ");
        File file1 = new File(scanner.nextLine());
        System.out.print("Ingrese la ruta del segundo archivo: ");
        File file2 = new File(scanner.nextLine());

        // Pedir la ruta de destino
        System.out.print("Ingrese la ruta de destino (sin el nombre del archivo): ");
        String destinationPath = scanner.nextLine();

        // Copiar y unir los archivos
        copyAndMergeFiles(file1, file2, destinationPath);
    }

    public static void copyAndMergeFiles(File file1, File file2, String destinationPath) {
        // Verificar que ambos archivos tengan la misma extensión
        if (!getFileExtension(file1).equals(getFileExtension(file2))) {
            System.out.println("Los archivos deben tener la misma extensión.");
            return;
        }

        // Crear el archivo de destino
        String destinationFileName = file1.getName().split("\\.")[0] + " - " + file2.getName().split("\\.")[0] + "_copia." + getFileExtension(file1);
        File destinationFile = new File(destinationPath + File.separator + destinationFileName);

        // Verificar si el archivo de destino ya existe
        if (destinationFile.exists()) {
            System.out.print("El archivo de destino ya existe. ¿Desea sobrescribir? (s/n): ");
            String response = new Scanner(System.in).nextLine();
            if (!response.equalsIgnoreCase("s")) {
                return;
            }
        }

        try {
            // Leer el contenido de los archivos fuente
            String content1 = readFileContent(file1);
            String content2 = readFileContent(file2);

            // Escribir el contenido en el archivo de destino
            writeFileContent(destinationFile, content1 + content2);

            System.out.println("Archivos copiados y unidos correctamente.");
        } catch (IOException e) {
            System.out.println("Error al copiar y unir los archivos: " + e.getMessage());
        }
    }

    private static String readFileContent(File file) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }
        return content.toString();
    }

    private static void writeFileContent(File file, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
        }
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf(".");
        return dotIndex > 0 ? fileName.substring(dotIndex + 1) : "";
    }
}