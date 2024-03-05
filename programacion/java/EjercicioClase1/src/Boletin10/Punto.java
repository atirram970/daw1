package Boletin10;

class Punto 
{
	private double x;
    private double y;
    private String nombre;
    private String color;

    public Punto()
    {
    	this.x = 0d;
    	this.y = 0d;
    	this.nombre = "";
    	this.color = "negro";
    }
    
    public Punto(double x, double y) 
    {
        this.x = x;
        this.y = y;
        this.nombre = "";
        this.color = "negro";
    }

    // Método desplazar el punto
    public void moverPunto(double desplX, double desplY)
    {
    	this.x = desplX;
    	this.y = desplY;
    }
    
    // Método mover el punto al eje vertical
    public void aplanarPunto()
    {
    	this.x = 0.0;
    }
    
 // Método mover el punto al eje horizontal
    public void centrarPunto()
    {
    	this.y = 0.0;
    }
    
    /**
	 * @param x the x to set
	 */
    
    public double getX() 
    {
        return x;
    }
    
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @param y the y to set
	 */
	public double getY() 
    {
        return y;
    }
	
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
}
