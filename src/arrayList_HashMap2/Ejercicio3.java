package arrayList_HashMap2;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        HashMap<String, String> diccionario= new HashMap<>();
        diccionario.put("España", "Madrid");
        diccionario.put("Portugal", "Lisboa");
        diccionario.put("Francia", "Paris");
        String capital, pais;

        do {
            System.out.println("Escribe el nombre de un pais y te dire la capital: ");
            pais= teclado.nextLine();
            if (diccionario.containsKey(pais)){
                System.out.println(diccionario.get(pais));
            } else {
                System.out.println("No conozco la respuesta. Cual es la capital de "+pais+"?");
                capital= teclado.nextLine();
                diccionario.put(pais, capital);
            }
        } while (!pais.equals("salir"));
    }
}
