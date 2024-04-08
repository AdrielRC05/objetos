package menuOpciones;

public class Main1 {
    public static void main(String[] args) {
        int opcion1, opcion2, opcion3;


        Menu menuTraductor = new Menu("Traductor", 3);
        menuTraductor.guardarOpcion("Traducir saludo", 1);
        menuTraductor.guardarOpcion("Traducir despedida", 2);
        menuTraductor.guardarOpcion("Saludo", 3);

        do {
            menuTraductor.mostrar();
            opcion1 = menuTraductor.leerOpcion();
            switch (opcion1) {
                case 1: {
                    Menu traductorSaludos = new Menu("Traductor de saludos", 3);
                    traductorSaludos.guardarOpcion("Frances", 1);
                    traductorSaludos.guardarOpcion("Ingles", 2);
                    traductorSaludos.guardarOpcion("Volver", 3);
                    traductorSaludos.mostrar();
                    opcion2 = traductorSaludos.leerOpcion();
                    switch (opcion2) {
                        case 1 -> System.out.println("Bonjour");
                        case 2 -> System.out.println("Good morning");
                        case 3 -> menuTraductor.mostrar();
                    }
                }
                case 2: {
                    Menu traductorDespedidas = new Menu("Traductor de despedidas", 3);
                    traductorDespedidas.guardarOpcion("Aleman", 1);
                    traductorDespedidas.guardarOpcion("Italiano", 2);
                    traductorDespedidas.guardarOpcion("Volver", 3);
                    traductorDespedidas.mostrar();
                    opcion3 = traductorDespedidas.leerOpcion();
                    switch (opcion3) {
                        case 1 -> System.out.println("Auf Wiedersehen");
                        case 2 -> System.out.println("Arrivederci");
                        case 3 -> menuTraductor.mostrar();
                    }
                }
                case 3: {
                    System.out.println("Saliendo...");
                }
            }
        }while (opcion1!=3);
    }
}
