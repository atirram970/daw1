package repasoArrays;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		//Patrón de nombre y apellido
		String patron = "(\\w{3,20}\\s?)+";
		String letrasYTildes = "[aeiouAEIOUáéíóúÁÉÍÓÚ_a-z]";
		String cadena = "Adrian Tirado";
		System.out.println(
		        "Ejemplo 1: " + cadena + " - Patrón: " + patron + " Resultado: " + cadena.matches(patron));
		}

}
