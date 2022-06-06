import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args){
        int cantidadDeCartas = 52;
        List<Integer> baraja = new ArrayList<>();
        for (int i = 1; i <= cantidadDeCartas; i++) {
            baraja.add(i);
        }
        Collections.sort(baraja);
        System.out.println("Cartas en la baraja: " + baraja);
        Collections.reverse(baraja);
        System.out.println("Orden inverso de la baraja: " + baraja);
        Collections.shuffle(baraja);
        System.out.println("Baraja mezclada: " + baraja);
    }
}
