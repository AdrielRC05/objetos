package arrayList_HashMap2;

import java.util.HashMap;
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
        String palabra;
        String valor;
        int sinonimos;

        do {
            sinonimos=0;
            System.out.println("Escribe una palabra");
            palabra= teclado.nextLine();

            if (diccionario.containsKey(palabra)){
                if (diccionario.containsKey(palabra)){
                    valor=diccionario.get(palabra);
                    for (HashMap.Entry d: diccionario.entrySet()){
                        if (valor.equals(d.getValue()) && !palabra.equals(d.getKey())){
                            System.out.println(d.getKey());
                            sinonimos++;
                        }
                    }
                }
                if (sinonimos<=1){
                    System.out.println("No conozco sinonimos de esa palabra");
                    System.out.println("Deseas añadir un sinonimo de esta palabra?");
                    if (teclado.nextLine().equals("si")){
                        System.out.println("Escribe la palabra");
                        String plbr= teclado.nextLine();
                        System.out.println("Escribe su traduccion");
                        String traducc= teclado.nextLine();
                        diccionario.put(plbr, traducc);
                    }
                }
            } else {
                System.out.println("No conozco esa palabra");
                System.out.println("Deseas añadirla al diccionario?");
                if (teclado.nextLine().equals("si")){
                    System.out.println("Escribe su traduccion");
                    String traducc= teclado.nextLine();
                    diccionario.put(palabra, traducc);
                }
            }
        } while (!palabra.equals("salir"));
    }

}
