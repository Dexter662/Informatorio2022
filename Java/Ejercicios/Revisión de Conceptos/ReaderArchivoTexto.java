import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderArchivoTexto {
    public static void main(String [] arg) throws IOException {
        File archivo = null;
        FileReader fl = null;
        BufferedReader br = null;
        try {
            archivo = new File("/home/shiiroe/html/GIT/Informatorio2022/Java/Ejercicios/alumnos.txt");
            fl = new FileReader(archivo);
            br = new BufferedReader(fl);
            String linea;
            while((linea=br.readLine())!=null)
                System.out.println(linea);
        } catch (FileNotFoundException noFile ) {
            System.out.println("No se pudo cargar el archivo!, corrobore que el archivo exista!!");
        } finally {
            try{
                if( null != fl ) {
                    fl.close();
                }
            } catch (IOException io) {
                System.out.println("No se pudo cerrar el objeto reader!");
            }
        }
    }
}
