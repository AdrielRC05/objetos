package arrayList_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Random aleatorio= new Random();
        HashMap<String, String>diccionario= new HashMap<>();
        diccionario.put("Auto","Coche");
        diccionario.put("Mann","Hombre");
        diccionario.put("Frau","Mujer");
        diccionario.put("Spielen","Jugar");
        diccionario.put("Essen","Comer");
        /*System.out.println("Escribe una palabra en aleman");
        String palabra= teclado.nextLine();

        if (diccionario.containsKey(palabra)){
            System.out.println(diccionario.get(palabra));
        }*/

        String claveAleatoria;
        ArrayList<String> arrayClaves = new ArrayList<>(diccionario.keySet());
        ArrayList<String> palabras= new ArrayList<>();
        do {
            claveAleatoria= arrayClaves.get(aleatorio.nextInt(1,6));
            palabras.add(claveAleatoria);
        } while (!palabras.contains(claveAleatoria) && palabras.size()<6);
        for (String p:palabras){
            System.out.println(p);
        }
        String valor=diccionario.get(claveAleatoria);
    }
}
