package empleadoBono;

public class EmpleadoPorComision extends Empleado{

    private int ventas;

    public EmpleadoPorComision(String dni, String nombre, double salarioBase, String fechaNacimiento, int ventas) {
        super(dni, nombre, salarioBase, fechaNacimiento);
        this.ventas = ventas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public double calcularSalario() {
        return getSalarioBase()*ventas;
    }
}
