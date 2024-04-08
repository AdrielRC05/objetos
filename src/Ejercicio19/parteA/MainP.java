package Ejercicio19.parteA;

public class MainP {
    public static void main(String[] args) {
        RectanguloP r1 = new RectanguloP(0,0,5,5);
        RectanguloP r2 = new RectanguloP(7,9,2,3);
        int perimetro, area;

        perimetro = (r1.getX2() - r1.getX1()) * 2 + (r1.getY2() - r1.getY1()) * 2;
        perimetro= Math.abs(perimetro);
        area = (r1.getX2() - r1.getX1()) * (r1.getY2() - r1.getY1())*2;
        area= Math.abs(area);

        r1.informacion(perimetro,area);

        perimetro = (r2.getX2() - r2.getX1()) * 2 + (r2.getY2() - r2.getY1())*2;
        perimetro= Math.abs(perimetro);
        area = (r2.getX2() - r2.getX1()) * (r2.getY2() -r2.getY1())*2;
        area= Math.abs(area);

        r2.informacion(perimetro,area);
    }
}
