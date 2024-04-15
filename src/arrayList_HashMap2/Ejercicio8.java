package arrayList_HashMap2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        HashMap<String, String> tipos= new HashMap<>();
        HashMap<String, String> alimentacion= new HashMap<>();
        tipos.put("Rana","En los tropicos y cerca de las zonas humedas y acuaticas");
        tipos.put("Salamandra","Ecosistemas humedos");
        tipos.put("Sapo","En cualquier sitio menos desierto y la antartida");
        tipos.put("Triton","America y Africa");
        alimentacion.put("Rana","Larvas e insectos");
        alimentacion.put("Salamandra","Pequeños crustaceos e insectos");
        alimentacion.put("Sapo","Insectos, lombrices y pequeños roedores");
        alimentacion.put("Triton","Insectos");

        System.out.println("Escribe el nombre de un anfibio");
        String nombre= teclado.nextLine();
        if (tipos.containsKey(nombre) && alimentacion.containsKey(nombre)){
            System.out.println("Habitat: "+tipos.get(nombre));
            System.out.println("Alimentacion: "+alimentacion.get(nombre));
        } else {
            System.out.println("Ese tipo de anfibio no existe");
        }
    }
}
