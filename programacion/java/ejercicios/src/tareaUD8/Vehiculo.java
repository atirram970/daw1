package tareaUD8;

import java.time.LocalDate;
import java.util.Objects;

/**
 * La clase Vehiculo representa un vehículo con varios atributos como marca, matrícula, kilometraje, etc.
 */
public class Vehiculo {
    private String marca; // Marca del vehículo
    private String matricula; // Matrícula del vehículo
    private int numKM; // Kilometraje del vehículo
    private LocalDate fechaMatriculacion; // Fecha de matriculación del vehículo
    private String descripcion; // Descripción del vehículo
    private double precio; // Precio del vehículo
    private String nombrePropietario; // Nombre del propietario del vehículo
    private String dniPropietario; // DNI del propietario del vehículo

    /**
     * Constructor de la clase Vehiculo.
     * 
     * @param marca             La marca del vehículo.
     * @param matricula         La matrícula del vehículo.
     * @param numKM             El kilometraje del vehículo.
     * @param fechaMatriculacion La fecha de matriculación del vehículo.
     * @param descripcion       La descripción del vehículo.
     * @param precio            El precio del vehículo.
     * @param nombrePropietario El nombre del propietario del vehículo.
     * @param dniPropietario    El DNI del propietario del vehículo.
     */
    public Vehiculo(String marca, String matricula, int numKM, LocalDate fechaMatriculacion, String descripcion, double precio, String nombrePropietario, String dniPropietario) {
        this.marca = marca;
        this.matricula = matricula;
        this.numKM = numKM;
        this.fechaMatriculacion = fechaMatriculacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombrePropietario = nombrePropietario;
        this.dniPropietario = dniPropietario;
    }

    // Getters y setters

    /**
     * @return La marca del vehículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del vehículo.
     * 
     * @param marca La nueva marca del vehículo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return La matrícula del vehículo.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Establece la matrícula del vehículo.
     * 
     * @param matricula La nueva matrícula del vehículo.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return El kilometraje del vehículo.
     */
    public int getNumKM() {
        return numKM;
    }

    /**
     * Establece el kilometraje del vehículo.
     * 
     * @param numKM El nuevo kilometraje del vehículo.
     */
    public void setNumKM(int numKM) {
        this.numKM = numKM;
    }

    /**
     * @return La fecha de matriculación del vehículo.
     */
    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    /**
     * Establece la fecha de matriculación del vehículo.
     * 
     * @param fechaMatriculacion La nueva fecha de matriculación del vehículo.
     */
    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    /**
     * @return La descripción del vehículo.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del vehículo.
     * 
     * @param descripcion La nueva descripción del vehículo.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return El precio del vehículo.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del vehículo.
     * 
     * @param precio El nuevo precio del vehículo.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return El nombre del propietario del vehículo.
     */
    public String getNombrePropietario() {
        return nombrePropietario;
    }

    /**
     * Establece el nombre del propietario del vehículo.
     * 
     * @param nombrePropietario El nuevo nombre del propietario del vehículo.
     */
    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    /**
     * @return El DNI del propietario del vehículo.
     */
    public String getDniPropietario() {
        return dniPropietario;
    }

    /**
     * Establece el DNI del propietario del vehículo.
     * 
     * @param dniPropietario El nuevo DNI del propietario del vehículo.
     */
    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }
    
    // Métodos

    /**
     * Sobrescribe el método equals para comparar dos objetos de tipo Vehiculo.
     * 
     * @param o Objeto a comparar con el vehículo actual.
     * @return true si los vehículos tienen la misma matrícula, false en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(matricula, vehiculo.matricula);
    }

    /**
     * Sobrescribe el método hashCode para generar un código hash basado en la matrícula del vehículo.
     * 
     * @return El código hash generado.
     */
    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    /**
     * Sobrescribe el método compareTo para comparar dos vehículos basados en su matrícula.
     * 
     * @param o Vehículo a comparar con el vehículo actual.
     * @return Un valor negativo si el vehículo actual es menor que el vehículo comparado, cero si son iguales,
     *         o un valor positivo si el vehículo actual es mayor que el vehículo comparado.
     */
    public int compareTo(Vehiculo o) {
        return matricula.compareTo(o.matricula);
    }

    /**
     * Sobrescribe el método toString para obtener una representación en cadena del objeto Vehiculo.
     * 
     * @return Una cadena que representa el objeto Vehiculo, incluyendo todos sus atributos.
     */
    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                ", numKM=" + numKM +
                ", fechaMatriculacion=" + fechaMatriculacion +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", nombrePropietario='" + nombrePropietario + '\'' +
                ", dniPropietario='" + dniPropietario + '\'' +
                '}';
    }
}
