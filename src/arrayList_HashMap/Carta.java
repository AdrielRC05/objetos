package arrayList_HashMap;


import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

public class Carta implements Comparable<Carta> {
    private Valor valor;
    private Palo palo;

    public Carta() {
        Random aleatorio= new Random();
        this.valor=Valor.values()[aleatorio.nextInt(0, Valor.values().length)];
        this.palo =Palo.values()[aleatorio.nextInt(0, Palo.values().length)];
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return valor == carta.valor && palo == carta.palo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor, palo);
    }

    @Override
    public String toString() {
        return "Carta{" +
                "valor=" + valor +
                ", palo=" + palo +
                '}';
    }


    @Override
    public int compareTo(Carta o) {
        if (this.palo==o.getPalo()){
            return this.valor.compareTo(o.getValor());
        } else {
            return this.palo.compareTo(o.getPalo());
        }
    }
}
