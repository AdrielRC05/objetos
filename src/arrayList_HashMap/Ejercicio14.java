package arrayList_HashMap;

import java.util.ArrayList;

public class Ejercicio14 {
    public static void main(String[] args) {
        ArrayList<Carta> listaCartas= new ArrayList<>();
        Carta cartaNueva;
        while (listaCartas.size()<10){
            do {
                for (Carta c: listaCartas){
                    cartaNueva= new Carta();
                }
            } while (cartaNueva.getPalo()==c.getPalo() && cartaNueva.getValor()==c.getValor());
            listaCartas.add(new Carta());
        }
        for (Carta c: listaCartas){
            System.out.println(c);
        }
    }
}
