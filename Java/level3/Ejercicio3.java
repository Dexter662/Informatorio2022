import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");

        long result = palabras.stream()
                .map(String::toUpperCase)
                .filter(palabra -> palabra.startsWith("B"))
                .count();
        System.out.println(result);
    }
}
