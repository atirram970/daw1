package recuperacionArray;

public class main {
		
		public static int[][] generarImagen(int filas, int columnas) {
			final int filasArray = filas;
			final int columnasArray = columnas;
			final int max = 128;
			final int min = -127;
			
			int[][] arrayImagen = new int[filasArray][columnasArray];
			int numeroAleatorio = 0;
			
			System.out.println("Imagen original");
			
			for (int i = 0; i < filasArray; i++) {
				for (int j = 0; j < columnasArray; j++) {
					numeroAleatorio = (int) (Math.random() * (max - min + 1) + min);
					arrayImagen[i][j] = numeroAleatorio;
				}
			}
			
			for (int i = 0; i < filasArray; i++) {
				System.out.print("\n");
				for (int j = 0; j < columnasArray; j++) {
					System.out.print(arrayImagen[i][j] + "\t");
				}
			}
			
			System.out.println("\n");
			
			return arrayImagen;
		}
		
		public static int[][] contraste(int[][] arrayImagen, int contrasteImagen) {
			if(contrasteImagen < 5 || contrasteImagen > 25) {
				System.out.println("Número de contraste inválido, por favor introduce un número entre 5 y 25");
			}
			else
			{
				System.out.println("Imagen Con contraste cambiado");
				
				for (int i = 0; i < arrayImagen.length; i++) {
					for (int j = 0; j < arrayImagen.length; j++) {
						//si la imagen es menor a cero y si sumamos el contraste y no supera -127
						//se le suman el contraste (en negativo)
						if(arrayImagen[i][j] < 0 && arrayImagen[i][j] > -127+contrasteImagen) {
							arrayImagen[i][j] = arrayImagen[i][j] - contrasteImagen;
						}
						//si el valor es menor a 0 y su suma es superior a -127, se deja en -127
						else if(arrayImagen[i][j] > -127-contrasteImagen && arrayImagen[i][j] < 0) {
							arrayImagen[i][j] = -127;
						}
						
						//si la imagen es mayor a cero y si sumamos el contraste y no supera 128
						//se le suman el contraste 
						if(arrayImagen[i][j] > 0 && arrayImagen[i][j] < 128-contrasteImagen) {
							arrayImagen[i][j] = arrayImagen[i][j] + contrasteImagen;
						}
						//si el valor es menor a 0 y su suma es superior a -127, se deja en -127
						else if(arrayImagen[i][j] < 128+contrasteImagen && arrayImagen[i][j] > 0) {
							arrayImagen[i][j] = 128;
						}
					}
				}
				
				for (int i = 0; i < arrayImagen.length; i++) {
					System.out.print("\n");
					for (int j = 0; j < arrayImagen.length; j++) {
						System.out.print(arrayImagen[i][j] + "\t");
					}
				}
				
				System.out.println("\n");
				
				return arrayImagen;
			}
			return null;
			}
		
		public static int[][] suavizar(int[][] arrayImagen) {
			boolean recorrido = false;
			int suma = 0;
			
			System.out.println("Imagen Suavizada");
			
			do {
				//primera fila
				for (int i = 0; i < arrayImagen.length; i++) {
					arrayImagen[i][0] = -127;
				}
				
				//ultima fila
				for (int i = 0; i < arrayImagen.length; i++) {
					arrayImagen[i][4] = -127;
				}
				
				//columna izquierda menos el primer y ultimo valor
				for (int j = 1; j < arrayImagen[0].length-1; j++) {
					arrayImagen[0][j] = -127;
				}
				
				//columna izquierda menos el primer y ultimo valor
				for (int j = 1; j < arrayImagen[0].length-1; j++) {
					arrayImagen[4][j] = -127;
				}
				recorrido = true;
			} while (!recorrido);
				
			for (int i = 1; i < arrayImagen.length-1; i++) {
				for (int j = 1; j < arrayImagen.length-1; j++) {
					suma += arrayImagen[i][j];
				}
			}
			
			int media = suma / 9;
			
			arrayImagen[1][1] = media;
			
			for (int i = 0; i < arrayImagen.length; i++) {
				System.out.print("\n");
				for (int j = 0; j < arrayImagen.length; j++) {
					System.out.print(arrayImagen[i][j] + "\t");
				}
			}
			
			return arrayImagen;
		}
			
}
