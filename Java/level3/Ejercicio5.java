import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(new Alumno("Ramon", "Ramos", LocalDate.of(1956,5,12)),
                                        new Alumno("Margaret", "Gomes", LocalDate.of(1954,3,19)),
                                        new Alumno("Hector", "Mendez", LocalDate.of(1981,12,13)),
                                        new Alumno("Luisa", "Gonzalez", LocalDate.of(1984,5,13)),
                                        new Alumno("Marcos", "Franco", LocalDate.of(1988,4,19)));

        Map<String,Integer> mapAlumnos = alumnos.stream()
                .collect(Collectors
                .toMap(c -> c.getApellido() + " " + c.getNombre(), v -> v.functionEdad()));
        System.out.println(mapAlumnos);
    }

}
