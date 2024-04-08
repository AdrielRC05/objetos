package fraccion;

import java.util.Random;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public float valor() {
        return (float) numerador / denominador;
    }

    public int comparar(Fraccion f) {

        if (this.valor() == f.valor()) {
            return 0;
        } else if (this.valor() > f.valor()) {
            return 1;
        } else {
            return -1;
        }
    }

    public Fraccion multiplicar(Fraccion f) {
        Fraccion resultado;
        resultado= new Fraccion(this.getNumerador()*f.getNumerador(), this.getDenominador()*f.getDenominador());
        return resultado;
    }

    public Fraccion dividir(Fraccion f) {
        Fraccion resultado;
        resultado= new Fraccion(this.getNumerador()*f.getDenominador(), this.getDenominador()*f.getNumerador());
        return resultado;
    }

    public void mostrar() {
        if (denominador == 0) {
            System.out.println("Fraccion: " + numerador + "/" + denominador + " = Infinito");
        } else {
            System.out.println("Fraccion: " + numerador + "/" + denominador + " = " + valor());
        }
    }

    public static int maximoComunDivisor(int a, int b) {
        int temporal;

        while (b!=0){
            temporal=b;
            b=a%b;
            a=temporal;
        }
        return a;
    }

    public static int minimoComunMultiplo(int a, int b) {
        return (a*b)/maximoComunDivisor(a, b);
    }

    public Fraccion sumar(Fraccion f) {
        if (this.getDenominador()==f.getDenominador()){
            return new Fraccion(this.getNumerador()+ f.getNumerador(), getDenominador());
        } else {
            return new Fraccion((this.getNumerador()* f.getDenominador())+(this.getDenominador()* f.getNumerador()), Fraccion.minimoComunMultiplo(this.getDenominador(), f.getDenominador()));
        }
    }

    public Fraccion restar(Fraccion f) {
        if (this.getDenominador()==f.getDenominador()){
            return new Fraccion(this.getNumerador()- f.getNumerador(), getDenominador());
        } else {
            return new Fraccion((this.getNumerador()* f.getDenominador())-(this.getDenominador()* f.getNumerador()), Fraccion.minimoComunMultiplo(this.getDenominador(), f.getDenominador()));
        }
    }
}
