package figurasGeometricas.tetraedro;

import figurasGeometricas.ejercicio2.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int altura, alturaBase, largoBase;

        System.out.println("Escribe 3 distancias");
        altura= teclado.nextInt();
        alturaBase= teclado.nextInt();
        largoBase= teclado.nextInt();
        Tetraedro vacio= new Tetraedro();
        Tetraedro t1= new Tetraedro(new Triangulo(largoBase, alturaBase), altura);
        Tetraedro T1= new Tetraedro(alturaBase, largoBase, altura);
        System.out.println("El area es "+t1.areaTetraedro());
        System.out.println("El area es "+t1.areaBase());
        System.out.println("El volumen es "+t1.volumenPiramide());
    }
}
