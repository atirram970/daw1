package unidad6.vehiculos;

import java.util.TreeSet;

public class Concesionario {

	//CAMBIO-002
    private TreeSet<Vehiculo> vehiculos;

    public Concesionario() {
        this.vehiculos = new TreeSet<>();
    }

    public Vehiculo buscaVehiculo(String matricula) {
        for (Vehiculo v : vehiculos) {
            if (v.getMatricula().equals(matricula)) {
                return v;
            }
        }
        return null;
    }

    public int insertarVehiculo(Vehiculo v) {
        if (this.buscaVehiculo(v.getMatricula()) != null) {
            return -2; // El vehiculo existe
        } else {
            vehiculos.add(v);
            return 0; // Vehiculo insertado correctamente
        }
    }

    public void listarVehiculos() {
        for (Vehiculo v : vehiculos) {
            System.out.println(v.toString());
        }
    }

    public boolean actualizaKms(String matricula, int kms) {
        Vehiculo vehiculo = buscaVehiculo(matricula);
        if (vehiculo != null) {
            vehiculo.setNumKM(kms);
            return true; // Los kms se han actualizado correctamente
        }
        return false; // No existe el vehiculo con la matricula introducida
    }
}
