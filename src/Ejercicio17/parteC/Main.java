package Ejercicio17.parteC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        Punto punto1= new Punto(5,0 );
        Punto punto2= new Punto(10,10 );
        Punto punto3= new Punto(-3,7 );

        int dx, dy;
        System.out.println("Escribe las coordenadas que se desplaza");
        dx= teclado.nextInt();
        dy= teclado.nextInt();

        punto1.desplaza(dx, dy);
    }
}
