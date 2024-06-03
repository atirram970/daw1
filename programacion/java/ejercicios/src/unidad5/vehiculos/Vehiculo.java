package unidad5.vehiculos;

import java.time.LocalDate;
import java.time.Period;

public class Vehiculo implements Comparable<Vehiculo> {

	private String marca;
	private String matricula;
	private int numKM;
	private LocalDate fechaMatriculacion;
	private String descripcion;
	private double precio;
	private String nombrePropietario;
	private String dniPropietario;

	public Vehiculo(String marca, String matricula, int numKM, LocalDate fechaMatriculacion, String descripcion,
	        double precio, String nombrePropietario, String dniPropietario) {
		this.marca = marca;
		this.matricula = matricula;
		this.numKM = numKM;
		this.fechaMatriculacion = fechaMatriculacion;
		this.descripcion = descripcion;
		this.precio = precio;
		this.nombrePropietario = nombrePropietario;
		this.dniPropietario = dniPropietario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumKM() {
		return numKM;
	}

	public void setNumKM(int numKM) {
		this.numKM = numKM;
	}

	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	public String getDniPropietario() {
		return dniPropietario;
	}

	public void setDniPropietario(String dniPropietario) {
		this.dniPropietario = dniPropietario;
	}

	public int get_Anios() {

		LocalDate f1 = this.fechaMatriculacion;
		LocalDate f2 = LocalDate.now();

		Period p = Period.between(f1, f2);

		return p.getYears();

	}

	@Override
	public String toString() {
		return "Vehiculo{" + "marca=" + marca + ", matricula=" + matricula + ", numKM=" + numKM + ", descripcion="
		        + descripcion + ", precio=" + precio;
	}

	public boolean equals(Vehiculo other) {
		return this.matricula.equals(other.matricula);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Vehiculo)) {
			return false;
		}
		Vehiculo other = (Vehiculo) obj;
		if (matricula == null) {
			if (other.matricula != null) {
				return false;
			}
		} else if (!matricula.equals(other.matricula)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Vehiculo o) {
		int result = 0;
		result = this.matricula.substring(4).compareTo(o.matricula.substring(4));
		if (result == 0) {
			result = this.matricula.substring(0, 4).compareTo(o.matricula.substring(0, 4));
		}
		return result;
	}

}