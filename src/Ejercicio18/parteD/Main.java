package Ejercicio18.parteD;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Persona persona1= new Persona("Adriel", "Ruano Campos", "12345678X", 18);
        Persona persona2= new Persona("Ivan", "Baños de Molgas", "87654321X", 70);

        int PersonaP, diferenciaEdadTot= 0;

        System.out.println("Escribe una edad");
        PersonaP= teclado.nextInt();

        diferenciaEdadTot= persona1.diferenciaEdad(PersonaP);
        System.out.println("La diferencia de edad es de "+diferenciaEdadTot);

        diferenciaEdadTot= persona2.diferenciaEdad(PersonaP);
        System.out.println("La diferencia de edad es de "+diferenciaEdadTot);

    }
}
