import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Ejercicio6 {
    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet<Empleado>();
        Map<Integer, Integer> sueldos = new HashMap<Integer, Integer>();
        Empleado empleado = new Empleado("Juan Estrada", 32657849, 6, 350);
        empleados.add(empleado);
        empleado = new Empleado("Ana Ramirez", 36245781, 8, 300);
        empleados.add(empleado);
        empleado = new Empleado("Jose Quintana", 28457861, 5, 400);
        empleados.add(empleado);

        for (Empleado e : empleados) {
            sueldos.put(e.dni, (e.horasTrabajadas*e.valorPorHora));
            for(Entry<Integer, Integer> sueldo : sueldos.entrySet()){
                if (sueldo.getKey() == e.dni) {
                    System.out.println("Empleado " + e.nombreYApellido + ", D.N.I. Nro. " + e.dni + ", sueldo $" + sueldo.getValue());
                }
            }
        }
    }
}
