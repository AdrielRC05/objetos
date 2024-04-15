package arrayList_HashMap2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        HashMap<String, String> diccionario= new HashMap<>();
        diccionario.put("caliente","hot");
        diccionario.put("rojo","red");
        diccionario.put("ardiente","hot");
        diccionario.put("verde","green");
        diccionario.put("agujetas","stiff");
        diccionario.put("abrasador","hot");
        diccionario.put("hierro","iron");
        diccionario.put("grande","big");

        System.out.println("Escribe una palabra y te dare sus sinonimos");
        String palabra= teclado.nextLine();


        for (HashMap.Entry d: diccionario.entrySet()){
            d.getKey();
        }
    }

}
