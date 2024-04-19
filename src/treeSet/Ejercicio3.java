package treeSet;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        TreeSet<String> fraseSeparada;
        System.out.println("Escribe una frase larga");
        String frase= teclado.nextLine();

        System.out.println("Quieres verlas de orden invertido?");
        if (teclado.nextLine()=="si"){
            fraseSeparada= new TreeSet<>(Comparator.reverseOrder());
        } else {
            fraseSeparada= new TreeSet<>();
        }

        String[] rec = frase.split(" ");

        //fraseSeparada.addAll(Arrays.asList(rec));
        for(String s: rec){
            fraseSeparada.add(s.replaceAll("[^a-zA-Z]",""));
        }

        System.out.println(fraseSeparada);

        /*Comprobar estructura DNI con matches
        if (frase.matches("[1-9]{8}+[A-Z]")){
            System.out.println("Hola");
        }*/
    }
}
