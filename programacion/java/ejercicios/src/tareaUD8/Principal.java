package tareaUD8;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal que gestiona la interfaz de usuario del programa.
 * Permite al usuario interactuar con el sistema de gestión de un concesionario.
 */
public class Principal {

    /**
     * Método principal que ejecuta la aplicación.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {

    	//scanner para tomar las acciones dadas por el usuario
        Scanner scan = new Scanner(System.in);

        //booleano para salir del bucle
        boolean salir = false;
        //booleano para comprobar que los datos introducidos son correctos
        boolean correcto;
        //entero para guardar la opción elegida por el usuario
        int opcion;

        //creación concesionario junto los valores del vehiculo
        Concesionario concesionario = new Concesionario();
        Vehiculo v;
        String marca="";
        String matricula="";
        String descripcion="";
        String nombreProp="";
        String DNIProp="";
        int kms = 0;
        int dia= 0; 
        int mes=0;
        int anio=0;
        double precio = 0;
        LocalDate fechaMatriculacion = null;

        //mensaje en caso de conexión con la BD correcta
        System.out.println("Conexión establecida con éxito.");

        // Menú principal
        while (!salir) {
            // Menú de opciones
            System.out.println("1. Nuevo vehículo");
            System.out.println("2. Listar vehículos");
            System.out.println("3. Buscar vehículo");
            System.out.println("4. Modificar vehículo");
            System.out.println("5. Eliminar vehículo");
            System.out.println("6. Salir");
            System.out.println("Elige una opcion");
            opcion = scan.nextInt();

            switch (opcion) {
            case 1:
                // Añadir nuevo vehículo
                System.out.println("Introduce la marca");
                scan.nextLine();
                marca = scan.nextLine();

                // Pedir matrícula y validar
                String matriculaInput;
                do {
                    System.out.println("Introduce la matricula");
                    matriculaInput = scan.nextLine();
                    if (!Validacion.validarMatricula(matriculaInput)) {
                        System.out.println("Matrícula inválida. Por favor, inténtalo de nuevo.");
                    }
                } while (!Validacion.validarMatricula(matriculaInput));

                do {
                    correcto = true;
                    try {
                        System.out.println("Introduce el numero de km");
                        kms = scan.nextInt();
                    } catch (InputMismatchException e) {
                        correcto = false;
                        scan.next();
                    }
                } while (!correcto);

                do {
                    correcto = true;
                    try {
                        System.out.println("Introduce el dia de la fecha de matriculacion");
                        dia = scan.nextInt();
                        System.out.println("Introduce el mes de la fecha de matriculacion");
                        mes = scan.nextInt();
                        System.out.println("Introduce el año de la fecha de matriculacion");
                        anio = scan.nextInt();
                        fechaMatriculacion = LocalDate.of(anio, mes, dia);
                    } catch (InputMismatchException e) {
                        correcto = false;
                        scan.next();
                    } catch (DateTimeException e) {
                        correcto = false;
                    }
                } while (!correcto);

                System.out.println("Introduce la descripcion");
                scan.nextLine();
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
                    correcto = true;
                    try {
                        System.out.println("Introduce el precio");
                        precio = scan.nextDouble();
                    } catch (InputMismatchException e) {
                        correcto = false;
                        scan.next();
                    }
                } while (!correcto);

                v = new Vehiculo(marca, matriculaInput, kms, fechaMatriculacion, descripcion, precio, nombreProp, DNIProp);

                int resultadoInsercion = concesionario.insertarVehiculo(v);
                switch (resultadoInsercion) {
                    case -2:
                        System.out.println("No se pudo crear el vehículo. La matrícula ya está en uso.");
                        break;
                    case -1:
                        System.out.println("El concesionario está lleno.");
                        break;
                    case 0:
                        System.out.println("Vehículo insertado correctamente.");
                        break;
                }
                break;
                case 2:
                    // Listar vehículos
                    concesionario.listarVehiculos();
                    break;
                case 3:
                    // Buscar vehículo por matrícula
                    System.out.println("Inserta la matricula");
                    scan.nextLine();
                    matricula = scan.nextLine();
                    v = concesionario.buscaVehiculo(matricula);
                    if (null == v) {
                        System.out.println("No existe el vehiculo con la matricula introducida");
                    }
                    break;
                case 4:
                    // Modificar vehículo
                    System.out.println("Inserta la matricula");
                    scan.nextLine();
                    matricula = scan.nextLine();

                    String nuevaMarca = null;
                    Integer nuevoKM = null;
                    LocalDate nuevaFecha = null;
                    String nuevaDescripcion = null;
                    Double nuevoPrecio = null;
                    String nuevoNombrePropietario = null;
                    String nuevoDNIPropietario = null;

                    boolean seguirModificando = true;
                    while (seguirModificando) {
                        // Menú de opciones de modificación
                        System.out.println("Selecciona el campo a modificar:");
                        System.out.println("1. Marca");
                        System.out.println("2. Kilometraje (numKM)");
                        System.out.println("3. Fecha de Matriculación");
                        System.out.println("4. Descripción");
                        System.out.println("5. Precio");
                        System.out.println("6. Nombre del Propietario");
                        System.out.println("7. DNI del Propietario");
                        System.out.println("8. Salir y actualizar cambios");

                        int eleccion = scan.nextInt();
                        scan.nextLine();

                        switch (eleccion) {
                            case 1:
                                System.out.println("Introduce la nueva marca:");
                                nuevaMarca = scan.nextLine();
                                break;
                            case 2:
                                System.out.println("Introduce el nuevo kilometraje:");
                                nuevoKM = scan.nextInt();
                                scan.nextLine();
                                break;
                            case 3:
                                System.out.println("Introduce la nueva fecha de matriculación (Año-Mes-Día):");
                                String nuevaFechaString = scan.nextLine();
                                nuevaFecha = LocalDate.parse(nuevaFechaString);
                                break;
                            case 4:
                                System.out.println("Introduce la nueva descripción:");
                                nuevaDescripcion = scan.nextLine();
                                break;
                            case 5:
                                System.out.println("Introduce el nuevo precio:");
                                nuevoPrecio = scan.nextDouble();
                                scan.nextLine();
                                break;
                            case 6:
                                System.out.println("Introduce el nuevo nombre del propietario:");
                                nuevoNombrePropietario = scan.nextLine();
                                break;
                            case 7:
                                System.out.println("Introduce el nuevo DNI del propietario:");
                                nuevoDNIPropietario = scan.nextLine();
                                break;
                            case 8:
                                seguirModificando = false;
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }
                    }

                    // Actualizar los campos seleccionados
                    if (nuevaMarca != null) {
                        concesionario.actualizarVehiculo(matricula, "marca", nuevaMarca);
                    }
                    if (nuevoKM != null) {
                        concesionario.actualizarVehiculo(matricula, "numKM", nuevoKM);
                    }
                    if (nuevaFecha != null) {
                        concesionario.actualizarVehiculo(matricula, "fechaMatriculacion", nuevaFecha);
                    }
                    if (nuevaDescripcion != null) {
                        concesionario.actualizarVehiculo(matricula, "descripcion", nuevaDescripcion);
                    }
                    if (nuevoPrecio != null) {
                        concesionario.actualizarVehiculo(matricula, "precio", nuevoPrecio);
                    }
                    if (nuevoNombrePropietario != null) {
                        concesionario.actualizarVehiculo(matricula, "nombrePropietario", nuevoNombrePropietario);
                    }
                    if (nuevoDNIPropietario != null) {
                        concesionario.actualizarVehiculo(matricula, "dniPropietario", nuevoDNIPropietario);
                    }
                    break;
                case 5:
                    // Eliminar vehículo por matrícula
                    System.out.println("Inserta la matricula");
                    scan.nextLine();
                    matricula = scan.nextLine();
                    concesionario.eliminarVehiculo(matricula);
                    break;
                case 6:
                    // Salir del programa
                    salir = true;
                    break;
            }
        }
        scan.close();
    }
}