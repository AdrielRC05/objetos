package feiticeiros;

public class Main {
    public static void main(String[] args) {
        Exercito exercitoNorte = new Exercito("Exercito do Norte");
        Exercito exercitoSur = new Exercito("Exercito de Poñente");

        Arma espada = new Arma("Espada", 10);
        Arma lanza = new Arma("Lanza", 15);
        Arma daga = new Arma("Daga", 5);

        Soldado s1 = new Soldado("Soldado 1", 100, 1, espada);
        Soldado s2 = new Soldado("Soldado 2", 100, 1, lanza);
        Soldado s3 = new Soldado("Soldado 3", 100, 2, daga);
        Soldado s4 = new Soldado("Soldado 4", 100, 1, espada);
        Soldado s5 = new Soldado("Soldado 5", 100, 1, lanza);
        Soldado s6 = new Soldado("Soldado 6", 100, 2, daga);

        Feiticeiro f1 = new Feiticeiro("Feiticeiro 1", 100, 1, 20);
        Feiticeiro f2 = new Feiticeiro("Feiticeiro 2", 100, 2, 25);

        exercitoNorte.engadirGuerreiro(s1);
        exercitoNorte.engadirGuerreiro(s2);
        exercitoNorte.engadirGuerreiro(s3);
        exercitoNorte.engadirGuerreiro(f1);

        exercitoSur.engadirGuerreiro(s4);
        exercitoSur.engadirGuerreiro(s5);
        exercitoSur.engadirGuerreiro(s6);
        exercitoSur.engadirGuerreiro(f2);

        int i=1;
        int contadorBatallas=0;
        while (!exercitoNorte.derrotado(exercitoSur) && !exercitoSur.derrotado(exercitoNorte)){
            if (i%2!=0){
                exercitoNorte.lanzarAtaque(exercitoSur);
            } else {
                exercitoSur.lanzarAtaque(exercitoNorte);
            }
            exercitoNorte.desprazar();
            exercitoSur.desprazar();
            exercitoNorte.comparar(exercitoSur);
            exercitoNorte.derrotado(exercitoSur);
            i++;
            contadorBatallas++;
        }
        if (exercitoNorte.derrotado(exercitoSur)){
            System.out.println("El ejercito del norte ha ganado");
        } else {
            System.out.println("El ejercito del sur ha ganado");
        }
        System.out.println("Numero de batallas: "+contadorBatallas);
    }
}
