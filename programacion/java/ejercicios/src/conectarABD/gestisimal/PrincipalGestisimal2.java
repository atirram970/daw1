package conectarABD.gestisimal;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class PrincipalGestisimal2 {

	static Scanner sc = new Scanner(System.in);
	static Almacen almacen = new Almacen();

	public static void main(String[] args) {
		//1.
		//mostrarListadoAlmacen();
		//5.
		//cargar fichero("ficheros/articulos.csv");
	}
	
	private static void mostrarListadoAlmacen() throws IOException {
		Set<Articulo> articulos = almacen.getArticulos();
		if(alm.size() != 0) {
			for(Articulo articulo : articulos) {
                System.out.println(articulo);
            }
		}
	}
}
