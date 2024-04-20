package TreeSet;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio1 {
    public static void main(String[] args) {
        TreeSet<Integer> numeros= new TreeSet<>();
        Random aleatorio= new Random();

        do {
            numeros.add(aleatorio.nextInt(0,101));
        } while (numeros.size()<101);

        for (int i=0; i<numeros.size(); i++){
            System.out.println(numeros.ceiling(i));
        }
    }
}
