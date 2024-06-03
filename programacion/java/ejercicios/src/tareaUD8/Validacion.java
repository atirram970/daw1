package tareaUD8;

import java.time.DateTimeException;
import java.time.LocalDate;

/**
 * La clase Validacion proporciona métodos estáticos para validar diferentes tipos de datos.
 */
public class Validacion {

    /**
     * Valida un número de DNI español.
     * 
     * @param DNI El número de DNI a validar.
     * @return true si el DNI es válido, false si no lo es.
     */
    public static boolean validarDNI(String DNI) {
        return DNI.matches("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
    }

    /**
     * Valida una matrícula de vehículo española.
     * 
     * @param matricula La matrícula a validar.
     * @return true si la matrícula es válida, false si no lo es.
     */
    public static boolean validarMatricula(String matricula) {
        return matricula.matches("^[0-9]{4}[BCDFGHJ-NP-TV-Z]{3}$");
    }

    /**
     * Valida un nombre.
     * 
     * @param nombre El nombre a validar.
     * @return true si el nombre es válido, false si no lo es.
     */
    public static boolean validarNombre(String nombre) {
        // Expresión regular para validar nombre y al menos un apellido
        String regex = "^[A-Za-záéíóúÁÉÍÓÚ]+(\\s[A-Za-záéíóúÁÉÍÓÚ]+){1,2}$";
        return nombre.matches(regex);
    }

    
    /**
     * Valida una fecha.
     * 
     * @param dia  El día.
     * @param mes  El mes.
     * @param anio El año.
     * @return true si la fecha es válida, false si no lo es.
     */
    public static boolean validarFecha(int dia, int mes, int anio) {
        boolean fechaValida = true;
        try {
            LocalDate.of(anio, mes, dia);
        } catch (DateTimeException e) {
            fechaValida = false;
        }
        return fechaValida;
    }
}
