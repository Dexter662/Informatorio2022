
public class Empleado {
    public String nombreYApellido;
    public int dni;
    public int horasTrabajadas;
    public int valorPorHora;

    public Empleado(String nombreYApellido, int dni, int horasTrabajadas, int valorPorHora){
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return "Empleado " + nombreYApellido + ", D.N.I. Nro. " + dni + ".";
    }

}
