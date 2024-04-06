package unidad6;

import java.util.HashMap;

/**
 * Crea una aplicación que mediante una coleccion de tipo map
 * (selecciona la mas adecuada) sea capaz de almacenar un identificador
 * de usuario asociado a una contraseña alfanumerica. Haz un método
 * para insertar el par identificador-contraseña y otro para mostrar todos los pares
 */

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class EjercicioPropuestoColecciones4 {
	static Scanner scan = new Scanner(System.in);
	static Map<String, String> usuarios = new HashMap<String, String>();
	
	public static void main(String[] args) {
		insertarIdentificadorYContrasenia();
		insertarIdentificadorYContrasenia();
		mostrarIdContrasenia();
	}
	
	public static void insertarIdentificadorYContrasenia() {
		System.out.println("Introduce el identificador: ");
        String id = scan.nextLine();
        System.out.println("Introduce la contraseña: ");
        String contrasenia = scan.nextLine();
        usuarios.put(id, contrasenia);
	}
	
	public static void mostrarIdContrasenia() {
		//for (String id : usuarios.keySet()) {
		//	System.out.println(id + " - " + usuarios.get(id));
		//}
		
		for (Entry<String, String> par : usuarios.entrySet()) {
			System.out.println(par.getKey() + " - " + par.getValue());
		}
	}
}