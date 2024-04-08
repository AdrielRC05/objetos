package arrayList_HashMap;

import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> palabras= new ArrayList<>();
        palabras.add("Ayer");
        palabras.add("Estar");
        palabras.add("Ir");
        palabras.add("Observar");
        palabras.add("Comer");
        palabras.add("Ayudar");
        for (String p: palabras){
            if (String.valueOf(p.charAt(0)).equals("A")){
                System.out.println(p);
            }
        }
    }
}
