package piramide;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        System.out.println("Elige la opcion que prefieras");
        System.out.println("    1. Mostrar una piramide aleatoria");
        System.out.println("    2. Crear piramide");
        System.out.println("    3. Salir");

        int opcion= teclado.nextInt();

        while (opcion!= 3){
            switch (opcion){
                case 1-> {Piramide piramideAutomatica= new Piramide();
                    piramideAutomatica.imprimir();
                    piramideAutomatica.menu();}
                case 2-> {int altura;
                    System.out.println("Escribe una altura");
                    altura= teclado.nextInt();
                    Piramide piramideManual= new Piramide(altura);
                    piramideManual.imprimir();
                    piramideManual.menu();}
            }
            System.out.println("Elige una opcion");
            opcion= teclado.nextInt();
        }
    }
}
