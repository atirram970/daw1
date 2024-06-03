package RepasoExamenUD6y7.ejRepaso6;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private String horaEntrada;
    private String horaSalida;

    public Persona(String dni, String nombre, String apellidos, String horaEntrada, String horaSalida) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
}
