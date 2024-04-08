package empleadoBono;

public abstract class Empleado {
    private String dni;
    private String nombre;
    private double salarioBase;
    private String fechaNacimiento;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Empleado(String dni, String nombre, double salarioBase, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.fechaNacimiento = fechaNacimiento;
    }
}
