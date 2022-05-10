import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para calcular el factorial");

        try (Scanner scan = new Scanner(System.in)) {
            int num = scan.nextInt();
            System.out.println("El factorial de " + num + " es: " + producto(num));
        }
    }

    public static int producto(int num) {
        return (num == 1) ? 1 : num * producto(num - 1);
    }
}