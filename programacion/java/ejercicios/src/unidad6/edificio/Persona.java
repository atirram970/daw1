package unidad6.edificio;

public class Persona implements Comparable<Persona> {
    // Atributos
    private String dni;
    private String nombre;
    private String apellidos;
    private String horaEntrada;
    private String horaSalida;

    // Constructor con parámetros
    public Persona(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // Getters y setters
    /**
     *  Devuelve el dni de la persona
     */
    public String getDni() {
        return dni;
    }

    /**
     *  Permite editar el dni de la persona
     */
    public void setDni(String dni) {
        this.dni = dni;
    }


    /**
     *  Devuelve el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *  Permite editar el nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *  Devuelve el apellido de la persona
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *  Permite editar el apellido de la persona
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene la hora de entrada de la persona
     */
    public String getHoraEntrada() {
        return horaEntrada;
    }

    /**
     *  Permite editar la hora de entrada de la persona
     */
    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    /**
     *  Obtiene la hora de salida del edificio de una persona
     */
    public String getHoraSalida() {
        return horaSalida;
    }

    /**
     *  Permite editar la hora de salida del edificio de una persona
     */
    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    // Métodos
    /**
     * Método que compara a 2 personas
     * Devuelve 0 si son iguales
     */
    @Override
    public int compareTo(Persona otraPersona) {
        // Comparación por DNI
        int comparacionDNI = this.dni.compareTo(otraPersona.getDni());
        if (comparacionDNI != 0) {
            return comparacionDNI;
        }

        // Si los DNI son iguales, se comparan por apellidos
        String primerApellido = this.apellidos.split(" ")[0];
        String primerApellidoOtraPersona = otraPersona.getApellidos().split(" ")[0];
        return primerApellido.compareTo(primerApellidoOtraPersona);
    }

    /**
     * Método que muestra las características de cada persona
     */
    @Override
    public String toString() {
        return "nombre: " + nombre + ", apellidos: " + apellidos + ", DNI: (" + dni + ")";
    }

    /**
     * Método que comprueba el DNI recibido por consola esté bien formado (8 números y 1 letra)
     * @param dniAcceso
     */
    public static boolean comprobarDni(String dniAcceso) {
        boolean valido = false;
        String expresion = "^\\d{8}[A-Za-z]$";
        if (dniAcceso.matches(expresion)) {
            valido = true; 
        }
        return valido;
    }

    /**
     * Método que comprueba que el nombre de la persona esté bien formado
     * @param nombreAcceso
     */
    public static boolean comprobarNombre(String nombreAcceso) {
        boolean valido = false;
        String expresion = "^([a-zA-ZáéíóúñÁÉÍÓÚÑ]+\\s)*[a-zA-ZáéíóúñÁÉÍÓÚÑ]+$";
        if (nombreAcceso.matches(expresion)) {
            valido = true; 
        }
        return valido;
    }

    /**
     * Método que comprueba que los apellidos de la persona estén bien formados
     * @param apellidosAcceso
     */
    public static boolean comprobarApellidos(String apellidosAcceso) {
        boolean valido = false;
        String expresion = "^([a-zA-ZáéíóúñÁÉÍÓÚÑ]+\\s)*[a-zA-ZáéíóúñÁÉÍÓÚÑ]+$";
        if (apellidosAcceso.matches(expresion)) {
            valido = true; 
        }
        return valido;
    }
}