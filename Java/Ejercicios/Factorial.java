import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Ingrese el numero para calcular el factorial");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        System.out.println("El factorial de " + numero + " es: " + factorial(numero));
    }

    public static int factorial(int valor) {
        System.out.println(valor);
        return (valor == 1) ? 1 : valor * factorial(valor - 1);
    }
}
