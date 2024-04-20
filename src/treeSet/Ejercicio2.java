package treeSet;
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        TreeSet<Integer> numeros= new TreeSet<>(Comparator.reverseOrder());
        Random aleatorio= new Random();

        do {
            numeros.add(aleatorio.nextInt(0,101));
        } while (numeros.size()<101);

        /*for (Integer i: numeros){
            System.out.println(i);
        }*/
        ArrayList<Integer> arrayNumeros= new ArrayList<>(numeros);

        /*Pasar de TreeSet a ArrayList*/
        for (Integer arrayNumero : arrayNumeros) {
            System.out.println(arrayNumero);
        }
    }
}
