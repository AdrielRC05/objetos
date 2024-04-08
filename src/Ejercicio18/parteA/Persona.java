package Ejercicio18.parteA;

import java.util.Scanner;

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

    public void imprime() {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Nombre: "+this.nombre+" | Apellidos: "+this.apellidos+" | DNI: "+this.dni+" | Edad: "+this.edad);
    }
}
