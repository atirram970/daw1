package RepasoExamenUD6y7.ejRepaso6;

import java.util.HashMap;
import java.util.Map;

public class ControlAccesoZonaPrivada {
    private Map<String, Persona> personasAutorizadas;

    public ControlAccesoZonaPrivada() {
        this.personasAutorizadas = new HashMap<>(); // Se utiliza HashMap porque permite un acceso rápido a los datos mediante la clave (DNI)
    }

    public void registrarPersona(String dni, String nombre, String apellidos) {
        Persona persona = new Persona(dni, nombre, apellidos, apellidos, apellidos);
        personasAutorizadas.put(dni, persona);
        System.out.println("Persona registrada: " + nombre + " " + apellidos + " (DNI: " + dni + ")");
    }

    public void mostrarPersonasAutorizadas() {
        System.out.println("Personas autorizadas:");
        for (Persona persona : personasAutorizadas.values()) {
            System.out.println("Nombre: " + persona.getNombre() + ", Apellidos: " + persona.getApellidos() + ", DNI: " + persona.getDni());
        }
    }
}
