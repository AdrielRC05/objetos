package Ejercicio20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        Articulo articulo1= new Articulo();
        int precio = 0, restantes = 0, unidadesCompra=0, unidadesAñadidas=0;
        String nombre = "";
        double precioiva = 0.21;

        System.out.println("Escribe el nombre de un articulo");
        articulo1.setNombre(teclado.nextLine());
        System.out.println("Escribe su precio");
        articulo1.setPrecio(teclado.nextInt());
        System.out.println("Escribe sus unidades restantes");
        articulo1.setRestantes(teclado.nextInt());

        articulo1.setPrecioiva((articulo1.getPrecio() + (articulo1.getPrecio() * 0.21)));
        articulo1.imprimir(precio, restantes, nombre, precioiva);
        articulo1.getPVP();
        articulo1.getPVPDescuento();

        System.out.println("Escribe la cantidad de unidades que quieres comprar");
        articulo1.setUnidadesCompra(teclado.nextInt());
        articulo1.vender();

        System.out.println("Escribe la cantidad de unidades que quieres añadir");
        articulo1.setUnidadesAñadidas(teclado.nextInt());
        articulo1.almacenar();
    }
}
