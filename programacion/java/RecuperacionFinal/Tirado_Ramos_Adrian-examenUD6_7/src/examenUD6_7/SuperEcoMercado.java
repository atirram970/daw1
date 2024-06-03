package examenUD6_7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SuperEcoMercado {
	private static Map<String, Float> productos = new HashMap<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Map<String, Float> productos = new HashMap<String, Float>();
		boolean salir = false;
		String[] accionArray = new String[2];
		String[] lineaPartida = new String[2];
		boolean cestaVacia = false;
		String nombProducto = "";
		float precioProducto = 0f;
		String nombreFichero = "";
		String accion =  "";
		String producto = "";
		HashMap<String, Integer> cesta = new HashMap<String, Integer>();
		String nProductos = "";
		
		try {
			while (true) {
				System.out.print("INPUT: ");
				accion = scanner.nextLine();
				if(accion.contains("UPDATE")){
					
					accionArray = accion.split(" ");
					nombreFichero = accionArray[1];
					FileReader fr = new FileReader(nombreFichero);
					BufferedReader br = new BufferedReader(fr);
					String linea = br.readLine();
					
					if (null != linea) {
						while (null != linea) {
							lineaPartida = linea.split(";");
							nombProducto = lineaPartida[0];
							precioProducto = Float.parseFloat(lineaPartida[1]);
							productos.put(nombProducto, precioProducto);
							linea = br.readLine();
						}
						br.close();
					}
				} else if (!accion.contains("UPDATE")) {
					//Aqui la logica para tomar el texto si es texto y no hay numero luego añade 1 sino
					//lee el numero
					/*
					while (!cestaVacia) {
						nProductos = accion;
						if(esNumeroEntero(nProductos) == true) {
							producto = accion;
							
						} else { 
							if(!cesta.containsKey(producto)) {
								cesta.put(producto,nProductos);
							} else {
								cesta.remove(producto);
								cesta.put(producto, cesta.get(nProductos) + 1);
							}
						}
						producto = accion;
						System.out.print("INPUT: ");
					}
					*/
				} else if (accion.contains("0")) {
					cestaVacia = true;
					imprimirCompra(cesta);
				}
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			aiobe.printStackTrace();
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		}
	}

	// TODO: implementa tus métodos auxiliares aquí
	
	public void mostrarProductos() {
		productos.values();	
	}

	public static void imprimirCompra(HashMap<String, Integer> cesta) {
		System.out.println("Producto\tPrecio\tCantidad\tSubtotal");
		System.out.println("--------------------------------------------------");
		System.out.println(cesta.values());
		System.out.println("--------------------------------------------------");
	}
	
	/**
	 * Devuelve true si la cadena str guarda el valor de un número entero
	 * 
	 * @param str
	 * @return
	 */
	public static boolean esNumeroEntero(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		}
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	/**
	 * Devuelve una cadena de texto con el número con dos decimales
	 * @param numero
	 * @return
	 */
	public static String formateaFloat(float numero) {
		return String.format("%.2f", numero);
	}
	
	
}
