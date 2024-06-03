package unidad6.vehiculos;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal que contiene el punto de entrada del programa.
 */
public class Principal {

    /**
     * Punto de entrada del programa.
     * @param args Los argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        boolean salir = false;

        Concesionario concesionario = new Concesionario();
        
        //CAMBIO-001
        //Se inicializan todas las variables
        Vehiculo v;
        String marca = "";
        String matricula = "";
        String descripcion = "";
        String nombreProp = "";
        String DNIProp = "";
        int kms = 0;
        int dia = 0;
        int mes = 0; 
        int anio = 0;
        double precio = 0;
        LocalDate fechaMatriculacion = null;

        while (!salir) {

            System.out.println("1. Nuevo vehiculo");
            System.out.println("2. Listar vehiculos");
            System.out.println("3. Buscar vehiculo");
            System.out.println("4. Modificar kms vehiculo");
            System.out.println("5. Salir");
            System.out.println("6. Eliminar vehiculo");
            System.out.println("7. Comparar matriculas");
            System.out.println("Elige una opcion");
            int opcion = scan.nextInt();
            scan.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la marca");
                    marca = scan.nextLine();

                    do {
                        System.out.println("Introduce la matricula");
                        matricula = scan.nextLine();
                    } while (!Validacion.validarMatricula(matricula));

                    do {
                        try {
                            System.out.println("Introduce el numero de km");
                            kms = scan.nextInt();
                            scan.nextLine(); 
                        } catch (InputMismatchException e) {
                            scan.nextLine(); 
                        }
                    } while (kms <= 0);

                    do {
                        try {
                            System.out.println("Introduce el dia de la fecha de matriculacion");
                            dia = scan.nextInt();

                            System.out.println("Introduce el mes de la fecha de matriculacion");
                            mes = scan.nextInt();

                            System.out.println("Introduce el año de la fecha de matriculacion");
                            anio = scan.nextInt();
                            scan.nextLine();

                            fechaMatriculacion = LocalDate.of(anio, mes, dia);
                        } catch (DateTimeException | InputMismatchException e) {
                            scan.nextLine();
                        }
                    } while (fechaMatriculacion == null);

                    System.out.println("Introduce la descripcion");
                    descripcion = scan.nextLine();

                    do {
                        System.out.println("Introduce el nombre del propietario");
                        nombreProp = scan.nextLine();
                    } while (!Validacion.validarNombre(nombreProp));

                    do {
                        System.out.println("Introduce el dni del propietario");
                        DNIProp = scan.nextLine();
                    } while (!Validacion.validarDNI(DNIProp));

                    do {
                        try {
                            System.out.println("Introduce el precio");
                            precio = scan.nextDouble();
                            scan.nextLine();
                        } catch (InputMismatchException e) {
                            scan.nextLine();
                        }
                    } while (precio <= 0);

                    v = new Vehiculo(marca, matricula, kms, fechaMatriculacion, descripcion, precio, nombreProp, DNIProp);

                    switch (concesionario.insertarVehiculo(v)) {
                        case -2:
                            System.out.println("El vehiculo existe");
                            break;
                        case -1:
                            System.out.println("El concesionario esta lleno");
                            break;
                        case 0:
                            System.out.println("Vehiculo insertado correctamente");
                            break;
                    }
                    break;
                case 2:
                    concesionario.listarVehiculos();
                    break;
                case 3:
                    System.out.println("Inserta la matricula");
                    matricula = scan.nextLine();

                    v = concesionario.buscaVehiculo(matricula);

                    if (v != null) {
                        System.out.println(v.getMarca());
                        System.out.println(v.getMatricula());
                        System.out.println(v.getPrecio());
                    } else {
                        System.out.println("No existe el vehiculo con la matricula introducida");
                    }
                    break;
                case 4:
                    System.out.println("Inserta la matricula");
                    matricula = scan.nextLine();

                    System.out.println("Inserta los nuevos kms");
                    kms = scan.nextInt();
                    scan.nextLine();

                    if (concesionario.actualizaKms(matricula, kms)) {
                        System.out.println("Los kms se han actualizado correctamente");
                    } else {
                        System.out.println("No existe el vehiculo con la matricula introducida");
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                //CAMBIO-004
                case 6:
                    System.out.println("Inserta la matricula del vehículo que deseas eliminar: ");
                    matricula = scan.next();
                    if (concesionario.eliminarVehiculo(matricula)) {
                        System.out.println("Vehículo eliminado correctamente");
                    } else {
                        System.out.println("No existe un vehículo con la matrícula introducida");
                    }
                    break;
                //CAMBIO-003
                case 7:
                    System.out.println("Inserta la primera matrícula");
                    String matricula1 = scan.nextLine();
                    
                    System.out.println("Inserta la segunda matrícula");
                    String matricula2 = scan.nextLine();
                    
                    int comparacion = matricula1.compareTo(matricula2);
                    
                    if (comparacion == 0) {
                        System.out.println("Es la misma matrícula");
                    } else if (comparacion < 0) {
                        System.out.println("La primera matrícula es más antigua que la segunda");
                    } else {
                        System.out.println("La primera matrícula es más nueva la segunda");
                    }
                    break;
                default:
                    System.out.println("Opción inválida, por favor intentalo de nuevo");
            }
        }
        scan.close();
    }
}
