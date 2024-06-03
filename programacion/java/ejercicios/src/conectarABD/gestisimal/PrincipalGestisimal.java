package conectarABD.gestisimal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalGestisimal {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Articulo art1 = new Articulo("986438", "articulo prueba 1", 34, 40, 2);
		// Articulo artCsv = new Articulo("986441;articulo prueba
		// 4;3,3;4;10");
		// System.out.println(artCsv);
		Almacen alm = new Almacen();
		alm.altaArticulo(art1);
		boolean salir = false;
		do {
			int opc = 0;
			try {
				boolean opcionCorrecta = false;
				while (!opcionCorrecta) {
					System.out.println("MENÚ");
					System.out.println("1. Listado");
					System.out.println("2. Alta");
					System.out.println("3. Baja");
					System.out.println("4. Modificación");
					System.out.println("5. Entrada de mercancía por fichero");
					System.out.println("6. Salir");
					System.out.println("Introduce la opción deseada y pulsa enter");
					opc = sc.nextInt();
					sc.nextLine();
					String codigo;
					Articulo art;
					switch (opc) {
					case 1:
						// mostrar la lista de artículos
						alm.imprimirListadoAlmacen();
						opcionCorrecta = true;
						break;
					case 2:
						// añadir un nuevo articulo
						art = crearArticulo();
						alm.altaArticulo(art);
						opcionCorrecta = true;
						break;
					case 3:
						// eliminar un producto
						System.out.println("Introduce el código del artículo a eliminar");
						codigo = sc.nextLine();
						art = alm.getArticuloPorCodigo(codigo);
						alm.bajaArticulo(art);
						opcionCorrecta = true;
						break;
					case 4:
						// modificar un producto por su codigo
						System.out.println("Introduce el código del artículo a modificar");
						codigo = sc.nextLine();
						art = alm.getArticuloPorCodigo(codigo);
						modificarArticulo(art, alm);
						opcionCorrecta = true;
						break;
					case 5:
						System.out.println("Introduce la ruta del fichero con los artículos");
						String ruta = sc.nextLine();
						cargarFichero(ruta, alm);
						System.out.println("Fichero cargado con éxito!");
						opcionCorrecta = true;
						break;
					case 6:
						System.out.println("Hasta Luego! Gracias por usar nuestro almacén.");
						salir = true;
						break;
					default:
						System.out.println("Opción incorrecta");
						break;
					}
				}

			} catch (InputMismatchException e) {
				System.out.println("Opción incorrecta debes introducir un número del menú");
				sc.nextLine();
			} catch (IOException e) {
				System.out.println("La ruta para cargar el fichero no es correcta");
			} catch (ArticuloNotFoundException e) {
				System.out.println("El artículo no existe en el almacen");
			}

		} while (!salir);
		sc.close();
	}

	private static Articulo crearArticulo() {
		System.out.println("Introduce el código");
		String cod = sc.nextLine();
		System.out.println("Introduce la descripción");
		String desc = sc.nextLine();
		System.out.println("Introduce el precio de compra");
		float pCompra = sc.nextFloat();
		System.out.println("Introduce el precio de venta");
		float pVenta = sc.nextFloat();
		System.out.println("Introduce el número de unidades");
		int stock = sc.nextInt();
		// Para limpiar el buffer del scanner
		sc.nextLine();
		return new Articulo(cod, desc, pCompra, pVenta, stock);
	}

	private static void modificarArticulo(Articulo art, Almacen alm) {
		boolean salir = false;
		do {
			int opc = 0;
			try {
				boolean opcionCorrecta = false;
				while (!opcionCorrecta) {
					System.out.println("Qué valor quieres cambiar?");
					System.out.println("1. Código");
					System.out.println("2. Descripción");
					System.out.println("3. Precio Compra");
					System.out.println("4. Precio Venta");
					System.out.println("5. Stock");
					System.out.println("6. Cancelar");
					System.out.println("Introduce la opción deseada y pulsa enter");
					opc = sc.nextInt();
					sc.nextLine();

					switch (opc) {
					case 1:
						//TODO: faltan los mensajes al usuario
						//TODO: faltan los mensajes de confirmación
						String nuevoCod = sc.nextLine();
						String anteriorCod = art.getCodigo();
						try {
							// Comprueba si el nuevo código ya existe
							alm.getArticuloPorCodigo(nuevoCod);
						} catch (ArticuloNotFoundException e) {
							art.setCodigo(nuevoCod);
						}
						opcionCorrecta = true;
						alm.modificarCodigo(nuevoCod, anteriorCod);
						salir = true;
						break;
					case 2:
						String nuevaDescr = sc.nextLine();
						art.setDescripcion(nuevaDescr);
						opcionCorrecta = true;
						break;
					case 3:
						float nuevoPrecioCompra = sc.nextFloat();
						sc.nextLine();
						art.setPrecioCompra(nuevoPrecioCompra);
						opcionCorrecta = true;
						break;
					case 4:
						float nuevoPrecioVenta = sc.nextFloat();
						sc.nextLine();
						art.setPrecioCompra(nuevoPrecioVenta);
						opcionCorrecta = true;
						break;
					case 5:
						int nuevoStock = sc.nextInt();
						sc.nextLine();
						art.setStock(nuevoStock);
						opcionCorrecta = true;
						break;
					case 6:
						System.out.println("Modificación cancelada");
						salir = true;
						break;
					default:
						System.out.println("Opción incorrecta");
						break;
					}
				}

			} catch (InputMismatchException e) {
				System.out.println("Opción incorrecta debes introducir un número del menú");
				sc.nextLine();
			}

		} while (!salir);

	}

	/**
	 * Carga los Articulos del fichero en el Almacen
	 * TODO: EL ALMACÉN PASARÁ A SER LA TABLA ARTICULOS DE LA DB
	 * 
	 * @param ruta
	 * @throws IOException
	 */
	private static void cargarFichero(String ruta, Almacen alm) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(ruta));
		String line = reader.readLine();
		if (null != line) {
			line = reader.readLine();
		}
		while (null != line) {
			Articulo art = new Articulo(line);
			//TODO: Debemos añadir un registro en la DB con el artículo;
			alm.altaArticulo(art);
			line = reader.readLine();
		}
		reader.close();
	}

}