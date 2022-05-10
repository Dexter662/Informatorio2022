import java.time.LocalDate;

public class Persona {

    public String nombre;
    public String apellido;
    public LocalDate fechaNacimiento;
    public int edad;

    public Persona(String nombre, String apellido, LocalDate birthday, int age) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = birthday;
        this.edad = age;
    }

    @Override
    public String toString() {
        return "Hola " + nombre + " " + apellido + " tu edad es: " + edad + " naciste en el año " + fechaNacimiento.getYear();
    }
}