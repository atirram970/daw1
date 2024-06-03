package conectarABD.gestisimal;

import org.apache.commons.lang3.StringUtils;

public class Articulo {
	// Atributos
	private String codigo;
	private String descripcion;
	private float precioCompra;
	private float precioVenta;
	private int stock;

	// Constructores
	/**
	 * @param codigo
	 * @param descripcion
	 * @param precioCompra
	 * @param precioVenta
	 * @param stock
	 */
	public Articulo(String codigo, String descripcion, float precioCompra, float precioVenta, int stock) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}

	/**
	 * Contructor para una línea de csv con el formato
	 * codigo;descripcion;preciocompra;precioventa;stock
	 * @param csvItem
	 */
	public Articulo(String csvItem) {
		String[] valores = csvItem.split(";");
		String codigo = valores[0];
		String descripcion = valores[1];
		float precioCompra = Float.parseFloat(StringUtils.replace(valores[2], ",", "."));
		float precioVenta = Float.parseFloat(StringUtils.replace(valores[3], ",", "."));
		int stock = Integer.parseInt(valores[4]);
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}

	// Getters y setters
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
	 * @return the precioCompra
	 */
	public float getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	/**
	 * @return the precioVenta
	 */
	public float getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(float precioVenta) {
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

	// Métodos de clase
	@Override
	public String toString() {
		return "Articulo = " + codigo + ". " + descripcion + "\nPrecio Compra = " + precioCompra + "\nPrecio Venta = "
		        + precioVenta + "\nStock = " + stock;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	public boolean equals (Articulo o) {
		return this.getCodigo().equals(o.getCodigo());
	}	

}
