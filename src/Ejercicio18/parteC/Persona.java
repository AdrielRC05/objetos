package Ejercicio18.parteC;

public class Persona {
    public String nombre;
    public String apellidos;
    public String dni;
    public int edad;

    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    public boolean Mayor65() {
        boolean Mayorde65= false;
        if (this.edad>65){
            Mayorde65= true;
        }
        return Mayorde65;
    }
}
