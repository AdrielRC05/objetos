package geometriaAbstracta;

public class Rectangulo extends FiguraGeometrica implements Dibujable{
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public Rectangulo(String color, int base, int altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public int area() {
        return (base*altura);
    }

    @Override
    public void doubleArea() {

    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectangulo de color "+getColor()+" con un area de "+area()+", "+getBase()+" y "+getAltura());
    }
}
