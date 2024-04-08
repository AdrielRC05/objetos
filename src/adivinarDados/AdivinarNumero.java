package adivinarDados;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero implements Juego{

    private int numeroMaquina;
    private int numeroJugador;

    @Override
    public void iniciar() {
        Random aleatorio= new Random();
        this.numeroMaquina= aleatorio.nextInt(0,11);
    }

    @Override
    public void jugar() {
        boolean numeroAdivinado= false;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Elige un numero del 1 al 10");
        int intentos=3;
        while (intentos>0 && !numeroAdivinado){
            this.numeroJugador= teclado.nextInt();
            if (this.numeroJugador==this.numeroMaquina){
                numeroAdivinado= true;
                System.out.println("Adivinado");
            } else {
                System.out.println("No adivinado");
            }
            intentos--;
        }
        System.out.println("El numero en cuestion era el "+this.numeroMaquina);
    }

    @Override
    public void finalizar() {
        if (this.numeroJugador==this.numeroMaquina){
            System.out.println("El jugador ha ganado la partida");
        } else {
            System.out.println("El jugador ha perdido la partida");
        }
    }


}
