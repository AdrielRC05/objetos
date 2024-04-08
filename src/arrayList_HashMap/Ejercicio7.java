package arrayList_HashMap;

import java.util.ArrayList;
import java.util.Comparator;

public class Ejercicio7 {
    public static void main(String[] args) {
        ArrayList<Producto> producto= new ArrayList<>();
        producto.add(new Producto("Coche", 25000, 2));
        producto.add(new Producto("Bici", 1000, 10));
        producto.add(new Producto("Moto", 10000, 5));
        producto.add(new Producto("Camion", 70000, 0));
        producto.sort(Comparator.reverseOrder());
        for (Producto e:producto){
            if (e.getStock()>0){
                System.out.println(e.getPrecio());
            }
        }
    }
}
