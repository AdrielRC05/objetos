package arrayList_HashMap2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {
        HashMap<String, Integer> ajedrez= new HashMap<>();
        ajedrez.put("dama",9);
        ajedrez.put("torre",5);
        ajedrez.put("alfil",3);
        ajedrez.put("caballo",2);
        ajedrez.put("peon",1);
        ArrayList<Integer> piezasComidas;
        Random aleatorio= new Random();
        Integer contador, i;
        do {
            contador=0;
            i=0;
            piezasComidas= new ArrayList<>();
            piezasComidas.add(aleatorio.nextInt(0,8));
            piezasComidas.add(aleatorio.nextInt(0,3));
            piezasComidas.add(aleatorio.nextInt(0,3));
            piezasComidas.add(aleatorio.nextInt(0,3));
            piezasComidas.add(aleatorio.nextInt(0,2));

            for (HashMap.Entry e:ajedrez.entrySet()){
                contador= contador+(Integer) e.getValue()*piezasComidas.get(i);
                i++;
            }
        } while (contador>15);
        i=0;
        System.out.println(contador);
        System.out.println("Fichas capturadas por el jugador:");
        for (HashMap.Entry e:ajedrez.entrySet()){
            System.out.println(e.getKey()+" ("+piezasComidas.get(i)+")");
            i++;
        }
        System.out.println("Puntos totales: "+contador+" peones.");
    }
}
