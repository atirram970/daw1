package unidad6.vehiculos;

import java.util.TreeSet;

/**
 * Clase que representa un concesionario de vehículos.
 */
public class Concesionario {

	//CAMBIO-003
	/** Conjunto ordenado de vehículos almacenados en el concesionario. */
    private TreeSet<Vehiculo> vehiculos;

    /**
     * Constructor de la clase Concesionario.
     * Inicializa el conjunto de vehículos como un TreeSet vacío.
     */
    public Concesionario() {
        this.vehiculos = new TreeSet<>();
    }

    /**
     * Busca un vehículo por su matrícula en el concesionario.
     * @param matricula La matrícula del vehículo a buscar.
     * @return El vehículo correspondiente a la matrícula especificada, o null si no se encuentra.
     */
    public Vehiculo buscaVehiculo(String matricula) {
        for (Vehiculo v : vehiculos) {
            if (v.getMatricula().equals(matricula)) {
                return v;
            }
        }
        return null;
    }

    /**
     * Inserta un nuevo vehículo en el concesionario.
     * @param v El vehículo a insertar.
     * @return 0 si el vehículo se inserta correctamente, -2 si el vehículo ya existe en el concesionario.
     */
    public int insertarVehiculo(Vehiculo v) {
        if (this.buscaVehiculo(v.getMatricula()) != null) {
            return -2; // El vehiculo existe
        } else {
            vehiculos.add(v);
            return 0; // Vehiculo insertado correctamente
        }
    }

    /**
     * Lista todos los vehículos almacenados en el concesionario.
     */
    public void listarVehiculos() {
        for (Vehiculo v : vehiculos) {
            System.out.println(v.toString());
        }
    }

    /**
     * Actualiza el número de kilómetros de un vehículo en el concesionario.
     * @param matricula La matrícula del vehículo a actualizar.
     * @param kms Los nuevos kilómetros del vehículo.
     * @return true si los kilómetros se actualizan correctamente, false si el vehículo no existe.
     */
    public boolean actualizaKms(String matricula, int kms) {
        Vehiculo vehiculo = buscaVehiculo(matricula);
        if (vehiculo != null) {
            vehiculo.setNumKM(kms);
            return true; // Los kms se han actualizado correctamente
        }
        return false; // No existe el vehiculo con la matricula introducida
    }
    
    //CAMBIO-004
    /**
     * Elimina un vehículo del concesionario.
     * @param matricula La matrícula del vehículo a eliminar.
     * @return true si el vehículo se elimina correctamente, false si el vehículo no existe.
     */
    public boolean eliminarVehiculo(String matricula) {
        Vehiculo vehiculo = buscaVehiculo(matricula);
        if (vehiculo != null) {
            vehiculos.remove(vehiculo);
            return true; // Vehículo eliminado correctamente
        }
        return false; // El vehículo no existe
    }

}
