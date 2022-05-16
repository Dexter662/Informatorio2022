import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateArchivoTexto {
    public static void main(String[] args) throws IOException {
        String ruta = "/home/shiiroe/html/GIT/Informatorio2022/Java/Ejercicios/";
        List<String> empleados = new ArrayList<>();
        empleados.add("Raul,Martinez,Planta,150000");
        empleados.add("Xavier,Quintana,Contratado,75000");
        empleados.add("Yamila,Zeniquel,Prueba,35000");

        File archivo = new File(ruta + "empleados.txt");
        // Si el archivo no existe es creado
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
        FileWriter archivoF = new FileWriter(archivo);
        BufferedWriter archivoB = new BufferedWriter(archivoF);
        for(int i = 0; i < empleados.size(); i++){
            archivoB.write(empleados.get(i) + "\r\n");
        }
        archivoB.close();
    }
}
