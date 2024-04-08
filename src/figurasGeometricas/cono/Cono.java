package figurasGeometricas.cono;

import figurasGeometricas.ejercicio3.Circulo;

public class Cono {
    private int altura;
    private Circulo base;

    public Cono(){
        this.base= new Circulo();
        this.altura= 0;
    }

    public Cono(int altura, Circulo base) {
        this.altura = altura;
        this.base = base;
    }

    public Cono(int altura, int radio){
        this.altura = altura;
        this.base= new Circulo(radio);
    }

    public double areaCono(int altura, int radio){
        return Math.PI*radio*(radio+Math.sqrt(radio^2+altura^2));
    }

    public double volumenCono(int altura, int radio){
        return (Math.PI*(radio*radio)*altura)/3;
    }
}
