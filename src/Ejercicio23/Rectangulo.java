package Ejercicio23;

public class Rectangulo {
    private int x1;

    private int y1;

    private int x2;

    private int y2;

    private static final int min= 0;

    private static final int max= 100;

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        if (x1>min && x1<max){
            this.x1 = x1;
        } else {
            System.out.println("Valores fuera de rango. Vuelve a introducirlos");
        }
    }

    public void setY1(int y1) {
        if (y1>min && y1<max){
            this.y1 = y1;
        } else {
            System.out.println("Valores fuera de rango. Vuelve a introducirlos");
        }
    }

    public void setX2(int x2) {
        if (x2>min && x2<max){
            this.x2 = x2;
        } else {
            System.out.println("Valores fuera de rango. Vuelve a introducirlos");
        }
    }

    public void setY2(int y2) {
        if (y2>min && y2<max){
            this.y2 = y2;
        } else {
            System.out.println("Valores fuera de rango. Vuelve a introducirlos");
        }
    }
}
