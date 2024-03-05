import java.util.Scanner;

public class cajaFuerte 
{

	public static void main(String[] args) 
	{
		//declaración variables
		Scanner scan = new Scanner(System.in);
		int intentos = 4;
		String contraseniaUsu = "";
		String contraseniaCaja = "1234";
		boolean acierto = false;
		
		System.out.println("Bienvenido a tu caja fuerte");
		do
		{
			System.out.println("introduce la contraseña: ");
			contraseniaUsu = scan.next();
			if (contraseniaUsu.equals(contraseniaCaja))
			{
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
				acierto = true;
			}
			else if (intentos > 1)
			{
				System.out.println("Lo siento,esa no es la combinación. Tiene " + (intentos-1) + " intentos más" );
				intentos -= 1;
			}
			else
			{
				System.out.println("La caja fuerte se ha bloqueado, se debe desbloquear con la llave");
			}
		}
		while(!acierto && intentos > 0);
		
		
	}
}
