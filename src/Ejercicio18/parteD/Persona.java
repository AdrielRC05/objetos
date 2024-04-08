package Ejercicio18.parteD;

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

    public int diferenciaEdad(int PersonaP) {
        int diferenciaEdadTot;
        diferenciaEdadTot=Math.abs((this.edad-PersonaP));
        return diferenciaEdadTot;
    }
}
