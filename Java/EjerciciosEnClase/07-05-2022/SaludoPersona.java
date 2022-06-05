import java.time.LocalDate;

public class SaludoPersona {

    public static void main(String[] args) {
        System.out.println("Programa Persona");

        Persona persona = new Persona("Homero", "Simpson", LocalDate.now(), 23);
        System.out.println(persona);
    }
}