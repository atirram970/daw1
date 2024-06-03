package caja;

public class MainCaja {

	public static void main(String[] args) {
		Caja<Integer> cajaEntero = new Caja<Integer>();
		cajaEntero.ponerContenido(42);
		System.out.println(cajaEntero.obtenerContenido()); //imprime 42
		
		Caja<String> cajaTexto = new Caja<String>();
		cajaTexto.ponerContenido("Hola, mundo");
		System.out.println(cajaTexto.obtenerContenido()); //imprime Hola, mundo
		
		Caja<Integer> caja1 = new Caja<Integer>();
		caja1.ponerContenido(3);
		Caja<Integer> caja2 = new Caja<Integer>();
		caja2.ponerContenido(7);
		Caja<Integer> caja3 = new Caja<Integer>();
		caja3.ponerContenido(9);
		Caja<Integer>[] CajaArray = new Caja[3];
		CajaArray[0] = caja1;
		CajaArray[1] = caja2;
		CajaArray[2] = caja3;
		imprimirArray(CajaArray);
		String[] sArray = new String[9]; 
	}

	private static <T> void imprimirArray(T[] array) {
		for (T elemento : array) {
			System.out.print(elemento + " ");
		}
		System.out.println();
	}

}
