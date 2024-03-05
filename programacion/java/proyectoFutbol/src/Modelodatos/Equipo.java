package Modelodatos;

import java.time.LocalDate;

public class Equipo 
{
	public static int numeroEquipos = 0;
	private String nombreEquipo;
	private String cifEquipo;
	private String direccionEquipo;
	private String telefono;
	private LocalDate fechaFundacion;
	private String nombrePresidente;
	private boolean masCienAbonados;
	private char categoria;
	private String observaciones;
	
	public Equipo() 
	{
		this.nombreEquipo="";
		this.cifEquipo="";
		this.direccionEquipo="";
		this.telefono="";
		this.fechaFundacion=LocalDate.now();
		this.nombrePresidente="";
		this.masCienAbonados=Boolean.FALSE;
		this.categoria='A';
		this.observaciones="";
		numeroEquipos++;
	}

	/**
	 * @param nombreEquipo
	 * @param cifEquipo
	 * @param direccionEquipo
	 * @param telefono
	 * @param fechaFundacion
	 * @param nombrePresidente
	 * @param masCienAbonados
	 * @param categoria
	 * @param observaciones
	 * @throws WrongCategoriaEquipoException 
	 */
	public Equipo(String nombreEquipo, String cifEquipo, String direccionEquipo, String telefono,
	        LocalDate fechaFundacion, String nombrePresidente, boolean masCienAbonados, char categoria,
	        String observaciones) throws WrongCategoriaEquipoException 
	{
		super();
		this.nombreEquipo = nombreEquipo;
		this.cifEquipo = cifEquipo;
		this.direccionEquipo = direccionEquipo;
		this.telefono = telefono;
		this.fechaFundacion = fechaFundacion;
		this.nombrePresidente = nombrePresidente;
		this.masCienAbonados = masCienAbonados;
		if (categoria == 'A' || categoria == 'I' || categoria == 'J') 
		{			
			this.categoria = categoria;
		} 
		else 
		{
			throw new WrongCategoriaEquipoException("La categoría de un equipo debe ser A (adulto), J (juvenil) o I (infantil)");
		}
		this.observaciones = observaciones;
		numeroEquipos++;
	}

	public Equipo(String nombreEquipo, String cifEquipo) 
	{
		super();
		this.nombreEquipo = nombreEquipo;
		this.cifEquipo = cifEquipo;
		this.direccionEquipo="";
		this.telefono="";
		this.fechaFundacion=LocalDate.now();
		this.nombrePresidente="";
		this.masCienAbonados=Boolean.FALSE;
		this.categoria='A';
		this.observaciones="";
		numeroEquipos++;
	}

	/**
	 * @return the nombreEquipo
	 */
	public String getNombreEquipo() 
	{
		return nombreEquipo;
	}

	/**
	 * @param nombreEquipo the nombreEquipo to set
	 */
	public void setNombreEquipo(String nombreEquipo) 
	{
		this.nombreEquipo = nombreEquipo;
	}

	/**
	 * @return the cifEquipo
	 */
	public String getCifEquipo() 
	{
		return cifEquipo;
	}

	/**
	 * @param cifEquipo the cifEquipo to set
	 */
	public void setCifEquipo(String cifEquipo) 
	{
		this.cifEquipo = cifEquipo;
	}

	/**
	 * @return the direccionEquipo
	 */
	public String getDireccionEquipo() 
	{
		return direccionEquipo;
	}

	/**
	 * @param direccionEquipo the direccionEquipo to set
	 */
	public void setDireccionEquipo(String direccionEquipo) 
	{
		this.direccionEquipo = direccionEquipo;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() 
	{
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) 
	{
		this.telefono = telefono;
	}

	/**
	 * @return the fechaFundacion
	 */
	public LocalDate getFechaFundacion() 
	{
		return fechaFundacion;
	}

	/**
	 * @param fechaFundacion the fechaFundacion to set
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) 
	{
		this.fechaFundacion = fechaFundacion;
	}

	/**
	 * @return the nombrePresidente
	 */
	public String getNombrePresidente() 
	{
		return nombrePresidente;
	}

	/**
	 * @param nombrePresidente the nombrePresidente to set
	 */
	public void setNombrePresidente(String nombrePresidente) 
	{
		this.nombrePresidente = nombrePresidente;
	}

	/**
	 * @return the masCienAbonados
	 */
	public boolean getMasCienAbonados() 
	{
		return masCienAbonados;
	}

	/**
	 * @param masCienAbonados the masCienAbonados to set
	 */
	public void setMasCienAbonados(boolean masCienAbonados) 
	{
		this.masCienAbonados = masCienAbonados;
	}

	/**
	 * @return the categoria
	 */
	public char getCategoria() 
	{
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 * @throws WrongCategoriaEquipoException 
	 */
	public void setCategoria(char categoria) throws WrongCategoriaEquipoException 
	{
		if (categoria == 'A' || categoria == 'I' || categoria == 'J') 
		{			
			this.categoria = categoria;
		} 
		else 
		{
			throw new WrongCategoriaEquipoException("La categoría de un equipo debe ser A (adulto), J (juvenil) o I (infantil)");
		}
	}

	/**
	 * @return the observaciones
	 */
	public String getObservaciones() 
	{
		return observaciones;
	}

	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(String observaciones) 
	{
		this.observaciones = observaciones;
	}

	@Override
	public String toString() 
	{
		return "Equipo [nombreEquipo=" + nombreEquipo + ", direccionEquipo=" + direccionEquipo + ", fechaFundacion="
		        + fechaFundacion + ", categoria=" + categoria + "]";
	}
}