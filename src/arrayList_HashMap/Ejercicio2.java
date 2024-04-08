package arrayList_HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros= new ArrayList<>();
        Random aleatorio= new Random();
        int i=0;
        do {
            numeros.add(aleatorio.nextInt(10, 51));
            i++;
        } while (i<10);
        //Numeros ordenaros de manera creciente
        Collections.sort(numeros);
        for (int n:numeros){
            System.out.print(n+" ");
        }
        System.out.println();
        //Numeros ordenaros de manera decreciente: 3 tipos

        Collections.reverse(numeros);
        numeros.sort(Collections.reverseOrder());
        Collections.sort(numeros, Comparator.reverseOrder());

        for (int n:numeros){
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println(Collections.max(numeros));
        System.out.print(Collections.min(numeros));
    }
}
