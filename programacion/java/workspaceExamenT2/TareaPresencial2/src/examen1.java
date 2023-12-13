import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class examen1 
{

	public static void main(String[] args) 
	{
		boolean correcto = false;
		int opc = 1;
		Scanner scan = new Scanner(System.in);
		do 
		{
			System.out.println("\tMENÚ FECHAS\n1-Que hora es?\n2-Que dia de la semana es?\n3-Que dia del mes es?\n4-Cuantos dias quedan para Nochevieja?\n0-Cerrar el programa");
			opc = scan.nextInt();
			
			switch (opc) 
			{
				case 1: 
				{
					System.out.println("Has elegido saber que hora es");
					Date hoy = new Date();
					String HoraHoy = hoy.toString();
					SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
				}
				case 2:
				{
					System.out.println("Has elegido saber que dia de la semana es");
				}
				case 3:
				{
					System.out.println("Has elegido saber que dia del mes es");
				}
				case 4:
				{
					System.out.println("Has elegido saber cuantos dias quedan para Nochevieja");
				}
				case 0:
				{
					System.out.println("Has elegido salir");
				}
				default:
					System.out.println("Has elegido una opción incorrecta");
			}
		} 
		while (opc != 0);
	}

}
