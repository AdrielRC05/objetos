package piramide;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int altura;

        System.out.println("Escribe una altura");
        altura= teclado.nextInt();

        Piramide piramideManual= new Piramide(altura);
        Piramide piramideAutomatica= new Piramide();

        piramideManual.imprimir();
        System.out.println();
        piramideAutomatica.imprimir();
        
        piramideAutomatica.setAltura2(altura);
        piramideAutomatica.imprimir();
        
        piramideManual.setAltura(altura+3);
        piramideManual.imprimir();
    }
}
