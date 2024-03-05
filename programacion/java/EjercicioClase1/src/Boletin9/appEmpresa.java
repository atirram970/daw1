package Boletin9;

public class appEmpresa 
{

	public static void main(String[] args) 
	{
		String nombre = "adrian tirado ramos";
		String dni = "12345678A";
		String[] nombreSplit = nombre.split(" ");
		String patronNombre = "^[a-zA-ZñÑáÁéÉíÍóÓúÚ]$";
		String patronDni = "^\\d{8}[A-Z]$";
		boolean valido = false;
		
		while (!valido)
		{
			if(nombreSplit.length >= 3 && dni.matches(patronDni))
			{
				for(String nombreParcial : nombreSplit)
				{
					if (!nombreParcial.matches(patronNombre))
					{
						valido = false;
					}
				}
			}
			else
			{
				valido = false;
			}	
		}
	}

}
