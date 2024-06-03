package Boletin6;


public class UtilidadesEj06 {
	
	public static int introduceInt(String cadena) throws Exception{
		int res;
		try {
			res = Integer.parseInt(cadena);			
		} catch (NumberFormatException e) {
			throw new Exception("La cadena no es un valor entero");
		}
		return res;
	}
	
	public static float introduceFloat(String cadena) throws Exception{
		float res;
		try {
			res = Float.parseFloat(cadena);			
		} catch (NumberFormatException e) {
			throw new Exception("La cadena no es un valor decimal de tipo float");
		}
		return res;
	}
}