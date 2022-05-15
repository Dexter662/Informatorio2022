import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ArchivoTexto {
    public static void main(String [] arg) {
        try {
            File archivo = new File("/home/shiiroe/html/GIT/Informatorio2022/Java/Ejercicios/Alumnos.txt");
            FileReader fl = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fl);
            String linea;
            while((linea=br.readLine())!=null)
                System.out.println(linea);
        } catch (Exception e) {
            System.out.println("Ocurrio un inconveniente: " + e);
        }
    }
}
