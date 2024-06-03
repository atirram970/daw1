/**
 * 
 */
package Boletin5;


/**
 * 
 */
public class pruebas {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//pruebas de nuevas funciones mostrado maestro
		//no se pueden concatenar valores ni usar valores como "\n" o "\t"
		//por defecto muestra 6 --> en este caso como es mas de 6 redondea el 6to numero
		
		//declaro el decimal aqui para no tener que volver a introducir
		double d = 123456789.123456789;
		
		System.out.printf("%f", d);
		System.out.println("\n");
		System.out.printf("%,f", d);
		System.out.println("\n");
		//salida de error
		System.err.println("Hola");
		
		//aparte
		String cadena = null;
		if (StringUtils.isEmpty(cadena))
		{
			System.out.println("La cadena esta vacia");
		}
	}

}
