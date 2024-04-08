package figurasGeometricas.cono;

import figurasGeometricas.ejercicio3.Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int altura, radio;

        System.out.println("Introduce el radio y la altura del cono");
        radio= teclado.nextInt();
        altura= teclado.nextInt();

        Cono conoVacio= new Cono();
        Cono conoMedio= new Cono(altura, new Circulo(radio));
        Cono conoCompleto= new Cono(altura, radio);
        System.out.println(conoCompleto.areaCono(altura, radio));
        System.out.println(conoCompleto.volumenCono(altura, radio));
    }
}
