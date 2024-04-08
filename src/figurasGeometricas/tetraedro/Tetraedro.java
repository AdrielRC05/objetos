package figurasGeometricas.tetraedro;

import figurasGeometricas.ejercicio2.Triangulo;

public class Tetraedro {

    private Triangulo base;
    private int altura;

    public Tetraedro(){
        this.base= new Triangulo();
        this.altura= 0;
    }

    public Tetraedro(Triangulo base, int altura) {
        this.base = base;
        this.altura = Math.max(altura, 0);
    }

    public Tetraedro(int alturaBase, int largoBase, int altura){
        this.altura= altura;
        this.base= new Triangulo(alturaBase, largoBase);
    }

    public double areaTetraedro(){
        return Math.sqrt(3)*((3*altura/Math.sqrt(6))*(3*altura/Math.sqrt(6)));
    }

    public int areaBase(){
        return base.area();
    }

    public double volumenPiramide(){
        return Math.sqrt(12)/12*(3*altura/Math.sqrt(6))*(3*altura/Math.sqrt(6))*(3*altura/Math.sqrt(6));
    }
}
