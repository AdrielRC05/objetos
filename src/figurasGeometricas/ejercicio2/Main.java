package figurasGeometricas.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        int base, altura, p1, p2;
        System.out.println("Escribe dos coordenadas");
        base= teclado.nextInt();
        altura= teclado.nextInt();
        p1= teclado.nextInt();
        p2= teclado.nextInt();
        Triangulo t= new Triangulo(base, altura);
        t.area();
        t.duplicar();;
        t.multiplicar(p1);
        t.sumar(p1, p2);
    }
}
