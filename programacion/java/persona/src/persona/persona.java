package persona;

public class persona 
{
	static int numPersona = 0;
	private String nombre;
	private String dni;
	private char sexo;
	private int edad;
	private float peso;
	private int altura;
	
	//constructores
	public persona()
	{
		this.nombre = "";
		this.dni = this.generaDni();
		this.sexo = this.compruebaSexo(sexo);
		this.edad = 0;
		this.peso = 0f;
		this.altura = 0;
		numPersona++;
	}

	/**
	 * @param nombre
	 * @param edad
	 * @param dni
	 * @param sexo
	 */
	public persona(String nombre, int edad, char sexo) 
	{
		super();
		this.nombre = nombre;
		this.dni = this.generaDni();
		this.sexo = this.compruebaSexo(sexo);
		this.edad = edad;
		this.peso = 0f;
		this.altura = 0;
	}

	/**
	 * @param nombre
	 * @param dni
	 * @param sexo
	 * @param edad
	 * @param peso
	 * @param altura
	 */
	public persona(String nombre, String dni, char sexo, int edad, float peso, int altura) 
	{
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
		this.edad = edad;
		this.setPeso(peso);
		this.altura = altura;
	}

	//getters y setters
	/**
	 * @return the numPersona
	 */
	public static int getNumPersona() 
	{
		return numPersona;
	}

	/**
	 * @param numPersona the numPersona to set
	 */
	public static void setNumPersona(int numPersona) 
	{
		persona.numPersona = numPersona;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() 
	{
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() 
	{
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) 
	{
		this.edad = edad;
	}

	/**
	 * @return the dni
	 */
	public String getDni() 
	{
		return dni;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo() 
	{
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) 
	{
		this.sexo = sexo;
	}
	
	/**
	 * @return the peso
	 */
	public float getPeso() 
	{
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) 
	{
		this.peso = peso;
	}
	
	//Métodos de clase
	
	
	
	private String generaDni()
	{
		long num = (long)(Math.random() * 100000000) + 1;
		final String DIGITO_CONTROL = "TRWAGMYFPDXBNJZSQHLCKE";
		char letra = DIGITO_CONTROL.charAt((int) (num % 23));
		String dni = "" + num + letra;
		if (dni.length() < 9)
		{
			int ceros = 9 - dni.length();
			for (int i = 0; i < ceros; i++) 
			{
				dni = "0" + dni;
			}
		}
		return dni;
	}
	
	/*
	 * Método que calucla el IMC a partir del peso y la estatura
	 * 
	 * @param peso
	 * @param estatura
	 * @param imc
	 * @param ArithmeticException
	 */
	
	private double calcularIMC() throws ArithmeticException
	{
		double imc = this.peso / Math.pow(this.altura, 2);
		return imc;
	}

	private boolean esMayorDeEdad()
	{
		boolean esAdulto = false;
		if(edad >= 18)
		{
			esAdulto = true;
		}
		return esAdulto;
	}
	
	/*
	 * comprueba si el caracter pasado por parámetro es un carácter válido de sexo:
	 * H, M o N
	 * En caso contrario devuelve N
	 * @param sexo
	 * @return sex
	 */
	
	private char compruebaSexo(char sexo)
	{
		char sex = 'N';
		if (sexo == 'H' | sexo == 'h')
		{
			this.sexo = 'H';
		}
		else if (sexo == 'M' | sexo == 'm')
		{
			this.sexo = 'M';
		}
		return sex;
	}
	
	//toString
	@Override
	public String toString() 
	{
		return "Persona:\n "
				+ "nombre=" + nombre + ", Con DNI: " + dni + 
				"De sexo: " + sexo 
				+ ", Con edad: " + edad 
				+ ", Con peso: " + peso
				+ ", Con altura: " + altura;
	}
}
