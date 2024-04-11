package arrayList_HashMap2;

import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio1 {
    public static void main(String[] args) {
        HashMap<String,Double> productos= new HashMap<>();
        productos.put("avena",2.21);
        productos.put("garbanzos",2.39);
        productos.put("tomate",1.59);
        productos.put("jengibre",3.13);
        productos.put("quinoa",4.50);
        productos.put("guisantes",1.60);
        ArrayList<String> nombresCompras= new ArrayList<>();
        ArrayList<Integer> cantidades= new ArrayList<>();
        nombresCompras.add("avena");
        cantidades.add(3);
        nombresCompras.add("garbanzos");
        cantidades.add(2);
        nombresCompras.add("tomate");
        cantidades.add(1);
        nombresCompras.add("quinoa");
        cantidades.add(1);
        nombresCompras.add("guisantes");
        cantidades.add(4);
    }

}
