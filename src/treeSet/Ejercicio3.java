package treeSet;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Escribe una frase larga");
        String frase= teclado.nextLine();
        if (frase.matches("[1-9]{8}+[A-Z]")){
            System.out.println("Hola");
        }
    }
}
