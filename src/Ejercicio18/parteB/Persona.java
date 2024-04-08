package Ejercicio18.parteB;

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

    public boolean esMayorEdad() {
        boolean MayorEdad= true;
        if (this.edad<18){
            MayorEdad= false;
        }
        if (MayorEdad){
            System.out.println(this.nombre+" es mayor de edad");
        } else {
            System.out.println(this.nombre+" es menor de edad");
        }
        return MayorEdad;
    }
}