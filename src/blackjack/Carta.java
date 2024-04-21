package blackjack;

import java.util.Random;

public class Carta {
    private Valor valor;
    private Palo palo;

    public Carta() {
        Random aleatorio= new Random();
        this.valor= Valor.values()[aleatorio.nextInt(0, Valor.values().length)];
        this.palo = Palo.values()[aleatorio.nextInt(0, Palo.values().length)];
    }
}
