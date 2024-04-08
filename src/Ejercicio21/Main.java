package Ejercicio21;

public class Main {
    public static void main(String[] args) {
        Punto puntoAleatorio = Punto.crearPuntoAleatorio();
        Punto puntoAleatorio2= Punto.crearPuntoAleatorio();
        System.out.println(puntoAleatorio.getX()+", "+puntoAleatorio.getY());
        System.out.println(puntoAleatorio2.getX()+", "+puntoAleatorio2.getY());
    }
}
