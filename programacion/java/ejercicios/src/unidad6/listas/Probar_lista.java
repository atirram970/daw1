package unidad6.listas;

import java.util.Scanner;

public class Probar_lista {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean salir = false;
		Coleccion coleccion = new Coleccion();
		
		do {
			System.out.println("Introduce el codigo: ");
			int codigo = scan.nextInt();
			if (codigo == 0) {
				salir = true;
			} else {
				System.out.println("Introduce el nombre: ");
				String nombre = scan.next();
				System.out.println("Introduce el tipo: ");
				String tipo = scan.next();
				System.out.println("Introduce el precio: ");
				double precio = scan.nextDouble();
				System.out.println("Introduce el stock: ");
				int existencia = scan.nextInt();
				Producto producto = new Producto(codigo, nombre, tipo, precio, existencia);
			}
		} while (salir);
	}
}
