package fraccion;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Fraccion fracciones;
        Fraccion fMayor = null;
        Fraccion fMenor = null;
        int contadorFracciones = 0;
        float mayorFraccion = 0;
        float menorFraccion = 1000;
        do {
            fracciones = new Fraccion(aleatorio.nextInt(0, 100), aleatorio.nextInt(0, 100));
            fracciones.mostrar();
            contadorFracciones++;
            if (fracciones.getNumerador() != 0 && fracciones.getDenominador() != 0) {
                if (fracciones.valor() == Math.max(mayorFraccion, fracciones.valor())) {
                    mayorFraccion = fracciones.valor();
                    fMayor = new Fraccion(fracciones.getNumerador(), fracciones.getDenominador());
                }
                if (fracciones.valor() == Math.min(menorFraccion, fracciones.valor())) {
                    menorFraccion = fracciones.valor();
                    fMenor = new Fraccion(fracciones.getNumerador(), fracciones.getDenominador());
                }
            }
        } while (fracciones.valor() != 1);

        System.out.println();
        System.out.println("Se han generado " + contadorFracciones + " fracciones con valor diferente a la unidad");
        System.out.println("La fraccion mayor fue " + fMayor.getNumerador() + "/" + fMayor.getDenominador() + " = " + fMayor.valor());
        System.out.println("La fraccion menor fue " + fMenor.getNumerador() + "/" + fMenor.getDenominador() + " = " + fMenor.valor());

        System.out.println(fMayor.comparar(fMenor));
        System.out.println(fMayor.multiplicar(fMenor).valor());
        System.out.println(fMayor.dividir(fMenor).valor());



        Random fraccionAleatoria;
        Fraccion fraccion1;
        Fraccion fraccion2;
        do {
            fraccionAleatoria = new Random();
            fraccion1 = new Fraccion(fraccionAleatoria.nextInt(0, 11), fraccionAleatoria.nextInt(0, 11));
            fraccion2 = new Fraccion(fraccionAleatoria.nextInt(0, 11), fraccionAleatoria.nextInt(0, 11));
            System.out.println(fraccion1.getNumerador() + "/" + fraccion1.getDenominador() + " = " + fraccion1.valor());
            System.out.println(fraccion2.getNumerador() + "/" + fraccion2.getDenominador() + " = " + fraccion2.valor());

            switch (fraccion1.comparar(fraccion2)) {
                case 0 -> System.out.println("Son equivalentes. FIN");
                case 1 -> System.out.println(fraccion1.getNumerador() + "/" + fraccion1.getDenominador() + " es mayor que " + fraccion2.getNumerador() + "/" + fraccion2.getDenominador());
                case 2 -> System.out.println(fraccion2.getNumerador() + "/" + fraccion2.getDenominador() + " es mayor que " + fraccion1.getNumerador() + "/" + fraccion1.getDenominador());
            }

            if (fraccion1.comparar(fraccion2)!=0){
                System.out.println(fraccion1.getNumerador() + "/" + fraccion1.getDenominador() + " multiplicado entre " + fraccion2.getNumerador() + "/" + fraccion2.getDenominador() + " = " + fraccion1.multiplicar(fraccion2).valor());
                System.out.println(fraccion1.getNumerador() + "/" + fraccion1.getDenominador() + " dividido entre " + fraccion2.getNumerador() + "/" + fraccion2.getDenominador() + " = " + fraccion1.dividir(fraccion2).valor());
            }
            System.out.println();

        } while (fraccion1.comparar(fraccion2)!=0);



        fraccion1 = new Fraccion(fraccionAleatoria.nextInt(0, 11), fraccionAleatoria.nextInt(0, 11));
        fraccion2 = new Fraccion(fraccionAleatoria.nextInt(0, 11), fraccionAleatoria.nextInt(0, 11));

        System.out.println(fraccion1.getNumerador() + "/" + fraccion1.getDenominador());
        System.out.println(fraccion2.getNumerador() + "/" + fraccion2.getDenominador());

        System.out.println(fraccion1.sumar(fraccion2).getNumerador()+"/"+fraccion1.sumar(fraccion2).getDenominador()+" = "+fraccion1.sumar(fraccion2).valor());
        System.out.println(fraccion1.restar(fraccion2).getNumerador()+"/"+fraccion1.restar(fraccion2).getDenominador()+" = "+fraccion1.restar(fraccion2).valor());
    }
}
