package RepasoExamenUD6y7.ejRepaso6;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ControlAccesoEdificioPublico {
    private Map<String, Entrada> registroEntradas;

    public ControlAccesoEdificioPublico() {
        this.registroEntradas = new HashMap<>();
    }

    public void registrarEntrada(String dni, String nombre, String apellidos) {
        Entrada entrada = new Entrada(nombre, apellidos, dni, LocalDateTime.now());
        registroEntradas.put(dni, entrada);
        System.out.println("Entrada registrada para " + nombre + " " + apellidos + " (DNI: " + dni + ")");
    }

    public void mostrarRegistroEntradas() {
        System.out.println("Registro de entradas:");
        for (Entrada entrada : registroEntradas.values()) {
            System.out.println(entrada);
        }
    }

    private static class Entrada {
        private final String nombre;
        private final String apellidos;
        private final String dni;
        private final LocalDateTime horaAcceso;

        public Entrada(String nombre, String apellidos, String dni, LocalDateTime horaAcceso) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.dni = dni;
            this.horaAcceso = horaAcceso;
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", DNI: " + dni + ", Hora de acceso: " + horaAcceso;
        }
    }
}
