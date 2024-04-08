package persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona persona1= new Persona();
        Persona persona2= new Persona();

        Scanner teclado= new Scanner(System.in);

        System.out.println("Datos persona 1");
        System.out.println("Nombre");
        persona1.setNombre(teclado.nextLine());
        System.out.println("Apellidos");
        persona1.setApellidos(teclado.nextLine());
        System.out.println("Dni");
        persona1.setDni(teclado.nextLine());
        System.out.println("edad");
        persona1.setEdad(teclado.nextInt());
        teclado.nextLine();

        System.out.println("Datos persona 2");
        System.out.println("Nombre");
        persona2.setNombre(teclado.nextLine());
        System.out.println("Apellidos");
        persona2.setApellidos(teclado.nextLine());
        System.out.println("Dni");
        persona2.setDni(teclado.nextLine());
        System.out.println("edad");
        persona2.setEdad(teclado.nextInt());
        teclado.nextLine();

        if (persona1.getEdad() >18 || persona1.getEdad() ==18){
            System.out.println(persona1.getNombre() +" "+ persona1.getApellidos() +" con DNI "+ persona1.getDni() +" es mayor de edad");
        }
        if (persona1.getEdad() <18){
            System.out.println(persona1.getNombre() +" "+ persona1.getApellidos() +" con DNI "+ persona1.getDni() +" no es mayor de edad");
        }
        if (persona2.getEdad() >18 || persona2.getEdad() ==18){
            System.out.println(persona2.getNombre() +" "+ persona2.getApellidos() +" con DNI "+ persona2.getDni() +" es mayor de edad");
        }
        if (persona2.getEdad() <18){
            System.out.println(persona2.getNombre() +" "+ persona2.getApellidos() +" con DNI "+ persona2.getDni() +" no es mayor de edad");
        }
    }
}
