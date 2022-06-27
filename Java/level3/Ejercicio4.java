import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);

        List<Long> factorial = palabras.stream()
        .distinct()
        .map(x -> LongStream
                .rangeClosed(1, x)
                .reduce(1, (long a, long b) -> a * b))
        .collect(Collectors.toList());
        System.out.println(factorial);
    }
}
