package geometriaAbstracta;

public class Circulo extends FiguraGeometrica implements Dibujable{
    private int radio;

    public int getRadio() {
        return radio;
    }

    public Circulo(String color, int radio) {
        super(color);
        this.radio = radio;
    }

    public double area() {
        return Math.PI*(radio*radio);
    }

    @Override
    public void doubleArea() {
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo de color "+getColor()+" con un area de "+area()+" y "+getRadio());
    }
}
