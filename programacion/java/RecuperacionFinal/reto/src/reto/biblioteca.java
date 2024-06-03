package reto;

public class biblioteca {

	public static void main(String[] args) {
		try {
			int numeroParametros = Integer.parseInt(args[0]);
			if(numeroParametros == 0) throw new Exception("El número de parámetros no puede ser 0");
			else if(numeroParametros < 0) throw new Exception("El número de parámetros no puede ser negativo");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
