package RepasoExamenUD6y7.ejRepaso6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionAccesoEdificio {
    private Map<String, Persona> registroEdificio;
    private Map<String, Persona> registroZonaPrivada;

    public GestionAccesoEdificio() {
        this.registroEdificio = new HashMap<>();
        this.registroZonaPrivada = new HashMap<>();
    }

    public void entradaEdificio(String dni, String nombre, String apellidos, String horaEntrada) {
        Persona persona = registroEdificio.get(dni);
        if (persona == null) {
            persona = new Persona(dni, nombre, apellidos, horaEntrada, null);
            registroEdificio.put(dni, persona);
            System.out.println("Entrada registrada para " + nombre + " " + apellidos + " (DNI: " + dni + ")");
        } else {
            persona.setHoraEntrada(horaEntrada);
            System.out.println("Entrada registrada para " + nombre + " " + apellidos + " (DNI: " + dni + ")");
        }
    }

    public void salidaEdificio(String dni, String horaSalida) {
        Persona persona = registroEdificio.get(dni);
        if (persona != null) {
            persona.setHoraSalida(horaSalida);
            System.out.println("Salida registrada para " + persona.getNombre() + " " + persona.getApellidos() + " (DNI: " + dni + ")");
            if (registroZonaPrivada.containsKey(dni)) {
                Persona personaZonaPrivada = registroZonaPrivada.get(dni);
                personaZonaPrivada.setHoraSalida(horaSalida);
            }
        } else {
            System.out.println("No se encontró la persona con DNI " + dni + " en el registro de entradas.");
        }
    }

    public void registrarPersonaZonaPrivada(String dni, String nombre, String apellidos, String horaEntrada, String horaSalida) {
        Persona persona = new Persona(dni, nombre, apellidos, horaEntrada, horaSalida);
        registroZonaPrivada.put(dni, persona);
        if (!registroEdificio.containsKey(dni)) {
            registroEdificio.put(dni, persona);
        } else {
            Persona personaEdificio = registroEdificio.get(dni);
            personaEdificio.setHoraEntrada(horaEntrada);
            personaEdificio.setHoraSalida(horaSalida);
        }
        System.out.println("Persona registrada en la zona privada: " + nombre + " " + apellidos + " (DNI: " + dni + ")");
    }

    public void entradaZonaPrivada(String dni, String horaEntrada) {
        Persona persona = registroZonaPrivada.get(dni);
        if (persona != null) {
            persona.setHoraEntrada(horaEntrada);
            if (!registroEdificio.containsKey(dni)) {
                registroEdificio.put(dni, persona);
            } else {
                Persona personaEdificio = registroEdificio.get(dni);
                personaEdificio.setHoraEntrada(horaEntrada);
            }
            System.out.println("Entrada a la zona privada registrada para " + persona.getNombre() + " " + persona.getApellidos() + " (DNI: " + dni + ")");
        } else {
            System.out.println("No se encontró la persona con DNI " + dni + " en el registro de autorizados.");
        }
    }

    public void salidaZonaPrivada(String dni, String horaSalida) {
        Persona persona = registroZonaPrivada.get(dni);
        if (persona != null) {
            persona.setHoraSalida(horaSalida);
            if (registroEdificio.containsKey(dni)) {
                Persona personaEdificio = registroEdificio.get(dni);
                personaEdificio.setHoraSalida(horaSalida);
            }
            System.out.println("Salida de la zona privada registrada para " + persona.getNombre() + " " + persona.getApellidos() + " (DNI: " + dni + ")");
        } else {
            System.out.println("No se encontró la persona con DNI " + dni + " en el registro de autorizados.");
        }
    }

    public void mostrarPersonasEnEdificio() {
        System.out.println("Personas en el edificio:");
        for (Persona persona : registroEdificio.values()) {
            System.out.println("Nombre: " + persona.getNombre() + ", Apellidos: " + persona.getApellidos() + ", DNI: " + persona.getDni() + ", Hora de entrada: " + persona.getHoraEntrada() + ", Hora de salida: " + persona.getHoraSalida());
        }
    }

    public void mostrarPersonasEnZonaPrivada() {
        System.out.println("Personas en la zona privada:");
        for (Persona persona : registroZonaPrivada.values()) {
            System.out.println("Nombre: " + persona.getNombre() + ", Apellidos: " + persona.getApellidos() + ", DNI: " + persona.getDni() + ", Hora de entrada: " + persona.getHoraEntrada() + ", Hora de salida: " + persona.getHoraSalida());
        }
    }

    public static void main(String[] args) {
        GestionAccesoEdificio gestionAcceso = new GestionAccesoEdificio();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Entrada al edificio");
            System.out.println("2. Salida del edificio");
            System.out.println("3. Registrar persona con acceso a zona privada");
            System.out.println("4. Entrada a la zona privada");
            System.out.println("5. Salida de la zona privada");
            System.out.println("6. Mostrar personas en el edificio");
            System.out.println("7. Mostrar personas en la zona privada");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese los apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Ingrese la hora de entrada (HH:mm:ss): ");
                    String horaEntrada = scanner.nextLine();
                    gestionAcceso.entradaEdificio(dni, nombre, apellidos, horaEntrada);
                    break;
                case 2:
                    System.out.print("Ingrese el DNI para registrar la salida: ");
                    dni = scanner.nextLine();
                    System.out.print("Ingrese la hora de salida (HH:mm:ss): ");
                    String horaSalida = scanner.nextLine();
                case 3:
                    System.out.print("Ingrese el DNI: ");
                    dni = scanner.nextLine();
                    System.out.print("Ingrese el nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese los apellidos: ");
                    apellidos = scanner.nextLine();
                    System.out.print("Ingrese la hora de entrada (HH:mm:ss): ");
                    horaEntrada = scanner.nextLine();
                    System.out.print("Ingrese la hora de salida (HH:mm:ss): ");
                    horaSalida = scanner.nextLine();
                    gestionAcceso.registrarPersonaZonaPrivada(dni, nombre, apellidos, horaEntrada, horaSalida);
                    break;
                case 4:
                    System.out.print("Ingrese el DNI para registrar la entrada a la zona privada: ");
                    dni = scanner.nextLine();
                    System.out.print("Ingrese la hora de entrada (HH:mm:ss): ");
                    horaEntrada = scanner.nextLine();
                    gestionAcceso.entradaZonaPrivada(dni, horaEntrada);
                    break;
                case 5:
                    System.out.print("Ingrese el DNI para registrar la salida de la zona privada: ");
                    dni = scanner.nextLine();
                    System.out.print("Ingrese la hora de salida (HH:mm:ss): ");
                    horaSalida = scanner.nextLine();
                    gestionAcceso.salidaZonaPrivada(dni, horaSalida);
                    break;
                case 6:
                    gestionAcceso.mostrarPersonasEnEdificio();
                    break;
                case 7:
                    gestionAcceso.mostrarPersonasEnZonaPrivada();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 8);
    }
}
