package unidad6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable {
	// Leeremos objetos del fichero
	private static ObjectInputStream objReader;
	// Escribiremos objetos en el fichero
	private ObjectOutputStream objWriter;
	
	public void escribirObjeto(Object obj) {
		try {
			final String filePath = "ficheros/objetoSerial.dat";
			objWriter = new ObjectOutputStream(new FileOutputStream(filePath, true));
			objWriter.writeObject(obj);
			System.out.println("Datos guardados en el fichero " + filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Object leerObjeto(String rutaFichero) {
		Object obj = null;
		try {
			objReader = new ObjectInputStream(new FileInputStream(rutaFichero));
			obj = objReader.readObject();
			System.out.println("Datos leidos del fichero " + rutaFichero);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
