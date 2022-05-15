import java.util.Scanner;

public class SumaDosNumeros {
    public static void main(String[] args) {
        int resultado = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer numero que desea sumar");
        int numero1 = scan.nextInt();
        System.out.println("Ingrese el primer numero que desea sumar");
        int numero2 = scan.nextInt();
        resultado = sumar( numero1, numero2 );
        System.out.println("La suma de " + numero1 + " + " + numero2 + " es: " + resultado);

    }

    public static int sumar(int valor1, int valor2) {
        return (valor1 + valor2);
    }
}
