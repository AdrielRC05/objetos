package treeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Producto p1= new Producto("a",12.5);
        Producto p2= new Producto("g",26.99);
        Producto p3= new Producto("y",4.50);
        Producto p4= new Producto("k",8.99);
        Producto p5= new Producto("s",19.75);
        TreeSet<Producto> productosPorNombre = new TreeSet<>(Comparator.comparing(Producto::getNombre));
        TreeSet<Producto> productosPorPrecio = new TreeSet<>(Comparator.comparingDouble(Producto::getPrecio));

        Iterator<Producto> iterator= productosPorNombre.iterator();

        while (iterator.hasNext()){
            Producto p= iterator.next();
            if (p.getNombre().equals("a")){
                System.out.println("Borrado "+p);
                iterator.remove();
            }
        }
    }
}
