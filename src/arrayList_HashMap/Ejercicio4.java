package arrayList_HashMap;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> multiplos3= new ArrayList<>();
        for (int numero=0; numero<Integer.MAX_VALUE; numero++){
            if (numero%3==0){
                multiplos3.add(numero);
            }
        }
        for (Integer n:multiplos3){
            System.out.println(n);
        }
    }
}
