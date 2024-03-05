/**
 * 
 */
package animales;

import java.util.Date;

/**
 * 
 */
public class gato extends mamifero
{
	private String nombre;
	
	/*
	 * @param nombre
	 */
	public gato(String nombre)
	{
		super();
		this.nombre = nombre;
		this.fechaNac = new Date();
	}
	
	public gato(String nombre, Date fechaNac)
	{
		super();
		this.setNombre(nombre);
		this.fechaNac = new Date();
	}
	
	@Override
	public void come(String comida) 
	{
		if("PESCADO".equalsIgnoreCase(comida))
		{
			System.out.println("Qué rico!");
		}
		else
		{
			System.out.println("No me gusta");
		}
	}
}
