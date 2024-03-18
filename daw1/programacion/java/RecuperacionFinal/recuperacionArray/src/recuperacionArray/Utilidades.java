package recuperacionArray;

public class Utilidades {

	public static void main(String[] args) {

		int[][] arrayImagen = main.generarImagen(5, 5);
		main.contraste(arrayImagen, 25);
		main.suavizar(arrayImagen);
	}

}
