package unidad6;

import java.io.File;

public class PruebaFicherosExternos {

	public static void main(String[] args) {
		try {
			//ficheros/file.txt(Apunta a la raíz de mi proyecto) y a partir de ahí
			//al directorio ficheros y al archivo archivo.txt
			File file = new File("datos.txt");
			String path = file.getAbsolutePath();
			System.out.println("ruta: " + path);
			String canonicalPath = file.getCanonicalPath();
			System.out.println("ruta canonica: " + canonicalPath);
			String name = file.getName();
			System.out.println("nombre: " + name);
			String parent = file.getParent();
			System.out.println("padre: " + parent);
			String tamanio = "" + file.getTotalSpace();
			System.out.println("tamaño: " + tamanio);
			String tamanioLibre = "" + file.getFreeSpace()/(1024*1024*1024);
			System.out.println("tamaño: " + tamanioLibre + " GB");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
