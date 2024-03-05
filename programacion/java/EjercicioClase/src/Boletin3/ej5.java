/**
 * 
 */
package Boletin3;

import java.util.Scanner;

/**
 * 
 */
public class ej5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ejercicio decir horoscopo segun dia y mes
		String signo;
				
		//entrada de dia y mes
		Scanner scannerDia=new Scanner(System.in);
		System.out.println("Introduce el dia de nacimiento(1-31): ");
		int dia=scannerDia.nextInt();
				
		Scanner scannerMes=new Scanner(System.in);
		System.out.println("Introduce el mes de nacimiento(1-12): ");
		int mes=scannerMes.nextInt();
				
		switch (mes) 
		{
		case 1:
			//comprobacion errores dia
			if  (dia >=0 && dia<=31)
			{
				if (dia<=20) 
				{
					signo = "Capricornio";
					System.out.println("Eres: " + signo);
				} 
				else 
				{
					signo = "Acuario";
					System.out.println("Eres: " + signo);
				}
				break;
			}
			else
			{
				System.out.println("Has introducido un valor de día incorrecto");
			}
			break;
		case 2:
			if  (dia >=0 && dia<=29) 
			{
				if (dia<=18) 
				{
					signo = "Acuario";
					System.out.println("Eres: " + signo);
				} 
				else 
				{
					signo = "Piscis";
					System.out.println("Eres: " + signo);
				}
				break;
			}
			else
			{
				System.out.println("Has introducido un valor de día incorrecto");
			}
			break;
		case 3:
			if  (dia >=0 && dia<=31) 
			{
				if (dia<=20) 
				{
					signo = "Piscis";
					System.out.println("Eres: " + signo);
				} 
				else 
				{
					signo = "Aries";
					System.out.println("Eres: " + signo);
				}
				break;
			}
			else
			{
				System.out.println("Has introducido un valor de día incorrecto");
			}
			break;
		case 4:
			if  (dia >=0 && dia<=30) 
			{
				if (dia<=20) 
				{
					signo = "Aries";
					System.out.println("Eres: " + signo);
				} 
				else 
				{
					signo = "Tauro";
					System.out.println("Eres: " + signo);
				}
				break;
			}
			else
			{
				System.out.println("Has introducido un valor de día incorrecto");
			}
			break;
		case 5:
			if  (dia >=0 && dia<=31) 
			{
				if (dia<=21) 
				{
					signo = "Tauro";
					System.out.println("Eres: " + signo);
				} 
				else 
				{
					signo = "Géminis";
					System.out.println("Eres: " + signo);
				}
				break;
			}
			else
			{
				System.out.println("Has introducido un valor de día incorrecto");
			}
			break;
		case 6:
			if  (dia >=0 && dia<=30) 
			{
				if (dia<=21) 
				{
					signo = "Géminis";
					System.out.println("Eres: " + signo);
				} 
				else 
				{
					signo = "Cáncer";
					System.out.println("Eres: " + signo);
				}
				break;
			}
			else
			{
				System.out.println("Has introducido un valor de día incorrecto");
			}
			break;
		case 7:
			if  (dia >=0 && dia<=31) 
			{
				if (dia<=22) 
				{
					signo = "Cáncer";
					System.out.println("Eres: " + signo);
				} 
				else 
				{
					signo = "Leo";
					System.out.println("Eres: " + signo);
				}
				break;
			}
			else
			{
				System.out.println("Has introducido un valor de día incorrecto");
			}
			break;
		case 8:
			if  (dia >=0 && dia<=31) 
			{
				if (dia<=23) 
				{
					signo = "Leo";
					System.out.println("Eres: " + signo);
				} 
				else 
				{
					signo = "Virgo";
					System.out.println("Eres: " + signo);
				}
				break;
			}
			else
			{
				System.out.println("Has introducido un valor de día incorrecto");
			}
			break;
		case 9:
			if  (dia >=0 && dia<=30) 
			{
				if (dia<=23) 
				{
					signo = "Virgo";
					System.out.println("Eres: " + signo);
				} 
				else 
				{
					signo = "Libra";
					System.out.println("Eres: " + signo);
				}
				break;
			}
			else
			{
				System.out.println("Has introducido un valor de día incorrecto");
			}
			break;
		case 10:
			if  (dia >=0 && dia<=31) 
			{
				if (dia<=23) 
				{
					signo = "Libra";
					System.out.println("Eres: " + signo);
				} 
				else 
				{
					signo = "Escorpio";
					System.out.println("Eres: " + signo);
				}
				break;
			}
			else
			{
				System.out.println("Has introducido un valor de día incorrecto");
			}
			break;
		case 11:
			if  (dia >=0 && dia<=30) 
			{
				if (dia<=22) 
				{
					signo = "Escorpio";
					System.out.println("Eres: " + signo);
				} 
				else 
				{
					signo = "Sagitario";
					System.out.println("Eres: " + signo);
				}
				break;
			}
			else
			{
				System.out.println("Has introducido un valor de día incorrecto");
			}
			break;
		case 12:
			if  (dia >=0 && dia<=31) 
			{
				if (dia<=21) 
				{
					signo = "Sagitario";
					System.out.println("Eres: " + signo);
				} 
				else 
				{
					signo = "Capricornio";
					System.out.println("Eres: " + signo);
				}
				break;
			}
			else
			{
				System.out.println("Has introducido un valor de día incorrecto");
			}
			break;
		}
		
		scannerDia.close();
		scannerMes.close();
	}

}