package figurasGeometricas.piramide;

import figurasGeometricas.ejercicio1.Rectangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int altura, largo, ancho;

        System.out.println("Escribe altura, largo y ancho");
        altura= teclado.nextInt();
        largo= teclado.nextInt();
        ancho= teclado.nextInt();
        Piramide vacia= new Piramide();
        Piramide piramide1= new Piramide(largo, ancho, altura);
        Piramide piramideRect= new Piramide(new Rectangulo(largo, ancho), altura);

        System.out.println("El perimetro de la base es "+ vacia.perimetroBase());
        System.out.println("El perimetro de la base es "+ piramide1.perimetroBase());
        System.out.println("El perimetro de la base es "+ piramideRect.perimetroBase());

        System.out.println("El area de la base es "+ vacia.areaPiramide(largo, ancho));
        System.out.println("El area de la base es "+ piramide1.areaPiramide(largo, ancho));
        System.out.println("El area de la base es "+ piramideRect.areaPiramide(largo, ancho));
    }
}
