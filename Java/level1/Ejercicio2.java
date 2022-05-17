import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int suma, resta, multiplicacion,division, modulo = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer numero entero");
        int numero1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        int numero2 = scan.nextInt();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        modulo = numero1 % numero2;

        System.out.println(numero1 + " + " + numero2 + " = " + suma);
        System.out.println(numero1 + " - " + numero2 + " = " + resta);
        System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion);
        System.out.println(numero1 + " / " + numero2 + " = " + division);
        System.out.println(numero1 + " % " + numero2 + " = " + modulo);
        scan.close();
    }
}
