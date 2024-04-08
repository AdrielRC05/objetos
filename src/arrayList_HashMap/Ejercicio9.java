package arrayList_HashMap;

import menuOpciones.Menu;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Discos disco1= new Discos("titulo1", "autor1", 2005, 0);
        ColeccionDiscos nuevaColeccion= new ColeccionDiscos();
        nuevaColeccion.engadirDisco(disco1);
        Menu menuDiscos= new Menu("Coleccion de discos", 5);
        menuDiscos.guardarOpcion("Nuevo Disco",1);
        menuDiscos.guardarOpcion("Mostrar discos",2);
        menuDiscos.guardarOpcion("Borrar disco",3);
        menuDiscos.guardarOpcion("Modificar disco",4);
        menuDiscos.guardarOpcion("Salir",5);
        int opcion;
        do {
            menuDiscos.mostrar();
            switch (opcion=teclado.nextInt()) {
                case 1 -> {
                    añadirDisco(nuevaColeccion);
                }
                case 2 -> {
                    mostrarDisco(menuDiscos, nuevaColeccion);
                }
                case 3 -> {
                    borrarDisco(nuevaColeccion);
                }
                case 4 -> {
                    modificarDisco(disco1, nuevaColeccion);
                }
                case 5 -> System.out.println("Saliendo");
            }
            System.out.println();
        } while (opcion!=5);
    }

    public static void añadirDisco(ColeccionDiscos nuevaColeccion) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce la informacion del nuevo disco");
        Discos discoNuevo = new Discos(teclado.nextLine(), teclado.nextLine(), teclado.nextInt(), teclado.nextInt());
        nuevaColeccion.engadirDisco(discoNuevo);
    }

    public static void borrarDisco(ColeccionDiscos nuevaColeccion) {
        Scanner teclado= new Scanner(System.in);
        teclado.nextLine();
        nuevaColeccion.borrarDisco(teclado.nextInt());
    }

    public static void modificarDisco(Discos disco1, ColeccionDiscos nuevaColeccion) {
        Scanner teclado= new Scanner(System.in);
        teclado.nextLine();
        nuevaColeccion.modificarDisco(disco1);
    }

    public static void mostrarDisco(Menu menuDiscos, ColeccionDiscos nuevaColeccion) {
        Scanner teclado= new Scanner(System.in);
        Menu discosMostrar= new Menu("Mostrar discos", 4);
        discosMostrar.guardarOpcion("Todos",1);
        discosMostrar.guardarOpcion("Por autor",2);
        discosMostrar.guardarOpcion("Por genero",3);
        discosMostrar.guardarOpcion("Volver",4);
        int opcion;
        do {
            discosMostrar.mostrar();
            switch (opcion = teclado.nextInt()) {
                case 1 -> nuevaColeccion.mostrarDiscos();
                case 2 -> {
                    teclado.nextLine();
                    nuevaColeccion.mostrarDiscos(teclado.nextLine());
                }
                case 3 -> nuevaColeccion.mostrarDiscos(teclado.nextInt());
                case 4 -> System.out.println("Volviendo...");
            }
            System.out.println();
        } while (opcion !=4);
        nuevaColeccion.mostrarDiscos();
    }
}
