import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<>(Arrays.asList("Jonathan", "Eduardo", "Marina", "Angelica", "Alan", "Gabriela", "Natalia",
                                                "Jose", "Raul", "Roberta", "Paula", "Luna"));
        List<String> curso1 = alumnos.subList(0, 4);
        List<String> curso2 = alumnos.subList(4, 8);
        List<String> curso3 = alumnos.subList(8, 12);
        System.out.println("Lista alumnos curso 1: " + curso1);
        System.out.println("Lista alumnos curso 2: " + curso2);
        System.out.println("Lista alumnos curso 3: " + curso3);
    }
}
