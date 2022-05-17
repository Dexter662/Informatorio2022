import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Introdusca su nombre y apellido, por favor:");
        String nombre = scan.nextLine();
        System.out.println("Hola, " + nombre);
        scan.close();
    }
}
