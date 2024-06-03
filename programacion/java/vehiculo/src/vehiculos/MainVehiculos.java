package vehiculos;

import java.util.Scanner;

public class MainVehiculos 
{

	public static void main(String[] args) 
	{
		Bicicleta bici = new Bicicleta("Orbea", "Alma");
		Coche coche = new Coche(1800);
		int opcion = 0;
		Scanner scan = new Scanner(System.in);
		do
		{
			System.out.println
			(
				"VEHÍCULOS\r\n"
				+ "=========\r\n"
				+ "1. Anda con la bicicleta\r\n"
				+ "2. Haz el caballito con la bicicleta\r\n"
				+ "3. Anda con el coche\r\n"
				+ "4. Quema rueda con el coche\r\n"
				+ "5. Ver kilometraje de la bicicleta\r\n"
				+ "6. Ver kilometraje del coche\r\n"
				+ "7. Ver kilometraje total\r\n"
				+ "8. Salir\r\n"
				+ "Elige una opción (1-8):\r\n"
			);
			System.out.println("Elija una opción: (1-8)");
			opcion = getInteger();
			switch (opcion) 
			{
			case 1:
				bici.andar(getDouble());
				break;
			case 2:
				bici.hacerCaballito(getDouble());
				break;
			case 3:
				coche.andar(getDouble());
				break;
			case 4:
				coche.quemarRueda(getDouble());
				break;
			case 5:
				System.out.println(bici.getKilometrosRecorridos());
				break;
			case 6:
				System.out.println(coche.getKilometrosRecorridos());
				break;
			case 7:
				System.out.println(vehiculo.verKilometraje());
				break;
			case 8:
				System.out.println("Hasta luego");
				break;
			default:
				System.out.println("Debe de introducir una opción válida (1-8)");
				break;
			}
		}
		while (opcion !=8);
		bici.andar(8.9);
	}
	
	private static int getInteger()
	{
		boolean correcto = false;
		int result = 0;
		while (!correcto)
		{
			try
			{
				return scan.nextInt();
				correcto = true;
			}
			catch (Exception e)
			{
				System.out.println("Debe de introducir un numero");
			}
			return result;
		}
	}
	
	private static double getDouble()
	{
		boolean correcto = false;
		double result = 0d;
		while (correcto)
		{
			try
			{
				System.out.println("Introduce una distancia: ");
				return scan.nextDouble();
				correcto = true;
			}
			catch (Exception e)
			{
				System.out.println("Debe de introducir un numero");
				scan.next();
			}
			return result;
		}
	}

}