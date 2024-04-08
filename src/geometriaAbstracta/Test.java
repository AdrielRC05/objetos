package geometriaAbstracta;

public class Test {
    public static void main(String[] args) {
        Rectangulo rectangulo1= new Rectangulo("rojo",20, 10);
        Circulo circulo1= new Circulo("azul",10);
        Triangulo triangulo1= new Triangulo("verde",10, 15);
        rectangulo1.dibujar();
        circulo1.dibujar();
        triangulo1.dibujar();
    }
}
