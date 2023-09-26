/**
 * 
 */
package Boletin;

/**
 * 
 */
public class Ejercicio3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//creacion y declaracion variables
		String asterisco="*";
		for (int columnas=1; columnas < 4; columnas++) {
			for (int filas=1; filas < 4; filas++) 
			{
				System.out.println(asterisco);
				asterisco=asterisco+"*";
			}
		}
		
	}

}
