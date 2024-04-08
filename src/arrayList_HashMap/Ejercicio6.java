package arrayList_HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ejercicio6{
    public static void main(String[] args) {
        ArrayList<Persona> persona= new ArrayList<>();
        persona.add(new Persona("Ivan", 30));
        persona.add(new Persona("Adriel", 18));
        persona.add(new Persona("Laureano", 50));
        //persona.sort(Comparator.comparing());
        persona.sort(Persona::compareTo);
        for (Persona e: persona){
            System.out.println(e.getNombre());
        }
    }
}
