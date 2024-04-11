package arrayList_HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ejercicio14 {
    public static void main(String[] args) {

        /*ArrayList<Carta> listaCartas= new ArrayList<>();
        while (listaCartas.size()<10){
            Carta cartaNueva= new Carta();
            if (!listaCartas.contains(cartaNueva)){
                listaCartas.add(cartaNueva);
            }
        }
        Collections.sort(listaCartas);
        for (Carta c: listaCartas){
            System.out.println(c);
        }*/

        ArrayList<Carta> barajaEsp= new ArrayList<>();
        while (barajaEsp.size()<5){
            Carta cartaNueva= new Carta();
            if (!barajaEsp.contains(cartaNueva)){
                barajaEsp.add(cartaNueva);
            }
        }
        int sumatorio=0;
        for (Carta c: barajaEsp){
            System.out.println(c);
            sumatorio=sumatorio+c.getValor().getPeso();
        }
        System.out.println("Tienes "+sumatorio+" puntos");
    }
}
