package arrayList_HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> nombres= new ArrayList<>();
        nombres.add("Adriel");
        nombres.add("Ivan");
        nombres.add("Hugo");
        nombres.add("Laureano");
        nombres.add("Rodrigo");
        nombres.add("Josemi");

        Collections.sort(nombres);
        Collections.reverse(nombres);

        for (String n: nombres){
            System.out.println(n);
        }
    }
}
