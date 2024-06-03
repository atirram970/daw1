public class RecorridosArray {

	public static void main(String[] args) {
		//array bidimensional 4x4 que se rellene de numeros aleatorios del 1 al 99
		
		//rellenando el array
		//array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		final int columnas = 4;
		final int filas = 4;
		final int min = 1;
		final int max = 99;
		int[][] array = new int[filas][columnas];
		int numAleatorio = (int) (Math.random() * (max - min + 1) + min);
		
		for (int fila = 0; fila < filas; fila++) {
			for (int columna = 0; columna < columnas; columna++) {
				numAleatorio = (int) (Math.random() * (max - min + 1) + min);
				array[fila][columna] = numAleatorio;
			}
		}
		
		//Muestra array completo por filas y columnas
		mostrarArray(array);
		
		System.out.println("\n");
		
		//Muestra array por su diagonal principal (izquierda)
		mostrarDiagonalPrincipalArray(array);
		
		System.out.println("\n");
		
		//Muestra array por su diagonal secundaria (derecha)
		mostrarDiagonalSecundariaArray(array);
		
		System.out.println("\n");
		
		//mostrar array por columnas en lugar de filas
		mostrarArrayPorColumnas(array);
		
		System.out.println("\n");
		
		//mostrar array invertido
		mostrarArrayPorFinalFilas(array);
		
		System.out.println("\n");
		
		//mostrar array invertido por columnas
		mostrarArrayPorFinalColumnas(array);
		
		System.out.println("\n");
		
		//mostrar array por el borde exterior
		mostrarArrayBorde(array);
	}
	
	private static void mostrarArray(int[][] array){
		System.out.println("INICIO ARRAY");
		//calcular dimension array
		int filas = array.length;
        int columnas = array[0].length;
        
        for (int fila = 0; fila < filas; fila++) {
        	System.out.println("\n");
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print(array[fila][columna] + "\t");
            }
        }
        System.out.println("\nFIN ARRAY");
	}
	
	private static void mostrarDiagonalPrincipalArray(int[][] array) {
		System.out.println("INICIO DIAGONAL PRINCIPAL ARRAY");
		int filas = 4;
		int columnas = 0;
		
		for (int fila = 0; fila < filas; fila++) {
			System.out.print(array[fila][columnas++] + " ");
        }
		System.out.println("\nFIN DIAGONAL PRINCIPAL ARRAY");
	}
	
	private static void mostrarDiagonalSecundariaArray(int[][] array) {
		System.out.println("INICIO DIAGONAL SECUNDARIA ARRAY");
		int filas = 4;
		int columnas = 3;
		
		for (int fila = 0; fila < filas; fila++) {
			System.out.print(array[fila][columnas--] + " ");
        }
		System.out.println("\nFIN DIAGONAL SECUNDARIA ARRAY");
	}
	
	private static void mostrarArrayPorColumnas(int[][] array) {
		System.out.println("INICIO ARRAY POR COLUMNAS");
		int filas = 4;
		int columnas = 4;
		
		for (int fila = 0; fila < filas; fila++) {
        	System.out.println("\n");
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print(array[columna][fila] + "\t");
            }
        }
		System.out.println("\nFIN ARRAY POR COLUMNAS ARRAY");
	}
	
	private static void mostrarArrayPorFinalFilas(int[][] array) {
		System.out.println("INICIO ARRAY INVERTIDO");
		int filas = 4;
		int columnas = 4;
		
		for (int fila = filas-1; fila >= 0; fila--) {
        	System.out.println("\n");
            for (int columna = columnas-1; columna >= 0; columna--) {
                System.out.print(array[fila][columna] + "\t");
            }
        }
		System.out.println("\nFIN ARRAY INVERTIDO");
	}
	
	private static void mostrarArrayPorFinalColumnas(int[][] array) {
		System.out.println("INICIO ARRAY INVERTIDO");
		int filas = 4;
		int columnas = 4;
		
		for (int fila = filas-1; fila >= 0; fila--) {
        	System.out.println("\n");
            for (int columna = columnas-1; columna >= 0; columna--) {
                System.out.print(array[columna][fila] + "\t");
            }
        }
		System.out.println("\nFIN ARRAY INVERTIDO");
	}
	
	private static void mostrarArrayBorde(int[] [] array) {
		System.out.println("\nINICIO BORDE ARRAY");
		int filas = 0;
		int columnas = 0;
		boolean fin = false;
		
		while(!fin) {
			 for (int fila = 0; fila < 4; fila++) {
				 System.out.print(array[columnas][fila] + "\t");
			 }
			 fin = true;
		System.out.println("\nFIN BORDE ARRAY");
		}
	}
}
