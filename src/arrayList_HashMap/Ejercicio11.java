package arrayList_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String usuario;
        int contraseña;
        HashMap<String, Integer> registro= new HashMap<>();
        registro.put("Adriel",1234);
        registro.put("Ivan",4321);
        registro.put("Laureano",2143);
        System.out.println("Escribe un usuario");
        usuario=teclado.nextLine();
        if (!registro.containsKey(usuario)) {
            do {
                System.out.println("El nombre no existe en el Hash map");
                usuario = teclado.nextLine();
            } while (!registro.containsKey(usuario));
        }
        System.out.println("Escribe tu contraseña");
        contraseña= teclado.nextInt();
        if (registro.get(usuario)!=(contraseña)){
            do {
                System.out.println("La contraseña no coincide");
                contraseña= teclado.nextInt();
            } while (registro.get(usuario)!=(contraseña));
            teclado.nextLine();
        }
        System.out.println("Has accedido a la zona restringida");
    }
}
