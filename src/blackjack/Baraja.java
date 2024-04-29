package blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private ArrayList<Carta> cartas;
    public Baraja() {
        this.cartas = new ArrayList<>();
        do {
            Carta cartaNueva= new Carta();
            if (cartas.contains(cartaNueva)){
                do {
                    cartaNueva= new Carta();
                } while (!cartas.contains(cartaNueva));
                cartas.add(cartaNueva);
            }
        } while (cartas.size()==52);
        Collections.shuffle(cartas);
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "cartas=" + cartas +
                '}';
    }
}
