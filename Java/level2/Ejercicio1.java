import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args){
        List<String> ciudades = new ArrayList<>();

        ciudades.add("Bariloche");
        ciudades.add("Córdoba");
        ciudades.add("Resistencia");

        for (int i = 0; i < ciudades.size(); i++) {
            int cont = i + 1;
            System.out.println("#" + cont + " - " + ciudades.get(i));
        }
    }
}