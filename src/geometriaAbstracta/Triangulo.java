package geometriaAbstracta;

public class Triangulo extends FiguraGeometrica implements Dibujable{
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public Triangulo(String color, int base, int altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public int area() {
        return (base*altura)/2;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triangulo de color "+getColor()+" con un area de "+area()+", "+getBase()+" y "+getAltura());
    }

    @Override
    public void doubleArea() {

    }
}
