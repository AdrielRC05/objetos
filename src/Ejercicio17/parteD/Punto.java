package Ejercicio17.parteD;

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

    public int distancia(int ejex, int ejey) {
        double dist=0;
        ejex=Math.abs((ejex-this.x));
        ejey=Math.abs((ejey-this.y));
        dist=Math.sqrt((ejex*ejex)+(ejey*ejey));
        return (int) dist;
    }
}
