package empresa;

public class Empleado extends Persona{
    private int numeroEmpleado;
    private int salario;
    private int departamento;

    public Empleado(String nombre, String dni, String fechaNacimiento, int numeroEmpleado, int salario, int departamento) {
        super(nombre, dni, fechaNacimiento);
        this.numeroEmpleado = numeroEmpleado;
        this.salario = salario;
        this.departamento = departamento;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return  "Empleado: "+
                "nombre= " +getNombre() +
                ", dni= " +getDni() +
                ", Fecha de Nacimiento= " +getFechaNacimiento() +
                ", numeroEmpleado=" + numeroEmpleado +
                ", salario=" + salario +
                ", departamento=" + departamento;
    }
}
