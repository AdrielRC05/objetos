package empleadoBono;

public class EmpleadoPorHora extends Empleado{

    private int horasTrabajadas;

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public EmpleadoPorHora(String dni, String nombre, double salarioBase, String fechaNacimiento, int horasTrabajadas) {
        super(dni, nombre, salarioBase, fechaNacimiento);
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalario() {
        return getSalarioBase()* this.horasTrabajadas;
    }
}
