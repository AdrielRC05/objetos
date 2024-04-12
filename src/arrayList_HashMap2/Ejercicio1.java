package arrayList_HashMap2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String producto, descuento;
        int cantidad;
        HashMap<String,Double> productos= new HashMap<>();
        productos.put("avena",2.21);
        productos.put("garbanzos",2.39);
        productos.put("tomate",1.59);
        productos.put("jengibre",3.13);
        productos.put("quinoa",4.50);
        productos.put("guisantes",1.60);
        ArrayList<String> nombresCompras= new ArrayList<>();
        ArrayList<Integer> cantidades= new ArrayList<>();
        double precioFinal=0;
        nombresCompras.add("avena");
        cantidades.add(3);
        nombresCompras.add("garbanzos");
        cantidades.add(1);
        nombresCompras.add("tomate");
        cantidades.add(2);
        nombresCompras.add("jengibre");
        cantidades.add(1);
        nombresCompras.add("quinoa");
        cantidades.add(3);
        nombresCompras.add("guisantes");
        cantidades.add(4);

        do {
            System.out.println("¿Que producto desea pedir?");
            producto= teclado.nextLine();
            System.out.println("¿Cuantas unidades quieres?");
            cantidad= teclado.nextInt();
            if (nombresCompras.contains(producto)){
                cantidades.set(nombresCompras.indexOf(producto), cantidades.get(nombresCompras.indexOf(producto))+cantidad);
            } else {
                nombresCompras.add(producto);
                cantidades.add(cantidad);
            }
            System.out.println("¿Desea pedir otro producto?");
            teclado.nextLine();
        } while (!teclado.nextLine().equals("fin"));

        System.out.println("Introduzca un codigo de descuento (INTRO si no tiene)");
        descuento=teclado.nextLine();

        for (int i=0; i< nombresCompras.size(); i++){
            System.out.println("Producto: "+nombresCompras.get(i));
            System.out.println("Cantidad: "+cantidades.get(i));
        }
        System.out.println("Producto     Precio     Cantidad     Subtotal");
        System.out.println("---------------------------------------------");
        for (int i=0; i< nombresCompras.size(); i++){
            precioFinal=precioFinal+(productos.get(nombresCompras.get(i))*cantidades.get(i));
            System.out.println(nombresCompras.get(i)+"     "+productos.get(nombresCompras.get(i))+"     "+cantidades.get(i)+"     "+productos.get(nombresCompras.get(i))*cantidades.get(i));
        }
        System.out.println("---------------------------------------------");
        if (descuento.equals("ECODTO")){
            precioFinal=precioFinal-precioFinal*0.1;
            System.out.println("Descuento: "+(precioFinal*0.1));
            System.out.println("---------------------------------------------");
        }
        System.out.println("Total: "+precioFinal);
    }
}
