package menuOpciones;

import java.util.Scanner;

public class Menu {
    private String titulo;
    private String[] opciones;
    public Menu(String titulo, int numeroOpciones){
        this.titulo= titulo;
        this.opciones= new String[numeroOpciones];
    }

    public void guardarOpcion(String texto, int posicion){
        opciones[posicion-1]=texto;
    }

    public void mostrar(){
        System.out.println(titulo);
        for (int i=0; i< opciones.length; i++){
            System.out.println(i+1+": "+opciones[i]);
        }
    }

    public int leerOpcion(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Elige una opcion");
        int opcion= teclado.nextInt();
        while (opcion>opciones.length){
            System.out.println("Introduce una opcion valida");
            opcion= teclado.nextInt();
        }
        return opcion;
    }
}
