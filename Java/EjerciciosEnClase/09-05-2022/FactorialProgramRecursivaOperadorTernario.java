import java.util.Scanner;

public class FactorialProgramRecursivaOperadorTernario {
    public static void main(String[] args) {

        System.out.println("Ingrese el numero para calcular el factorial");

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        System.out.println("El factorial de " + numero + " es: " + factorial(numero));
        scan.close();
    }

    public static int factorial(int valor) {
        return (valor == 1) ? 1 : valor * factorial(valor - 1);
    }
}