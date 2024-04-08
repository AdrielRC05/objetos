package Ejercicio17.parteD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        int ejex, ejey;
        Punto punto1= new Punto(5,0 );
        Punto punto2= new Punto(10,10 );
        Punto punto3= new Punto(-3,7 );

        System.out.println("Escribe un punto");
        ejex= teclado.nextInt();
        ejey= teclado.nextInt();

        int dist = punto1.distancia(ejex, ejey);
        System.out.println("La distancia es de "+dist);
    }
}
