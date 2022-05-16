import java.util.Scanner;

public class FactorialProgram {
    /** Realizar una funcion que haga el calculo de el 
     * factorial de un numero dado
     * Que necesitamos?
     * 1. Funcion principal (metodo main)
     * 2. Leer el dato ingresado por teclado
     * 3. Variables (para almacenar resultado)
     * 4. Ecuacion? factorial(4) = 4 * 3 * 2 * 1 = 24
     * 5. Como planteamos la ecuacion
     **/
    public static void main(String[] args) {
        int resultado = 1;
        System.out.println("Ingrese el numero para calcular el factorial");

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        for(int i = numero; i > 0; i--) {
            resultado = resultado * i;
        }

        System.out.println("El factorial de " + numero + " es: " + resultado);
        scan.close();
    }
}