package rectangulo;

public class Main {
    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(0,0,5,5);
        Rectangulo r2 = new Rectangulo(7,9,2,3);
        int perimetro, area;

        perimetro = (r1.getX2() - r1.getX1()) * 2 + (r1.getY2() - r1.getY1()) * 2;
        area = (r1.getX2() - r1.getX1()) * (r1.getY2() - r1.getY1())*2;

        System.out.print("Coordenadas del primer rectángulo: ");
        System.out.println("(" + r1.getX1() + ", " + r1.getY1() + ")" + "(" + r1.getX2() + ", " + r1.getY2() + ")");
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Area: "+ area);
        System.out.println();



        perimetro = (r2.getX2() - r2.getX1()) * 2 + (r2.getY2() - r2.getY1())*2;
        area = (r2.getX2() - r2.getX1()) * (r2.getY2() -r2.getY1())*2;

        System.out.print("Coordenadas del segundo rectángulo: ");
        System.out.println("(" + r2.getX1() + ", " + r2.getY1() + ")" + "(" + r2.getX2() + ", " + r2.getY2() + ")");
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Area: "+ area);


    }
}
