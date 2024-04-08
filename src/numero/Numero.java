package numero;

import java.util.Random;
import java.util.Scanner;

public class Numero {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }
    public Numero(){
        Random numero= new Random();
        this.valor= numero.nextInt(-10000, 10001);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean esPar(){
        if (this.valor % 2 == 0) return true;
        else return false;
    }

    public boolean esPositivo(){
        return this.valor > 0;
    }

    public boolean esPrimo() {
        int contador;
        boolean esprimo = true;

        contador = this.valor - 1;
        while (esprimo && contador > 1) {
            if (this.valor % contador == 0) {
                esprimo = false;
            }
            contador--;
        }

        return esprimo;
    }

    public boolean esPerfecto() {
        int contSuma=0;

        for (int i=1;i< this.valor; i++){
            if (this.valor%i==0){
                contSuma=contSuma+i;
            }
        }

        return contSuma == this.valor;

    }

    public boolean esAmigo(Numero n) {
        int contSuma=0, contSumaN=0;

        if (this.valor>0){
            for (int i=1;i< this.valor; i++){
                if (this.valor%i==0){
                    contSuma=contSuma+i;
                }
            }
        }

        if (n.valor>0){
            for (int i=1;i< n.valor; i++){
                if (n.valor%i==0){
                    contSumaN=contSumaN+i;
                }
            }
        }

        return contSuma == n.valor && contSumaN == this.valor;

    }

    public void mostrarInfo() {
        if (esPar()){
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }

        if (esPositivo()){
            System.out.println("Es positivo");
        } else {
            System.out.println("No es positivo");
        }

        if (esPrimo()){
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

        if (esPerfecto()){
            System.out.println("Es perfecto");
        } else {
            System.out.println("No es perfecto");
        }
    }


}
