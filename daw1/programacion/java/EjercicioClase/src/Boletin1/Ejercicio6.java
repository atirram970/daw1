/**
 * 
 */
package Boletin1;

/**
 * 
 */
public class Ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//solución A. Utilizando el operador combinado =
		String cadena="La casa de";
		System.out.println(cadena);
		cadena=cadena+" Juan es";
		System.out.println(cadena);
		cadena=cadena+" el número";
		System.out.println(cadena);
		cadena=cadena+" 25";
		System.out.println(cadena);
		
		//solución B. Utilizando el operador combinado +=
				String cadena="La casa de";
				System.out.println(cadena);
				cadena+=" Juan es";
				System.out.println(cadena);
				cadena+=" el número";
				System.out.println(cadena);
				cadena+=" 25";
				System.out.println(cadena);
		
		//solución C. Utilizando el método substring de String
		String cadena="La casa de Juan es el número 25";
				System.out.println(cadena.substring(0, 10));
				System.out.println(cadena.substring(0, 18));
				System.out.println(cadena.substring(0, 28));
				System.out.println(cadena);
	}

}
