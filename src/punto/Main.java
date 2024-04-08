package punto;

public class Main {
    public static void main(String[] args) {
        Punto punto1= new Punto(5,0 );
        Punto punto2= new Punto(10,10 );
        Punto punto3= new Punto(-3,7 );

        System.out.println("punto.Punto 1: (" + punto1.getX() + ", " + punto1.getY() + ")");
        System.out.println("punto.Punto 2: (" + punto2.getX() + ", " + punto2.getY() + ")");
        System.out.println("punto.Punto 3: (" + punto3.getX() + ", " + punto3.getY() + ")");

        //punto1.x = 19;
        punto1.setX(19);

        //punto2.y = 5 * p3.y;
        punto2.setY( 5*punto3.getY() );

        System.out.println("punto.Punto 1: (" + punto1.getX() + ", " + punto1.getY() + ")");
        System.out.println("punto.Punto 2: (" + punto2.getX() + ", " + punto2.getY() + ")");
        System.out.println("punto.Punto 3: (" + punto3.getX() + ", " + punto3.getY() + ")");
    }
}
