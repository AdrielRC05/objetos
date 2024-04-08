package Ejercicio17.parteC;

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

    public void desplaza(int dx, int dy) {
        System.out.println("("+(dx+this.x)+", "+(dy+this.y)+")");
    }
}
