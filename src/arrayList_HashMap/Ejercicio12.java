package arrayList_HashMap;

import java.util.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String traduccion;
        int contadorAciertos=0;
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

        ArrayList<String> arrayClaves = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(arrayClaves);
        System.out.println("Escribe su traduccion correctamente");

        for (String c:arrayClaves){
            System.out.println(c);
            traduccion=teclado.nextLine();
            if (traduccion.equals(diccionario.get(c))){
                contadorAciertos++;
                System.out.println("Acierto");
            } else {
                System.out.println("Fallo");
            }
        }
        System.out.println("Aciertos: "+contadorAciertos);
        System.out.println("Fallos: "+(5-contadorAciertos));
    }
}
