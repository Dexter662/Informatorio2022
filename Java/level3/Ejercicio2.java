import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        
        List<Integer> potenciaDeNumerosAlCuadrado = palabras.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(potenciaDeNumerosAlCuadrado);
    }
}
