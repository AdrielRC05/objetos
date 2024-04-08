package figurasGeometricas.ejercicio2;

public class Triangulo {
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        if (base<=0 || altura<=0){
            System.out.println("El triangulo creado es de 0x0");
        } else {
            System.out.println("El triangulo creado es de "+base+"x"+altura);
        }
    }

    public Triangulo() {
        System.out.println("El triangulo creado es de 0x0");
    }

    public int area() {
        int Area;
        Area=(base*altura)/2;
        System.out.println("El area es de "+Area);
        return Area;
    }

    public void duplicar() {
        base=2*base;
        altura=2*altura;
        System.out.println("El triangulo creado es de "+base+"x"+altura);
    }

    public boolean multiplicar(int p1) {
        boolean mayorque0= true;
        if (p1<=0){
            System.out.println("Parametros no validos");
            mayorque0= false;
        } else {
            base=p1*base;
            altura=p1*altura;
            System.out.println("El cuadrado creado es de "+base+"x"+altura);
        }
        return mayorque0;
    }

    public void sumar(int p1, int p2) {
        if (p1<0){
            p1=0;
        }
        if (p2<0){
            p2=0;
        }
        base=p2+base;
        altura=p1+altura;
        System.out.println("El cuadrado creado es de "+base+"x"+altura);
    }
}
