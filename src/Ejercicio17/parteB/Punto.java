package Ejercicio17.parteB;

import java.util.Scanner;

public class Punto {
    int x;
    int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY() {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Escribe la coordenada X");
        this.x=teclado.nextInt();
        System.out.println("Escribe la coordenada Y");
        this.y= teclado.nextInt();
        System.out.println("("+this.x+", "+this.y+")");
    }
}
