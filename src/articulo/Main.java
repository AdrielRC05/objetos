package articulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Articulo articulo1= new Articulo();

        System.out.println("Escribe el nombre de un articulo");
        articulo1.setNombre(teclado.nextLine());
        System.out.println("Escribe su precio");
        articulo1.setPrecio(teclado.nextInt());
        System.out.println("Escribe sus unidades restantes");
        articulo1.setRestantes(teclado.nextInt());

        articulo1.setPrecioiva((articulo1.getPrecio() + (articulo1.getPrecio() * 0.21)));

        System.out.println(articulo1.getNombre() +"-Precio: "+ articulo1.getPrecio() +"$-IVA: 21%-PVP: "+ articulo1.getPrecioiva() +"$");
    }
}
