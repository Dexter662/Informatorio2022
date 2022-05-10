import java.util.Scanner;

public class FactorialProgramRecursiva {
    public static void main(String[] args) {
        
        System.out.println("Ingrese el numero para calcular el factorial");
        
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        System.out.println("El factorial de " + numero + " es: " + factorial(numero));
    }

    public static int factorial(int valor) {
        System.out.println(valor);
        if (valor == 1) {
            return 1;
        }
        return valor * factorial(valor - 1);
    }
}