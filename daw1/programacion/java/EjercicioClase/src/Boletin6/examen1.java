/**
 * 
 */
package Boletin6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 */
public class examen1 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int option = 0;
		do
		{
			Scanner scanner = new Scanner(System.in);
			try 
			{
				option = scanner.nextInt();
				Date now = new Date();
				switch (option) 
				{
					case 1: 
					{
						SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
						sdf.format(now);
					}
					break;
					case 2: 
					{
	 
					}
					break;
					case 3: 
					{
	
					}
					break;
					case 4: 
					{
	
					}
					break;
					case 0: 
					{
	
					}
					break;
				}
			} 
			catch (Exception e) 
			{
				// TODO: handle exception
			}
		}
	}
}
