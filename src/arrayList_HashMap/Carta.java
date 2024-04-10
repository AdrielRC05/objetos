package arrayList_HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Carta {
    private Valor valor;
    private Palo palo;

    public Carta() {
        Random aleatorio= new Random();
        ArrayList<Valor> valores= new ArrayList<>();
        ArrayList<Palo> palos= new ArrayList<>();
        Collections.addAll(valores, Valor.values());
        Collections.addAll(palos, Palo.values());
        this.valor=valores.get(aleatorio.nextInt(0, valores.size()));
        this.palo =palos.get(aleatorio.nextInt(0, palos.size()));
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "valor=" + valor +
                ", palo=" + palo +
                '}';
    }
}
