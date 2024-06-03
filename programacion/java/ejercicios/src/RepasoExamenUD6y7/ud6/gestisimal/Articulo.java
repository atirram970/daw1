package RepasoExamenUD6y7.ud6.gestisimal;

import java.util.Objects;

public class Articulo {
	//Atributos
	String codigo;
	String descripcion;
	float precioCompra;
	float precioVenta;
	int stock;
	
	//Constructor
	/**
	 * @param codigo
	 * @param descripcion
	 * @param pc
	 * @param pv
	 * @param stock
	 */
	public Articulo(String codigo, String descripcion, float precioCompra, float precioVenta, int stock) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}

	//Getters y setters
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the pc
	 */
	public float getprecioCompra() {
		return precioCompra;
	}

	/**
	 * @param pc the pc to set
	 */
	public void setprecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	/**
	 * @return the pv
	 */
	public float getprecioVenta() {
		return precioVenta;
	}

	/**
	 * @param pv the pv to set
	 */
	public void setprecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	//Métodos
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "Articulo = " + codigo + ". " + descripcion + "\nPrecio Compra = " + precioCompra + "\nPrecio Venta = "
		        + precioVenta + "\nStock = " + stock;
	}

	public void aumentarStock(int stockAniadir) {
		this.stock = this.stock + stockAniadir;
	}
}