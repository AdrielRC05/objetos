package numero;

import menuOpciones.Menu;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Menu nuevoMenu = new Menu("Numeros", 5);
        nuevoMenu.guardarOpcion("Info sobre 10 numeros", 1);
        nuevoMenu.guardarOpcion("Info sobre 10 numeros aleatorios", 2);
        nuevoMenu.guardarOpcion("Info sobre 10 numeros primos", 3);
        nuevoMenu.guardarOpcion("Info sobre 10 numeros pares", 4);
        nuevoMenu.guardarOpcion("Info sobre 10 numeros perfectos", 5);
        nuevoMenu.mostrar();

        int opcion = nuevoMenu.leerOpcion();

        switch (opcion) {
            case 1 -> comprobarAmigos();
            case 2 -> numerosAleatorios();
            case 3 -> numerosAleatoriosPrimos();
            case 4 -> numerosAleatoriosPares();
            case 5 -> numerosPerfectos();
        }
    }

    public static void comprobarAmigos() {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("Escribe dos numeros");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();

        Numero n1 = new Numero(num1);
        Numero n2 = new Numero(num2);

        if (n1.esAmigo(n2)) {
            System.out.println("Son Amigos");
        } else {
            System.out.println("No son Amigos");
        }
    }

    public static void numerosAleatorios() {
        Random aleatorios = new Random();
        Numero n;
        for (int i = 0; i < 10; i++) {
            n = new Numero(aleatorios.nextInt(0, 1000));
            System.out.println(n.getValor());
            n.mostrarInfo();
            System.out.println();
        }
        System.out.println();
    }

    public static void numerosAleatoriosPrimos() {
        Random aleatorios = new Random();
        Numero n;
        int contador = 0;

        while(contador<10) {
            n = new Numero(aleatorios.nextInt(0, 1000));
            if(n.esPrimo()) {
                System.out.println(n.getValor());
                n.mostrarInfo();
                contador++;
                System.out.println();
            }
        }
    }

    public static void numerosAleatoriosPares() {
        Random aleatorios = new Random();
        Numero n;
        int contador = 0;

        while(contador<10) {
            n = new Numero(aleatorios.nextInt(0, 1000));
            if(n.esPar()) {
                System.out.println(n.getValor());
                n.mostrarInfo();
                contador++;
                System.out.println();
            }
        }
    }

    public static void numerosPerfectos() {
        Random aleatorios = new Random();
        Numero n = new Numero(aleatorios.nextInt(0, 1000));
        System.out.println(n.getValor());
        int contador = (n.getValor()-1);
        int sumaTotal=0;
        for (int i=1; i<contador; i++){
            if (n.getValor()%i==0){
                sumaTotal=sumaTotal+i;
            }
        }
        if (n.getValor()==sumaTotal){
            System.out.println("Es perfecto");
        } else {
            System.out.println("No es perfecto");
        }
    }
}
