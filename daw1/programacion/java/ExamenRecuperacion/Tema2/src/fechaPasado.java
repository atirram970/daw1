import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class fechaPasado 
{

	public static void main(String[] args) throws Exception 
	{
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try
		{
			System.out.println("Introduce una fecha: (09/12/2020)");
			String fechaUsu = scan.next();
			LocalDate fechaConvertida = LocalDate.parse(fechaUsu, formatoFecha);
			System.out.println("Introduce un número de días");
	        int numDias = scan.nextInt();
	        Calendar cal = Calendar.getInstance();
	        double tiempo = (int) (cal.getTimeInMillis() / (24 * 60 *60 *1000));
	        System.out.println(cal);
		}
		catch (DateTimeParseException dtp) 
		{
			System.out.println("No has introducido una fecha del modo correcto--> Ejemplo de uso \"09/12/2020\" ");
		}
	}

}
