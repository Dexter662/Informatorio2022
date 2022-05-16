import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReaderArchivoTexto {
    public static void main(String [] arg) {
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
        } catch (Exception e) {
            //TODO: handle exception
        } finally {
            try{
                if( null != fl ) {
                    fl.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
