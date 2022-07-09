import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args){
        String[] palos = {"corazon", "diamante", "trébol", "pino"};
        String[] valores = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};

        ArrayList<String> baraja = new ArrayList<String>();

        for (int palo = 0; palo < 4; palo++) {
            for (int valor = 0; valor < valores.length; valor++) {
                String carta = valores[valor]+" "+palos[palo];
                baraja.add(carta);
            }
        }

        System.out.println(baraja);
        Collections.sort(baraja);
        System.out.println("Cartas en la baraja: ");
        System.out.println(baraja);
        Collections.reverse(baraja);
        System.out.println("Orden inverso de la baraja: ");
        System.out.println(baraja);
        Collections.shuffle(baraja, new Random());
        System.out.println("Baraja mezclada: ");
        System.out.println(baraja);
    }
}