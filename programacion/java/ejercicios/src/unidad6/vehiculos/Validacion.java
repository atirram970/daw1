package unidad6.vehiculos;

/**
 * Clase que proporciona métodos para validar datos de entrada.
 */
public class Validacion {

	 /**
     * Valida un número de DNI según su formato.
     * @param DNI El número de DNI a validar.
     * @return true si el DNI es válido, false de lo contrario.
     */
    public static boolean validarDNI(String DNI){
        return DNI.matches("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
    }
    
    /**
     * Valida una matrícula de vehículo según su formato.
     * @param matricula La matrícula del vehículo a validar.
     * @return true si la matrícula es válida, false de lo contrario.
     */
    public static boolean validarMatricula(String matricula){
        return matricula.matches("^[0-9]{4}[A-Z]{3}$");
    }
    
    /**
     * Valida un nombre según su formato y longitud.
     * @param nombre El nombre a validar.
     * @return true si el nombre es válido, false de lo contrario.
     */
    public static boolean validarNombre(String nombre){
        
        if(nombre.length() > 40){
            return false;
        }
        
        char caracter;
        int numEspacios = 0;
        for (int i = 0; i < nombre.length(); i++) {
            caracter = nombre.charAt(i);
            if(caracter == ' '){
                numEspacios++;
            }
            if(Character.isDigit(caracter)){
                return false;
            }
        }
        
        if(numEspacios >= 2){
            return true;
        }
        return false;
    }
    
}