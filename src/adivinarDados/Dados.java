package adivinarDados;

import java.util.Random;
import java.util.Scanner;

public class Dados implements Juego{

    private String jugador1;
    private String jugador2;
    private int dado1;
    private int dado2;

    @Override
    public void iniciar() {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Escribid vuestros nombres");
        System.out.println("Jugador 1: ");
        this.jugador1= teclado.nextLine();
        System.out.println("Jugador 2: ");
        this.jugador2= teclado.nextLine();
    }

    @Override
    public void jugar() {
        Random aleatorio= new Random();
        dado1= aleatorio.nextInt(1, 7);
        System.out.println("Dado de "+this.jugador1+": "+dado1);
        dado2= aleatorio.nextInt(1, 7);
        System.out.println("Dado de "+this.jugador2+": "+dado2);
    }

    @Override
    public void finalizar() {
        if (dado1==dado2){
            System.out.println(this.jugador1+" ha empatado con "+this.jugador2);
        } else if (dado1>dado2) {
            System.out.println(this.jugador1+" ha ganado a "+this.jugador2);
        } else {
            System.out.println(this.jugador2+" ha ganado a "+this.jugador1);
        }
    }
}
