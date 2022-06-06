import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args){
        List<Integer> enteros = new ArrayList<>();

        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);

        System.out.println("Cantidad de elementos en la lista: " + enteros.size());
        System.out.println("Elementos en la lista:");
        for (int i = 0; i < enteros.size(); i++) {
            System.out.println(enteros.get(i));
        }
        System.out.println("Agregamos el numero " + 0 + " al principio de la lista.");
        enteros.add(0, 0);
        System.out.println("Agregamos el numero " + 6 + " al final de la lista.");
        enteros.add(6);

        System.out.println("Cantidad de elementos en la lista despues de agregar numeros enteros: " + enteros.size());
        System.out.println("Elementos en la lista:");
        for (int i = 0; i < enteros.size(); i++) {
            System.out.println(enteros.get(i));
        }
    }
}
