package RepasoExamenUD6y7;

import java.util.Scanner;
import java.util.TreeMap;

public class ejRepaso4 {

    public static void main(String[] args) {
    	TreeMap<Integer, String> usuarios = new TreeMap<Integer, String>();
    	insertarUsuarios(usuarios);
    	mostrarUsuarios(usuarios);
    }

	private static void insertarUsuarios(TreeMap<Integer, String> usuarios) {
		Scanner scan = new Scanner(System.in);
		int id = 0;
		String contrasenia = "";
		
		System.out.print("Dame un id de usuario: ");
		id = scan.nextInt();
		
		System.out.println("Dame la contraseña del usuario: ");
		scan.nextLine();
		contrasenia = scan.nextLine();
		
		usuarios.put(id, contrasenia);
		scan.close();
	}
	
	private static void mostrarUsuarios(TreeMap<Integer, String> usuarios) {
        System.out.println("Usuarios:");
        for (Integer id : usuarios.keySet()) {
            String contrasenia = usuarios.get(id);
            System.out.println("ID: " + id + ", Contraseña: " + contrasenia);
        }
    }
}
