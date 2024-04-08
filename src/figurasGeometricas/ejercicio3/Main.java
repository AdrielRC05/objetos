package figurasGeometricas.ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        int radio, p1, p2;
        System.out.println("Escribe dos coordenadas");
        radio= teclado.nextInt();
        p1= teclado.nextInt();
        p2= teclado.nextInt();
        Circulo c= new Circulo();
        c.area();
        c.duplicar();
        c.multiplicar(p1);
        c.sumar(p2);
        c.longitud();
    }
}
