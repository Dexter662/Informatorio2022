import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        List<String> secuenciaNumerosFinal = new ArrayList<>();
        String secuenciaNumeros = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el valor de inicio");
        int menor = scan.nextInt();
        System.out.println("Ingrese el valor de final");
        int mayor = scan.nextInt();
        if (menor < mayor) {
            secuenciaNumeros = fizzBuzzFuncion(menor, mayor);
        }
        secuenciaNumerosFinal.add(secuenciaNumeros);
        System.out.println(secuenciaNumerosFinal);
        scan.close();
    }

    public static String fizzBuzzFuncion(int menor, int mayor){
        String secuenciaNumeros = "";
        String resultado = "";
        for (int i = menor; i < mayor-1; i++) {
            resultado = String.valueOf(i);
            if (i % 2 == 0) { resultado = "Fizz"; }
            if (i % 3 == 0) { resultado = "Buzz"; }
            if (i % 2 == 0 && i % 3 == 0) { resultado = "FizzBuzz"; }
            secuenciaNumeros = secuenciaNumeros + "," + resultado;
        }
        secuenciaNumeros = secuenciaNumeros + "," + String.valueOf(mayor-1);
        secuenciaNumeros = secuenciaNumeros.substring(1);
        return secuenciaNumeros;
    }
}
