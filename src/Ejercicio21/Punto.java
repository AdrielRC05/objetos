package Ejercicio21;

import java.util.Random;

public class Punto {
    private int x;
    private int y;

    public static Punto crearPuntoAleatorio() {
        Random ejex= new Random();
        Random ejey= new Random();
        int x = ejex.nextInt(-100, 101);
        int y = ejey.nextInt(-100, 101);
        System.out.println("("+x+", "+y+")");
        return new Punto(x, y);
    }

    public Punto(int x, int y){
        this.x= x;
        this.y= y;
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
}
