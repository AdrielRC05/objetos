package figurasGeometricas.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        int largo, ancho, p1=0, p2=0;
        System.out.println("Escribe dos coordenadas");
        largo= teclado.nextInt();
        ancho= teclado.nextInt();
        p1= teclado.nextInt();
        p2= teclado.nextInt();

        Rectangulo r= new Rectangulo(largo, ancho);
        r.esCuadrado();
        r.area();
        r.duplicar();
        r.perimetro();
        r.sumar(p1, p2);
        r.multiplicar(p1);
    }
}
