import java.util.Iterator;

public class examen2 
{

	public static void main(String[] args) 
	{
		//declaro esta variable aqui para limpiar el buffer
		int numAleatorio = 0;
		
		//mostrar los numeros principales
		System.out.println("\t\tNúmeros principales");
		for (int index = 0; index < 6; index++) 
		{
			numAleatorio = (int) (Math.random() * 48) + 1;
			System.out.print("\t" + numAleatorio + ",  ");
		}
		
		//inserto intro para que quede mejor
		System.out.println("\n");
		
		//mostrar el número complementario
		System.out.println("\t\tNúmero complementario");
		numAleatorio = (int) (Math.random() * 48) + 1;
		System.out.println("\t\t\t" + numAleatorio);
		
		//inserto intro para que quede mejor
		System.out.println("\n");
				
		//mostrar el número complementario
		System.out.println("\t\t\tReintegro");
		numAleatorio = (int) (Math.random() * 9);
		System.out.println("\t\t\t" + numAleatorio);
	}

}
