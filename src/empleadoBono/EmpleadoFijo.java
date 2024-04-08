package empleadoBono;

public class EmpleadoFijo extends Empleado implements Bonos{

    private int antiguedad;

    public EmpleadoFijo(String dni, String nombre, double salarioBase, String fechaNacimiento, int antiguedad) {
        super(dni, nombre, salarioBase, fechaNacimiento);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double calcularSalario() {
        return getSalarioBase()*8*30;
    }

    @Override
    public double calcularBono(double porcentaje) {
        return getSalarioBase()*porcentaje*(antiguedad*0.01)*30*8;
    }
}
