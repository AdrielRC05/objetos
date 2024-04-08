package empresa;

public class Cliente extends Persona{

    private int numeroCliente;

    public Cliente(String nombre, String dni, String fechaNacimiento, int numeroCliente) {
        super(nombre, dni, fechaNacimiento);
        this.numeroCliente = numeroCliente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "nombre='" + getNombre() + '\'' +
                ", dni='" + getDni() + '\'' +
                ", fechaNacimiento='" + getFechaNacimiento() + '\'' +
                " numeroCliente=" + numeroCliente;
    }
}
