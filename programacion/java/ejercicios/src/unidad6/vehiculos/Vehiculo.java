package unidad6.vehiculos;

import java.time.LocalDate;
import java.time.Period;

/**
 * Clase que representa un vehículo.
 */
public class Vehiculo implements Comparable<Vehiculo> {

	//Atributos
    private String marca;
    private String matricula;
    private int numKM;
    private LocalDate fechaMatriculacion;
    private String descripcion;
    private double precio;
    private String nombrePropietario;
    private String dniPropietario;

    //Constructor
    
    /**
     * Constructor de la clase Vehiculo.
     * @param marca La marca del vehículo.
     * @param matricula La matrícula del vehículo.
     * @param numKM El número de kilómetros del vehículo.
     * @param fechaMatriculacion La fecha de matriculación del vehículo.
     * @param descripcion La descripción del vehículo.
     * @param precio El precio del vehículo.
     * @param nombrePropietario El nombre del propietario del vehículo.
     * @param dniPropietario El DNI del propietario del vehículo.
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

    //Getters y Setters
    
    /**
     * Devuelve la marca del vehículo.
     * @return La marca del vehículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Permite la modificación de la marca del vehículo
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Devuelve la matrícula del vehículo.
     * @return La matrícula del vehículo.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Permite la modificación de la matrícula del vehículo
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Devuelve el número de kilómetros del vehículo.
     * @return El número de kilómetros del vehículo.
     */
    public int getNumKM() {
        return numKM;
    }

    /**
     * Permite la modificación del número de kilómetros del vehículo
     * @param numKM
     */
    public void setNumKM(int numKM) {
        this.numKM = numKM;
    }

    /**
     * Devuelve la fecha de matriculación del vehículo.
     * @return La fecha de matriculación del vehículo.
     */
    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    /**
     * Permite la modificación de la fecha de matriculación del vehículo
     * @param fechaMatriculacion
     */
    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    /**
     * Devuelve la descripción del vehículo.
     * @return La descripción del vehículo.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Permite la modificación de la descripción del vehículo
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve el precio del vehículo.
     * @return El precio del vehículo.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Permite la modificación del precio del vehículo
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el nombre del propietario del vehículo.
     * @return El nombre del propietario del vehículo.
     */
    public String getNombrePropietario() {
        return nombrePropietario;
    }

    /**
     * Permite la modificación del nombre del propietario del vehículo
     * @param nombrePropietario
     */
    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    /**
     * Devuelve el DNI del propietario del vehículo.
     * @return El DNI del propietario del vehículo.
     */
    public String getDniPropietario() {
        return dniPropietario;
    }

    /**
     * Permite la modificación del DNI del propietario del vehículo
     * @param dniPropietario
     */
    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }
    
    //Métodos
    
    /**
     * Devuelve el número de años de matriculación del vehículo.
     * @return El número de años de matriculación del vehículo.
     */
    public int get_Anios(){
        LocalDate f1 = this.fechaMatriculacion;
        LocalDate f2 = LocalDate.now();
        Period p = Period.between(f1, f2);
        return p.getYears();
    }

    /**
     * Devuelve una representación en forma de cadena del vehículo.
     * @return La representación en forma de cadena del vehículo.
     */
    @Override
    public String toString() {
        return "Vehiculo: {" + "marca=" + marca + ", matricula=" + matricula + ", numKM=" + numKM + ", descripcion=" + descripcion + ", precio=" + precio + "}";
    }

    /**
     * Compara dos vehículos basándose en su matrícula.
     * @param otroVehiculo El otro vehículo con el que comparar.
     * @return Un valor negativo si este vehículo tiene una matrícula anterior al otro, un valor positivo si es posterior, o cero si son iguales.
     */
    @Override
    public int compareTo(Vehiculo otroVehiculo) {
        String letrasThis = this.matricula.substring(4);
        String letrasOtro = otroVehiculo.matricula.substring(4);

        int comparacionLetras = letrasThis.compareTo(letrasOtro);

        if (comparacionLetras != 0) {
            return comparacionLetras;
        } else {
            String numerosThis = this.matricula.substring(0, 4);
            String numerosOtro = otroVehiculo.matricula.substring(0, 4);
            return Integer.compare(Integer.parseInt(numerosThis), Integer.parseInt(numerosOtro));
        }
    }

    /**
     * Indica si otro objeto es igual a este vehículo.
     * @param obj El objeto a comparar.
     * @return true si son iguales, false de lo contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) obj;
        return matricula.equals(vehiculo.matricula);
    }

    /**
     * Devuelve el hashcode del vehículo.
     * @return El hashcode del vehículo.
     */
    @Override
    public int hashCode() {
        return matricula.hashCode();
    }
}
