import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>(Arrays.asList(6, 7, 8, 4, 5));
        List<Integer> valorPorHora = new ArrayList<>(Arrays.asList(350, 345, 550, 600, 320));
        List<Integer> totales = new ArrayList<>();
        int cont = 0;
        Integer totalAPagar = 0;

        for (int i = 0; i < horasTrabajadas.size(); i++) {
            cont = valorPorHora.get(i)*horasTrabajadas.get(i);
            totales.add(cont);
            totalAPagar+=totales.get(i);
        }
        System.out.println(totales);
        System.out.println("Total Final: $" + totalAPagar);
        
    }
}
