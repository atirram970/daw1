package unidad6.edificio;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Edificio edificio = new Edificio();

        boolean dniValido = false;
        boolean nombreValido = false;
        boolean apellidosValido = false;

        int opcion = -1;
        do {
            System.out.println("\n1. Persona accede al edificio");
            System.out.println("2. Persona abandona el edificio");
            System.out.println("3. Persona accede a zona privada");
            System.out.println("4. Persona abandona zona privada");
            System.out.println("5. Registro de persona con acceso a zona privada");
            System.out.println("6. Mostrar personas en el edificio");
            System.out.println("7. Mostrar personas en la zona privada");
            System.out.println("0. Salir");
            System.out.print("\nIngrese una opción: ");

            opcion = scanner.nextInt();
            // Limpiar buffer
            scanner.nextLine();

            switch (opcion) {
                case 1:
                	// Persona accede al edificio
                	//Recibe dni, lo comprueba si es correcto pide el nombre
                	//Recibe nombre, lo comprueba si es correcto pide los apellidos
                	//Recibe los apellidos, lo comprueba si es correcto pide la hora de entrada
                	//Recibe la hora de entrada
                    System.out.println("Ingrese el DNI de la persona que accede al edificio:");
                    String dniAcceso = scanner.nextLine();
                    dniValido = Persona.comprobarDni(dniAcceso);

                    if (dniValido) {
                        System.out.println("Ingrese el Nombre de la persona que accede al edificio:");
                        String nombreAcceso = scanner.nextLine();
                        nombreValido = Persona.comprobarNombre(nombreAcceso);
                        if (nombreValido) {
                            System.out.println("Ingrese Los apellidos de la persona que accede al edificio:");
                            String apellidosAcceso = scanner.nextLine();
                            apellidosValido = Persona.comprobarApellidos(apellidosAcceso);
                            if (apellidosValido) {
                                System.out.println("Ingrese la hora de entrada al edificio (HH:mm:ss):");
                                String horaEntradaEdificio = scanner.nextLine();
                                Persona personaAcceso = new Persona(dniAcceso, nombreAcceso, apellidosAcceso);
                                edificio.ingresarPersona(personaAcceso, horaEntradaEdificio);
                            } else {
                                System.out.println("Los apellidos introducidos no son correctos");
                            }
                        } else {
                            System.out.println("El nombre introducido no es correcto");
                        }
                    } else {
                        System.out.println("El DNI introducido no es correcto");
                    }
                    break;
                case 2:
                	// Persona abandona el edificio
                	//Recibe dni, lo comprueba si es correcto pide la hora de salida del edificio
                    System.out.println("Ingrese el DNI de la persona que abandona el edificio:");
                    String dniSalida = scanner.nextLine();
                    dniValido = Persona.comprobarDni(dniSalida);
                    if (dniValido) {
                        System.out.println("Ingrese la hora de salida del edificio (HH:mm:ss):");
                        String horaSalidaEdificio = scanner.nextLine();
                        edificio.quitarPersonaEnEdificio(dniSalida, horaSalidaEdificio);
                    } else {
                        System.out.println("Se ha introducido un dni erróneo");
                    }
                    break;
                case 3:
                	// Persona accede a zona privada
                	//Recibe dni, lo comprueba si es correcto pide la hora de acceso a la zona privada
                    System.out.println("Ingrese el DNI de la persona que accede a la zona privada:");
                    String dniPrivada = scanner.nextLine();
                    dniValido = Persona.comprobarDni(dniPrivada);
                    if (dniValido) {
                        Persona personaPrivada = edificio.buscarPersonaEnEdificio(dniPrivada);
                        if (personaPrivada != null) {
                            System.out.println("Ingrese la hora de entrada a la zona privada (HH:mm:ss):");
                            String horaEntradaPrivada = scanner.nextLine();
                            if (validarHora(horaEntradaPrivada, personaPrivada.getHoraEntrada())) {
                                edificio.agregarPersonaEnZonaPrivada(personaPrivada, horaEntradaPrivada);
                            } else {
                                System.out.println("La hora de entrada a la zona privada no puede ser anterior a la hora de entrada al edificio.");
                            }
                        } else {
                            System.out.println("La persona no está en el edificio.");
                        }
                    } else {
                        System.out.println("Se ha introducido un dni erróneo");
                    }
                    break;

                case 4:
                	// Persona abandona zona privada
                	//Recibe dni, lo comprueba si es correcto pide la hora de salida de la zona privada
                    System.out.println("Ingrese el DNI de la persona que abandona la zona privada:");
                    String dniSalidaPrivada = scanner.nextLine();
                    dniValido = Persona.comprobarDni(dniSalidaPrivada);
                    if (dniValido) {
                        System.out.println("Ingrese la hora de salida de la zona privada (HH:mm:ss):");
                        String horaSalidaPrivada = scanner.nextLine();
                        edificio.quitarPersonaEnZonaPrivada(dniSalidaPrivada, horaSalidaPrivada);
                    } else {
                        System.out.println("Se ha introducido un dni erróneo");
                    }
                    break;
                case 5:
                	// Persona se registra con acceso a zona privada
                	//Recibe dni, lo comprueba
                    System.out.println("Ingrese el DNI de la persona que se registra con acceso a zona privada:");
                    String dniRegistro = scanner.nextLine();
                    dniValido = Persona.comprobarDni(dniRegistro);
                    if (dniValido) {
                        Persona personaRegistro = edificio.buscarPersonaEnEdificio(dniRegistro);
                        if (personaRegistro != null) {
                            edificio.agregarPersonaAutorizada(personaRegistro);
                        } else {
                            System.out.println("La persona no está en el edificio.");
                        }
                    } else {
                        System.out.println("Se ha introducido un dni erróneo");
                    }
                    break;
                case 6:
                	// Mostrar personas en el edificio
                    System.out.println("Personas en el edificio:");
                    for (Persona persona : edificio.getPersonasEnEdificio()) {
                        System.out.println(persona);
                    }
                    break;
                case 7:
                	// Mostrar personas en la zona privada
                    System.out.println("Personas en la zona privada:");
                    for (Persona persona : edificio.getPersonasEnZonaPrivada()) {
                        System.out.println(persona);
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static boolean validarHora(String hora, String horaEntrada) {
        // Separar las horas y minutos de la hora de entrada al edificio y la hora de entrada a la zona privada
        String[] partesHoraEntrada = horaEntrada.split(":");
        String[] partesHora = hora.split(":");

        // Convertir las horas y minutos a enteros
        int horaEntradaEdificio = Integer.parseInt(partesHoraEntrada[0]);
        int minutoEntradaEdificio = Integer.parseInt(partesHoraEntrada[1]);
        int horaIngreso = Integer.parseInt(partesHora[0]);
        int minutoIngreso = Integer.parseInt(partesHora[1]);

        // Comparar las horas y minutos
        if (horaIngreso > horaEntradaEdificio) {
            return true;
        } else if (horaIngreso == horaEntradaEdificio && minutoIngreso >= minutoEntradaEdificio) {
            return true;
        } else {
            return false;
        }
    }
}
