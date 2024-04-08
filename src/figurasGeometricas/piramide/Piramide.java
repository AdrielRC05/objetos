package figurasGeometricas.piramide;

import figurasGeometricas.ejercicio1.Rectangulo;

public class Piramide {
    private Rectangulo base;
    private int altura;

    public Piramide() {
        this.base= new Rectangulo();
        this.altura=0;
    }

    public Piramide(Rectangulo base, int altura) {
        if (altura<0){
            this.altura=0;
            this.base= base;
        } else {
            this.base = base;
            this.altura = altura;
        }
    }

    public Piramide(int largo, int ancho, int altura){
        this.altura= altura;
        this.base= new Rectangulo(largo, ancho);
    }

    public Rectangulo getBase() {
        return base;
    }

    public void setBase(Rectangulo base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int perimetroBase(){
        return base.perimetro();
    }

    public double areaPiramide(int largo, int ancho){
        return (base.area()+(largo*Math.sqrt((largo/4)^2+altura^2))+(ancho*Math.sqrt((ancho/4)^2+altura^2)));
    }
}
