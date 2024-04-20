package blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private ArrayList<Carta> cartas;

    public Baraja() {
        this.cartas = new ArrayList<>();
        Collections.shuffle(cartas);
    }
}
