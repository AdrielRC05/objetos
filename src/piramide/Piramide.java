package piramide;

import java.util.Random;

public class Piramide {
    private int altura;

    public Piramide() {
        Random numAsteriscos= new Random();
        this.altura= numAsteriscos.nextInt(1, 21);
    }

    public Piramide(int altura) {
        this.altura= altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setAltura2(int altura) {
        this.altura= this.altura+altura;
    }

    public void imprimir() {
        int asteriscos= 1;
        int espacios = this.altura-1;
        for (int f = 1; f <= this.altura; f++) { //para filas

            for (int e = 1; e <= espacios; e++) { //espacios en blanco en cada fila
                System.out.print(" ");
            }

            for (int a = 1; a <= asteriscos; a++) { //asteriscos en cada fila
                System.out.print("*");
            }

            espacios--;
            asteriscos+=2;
            System.out.println("");
        }
    }

    public void menu(){
        System.out.println("Elige la opcion que prefieras");
        System.out.println("    1. Mostrar una piramide aleatoria");
        System.out.println("    2. Crear piramide");
        System.out.println("    3. Salir");
    }
}
