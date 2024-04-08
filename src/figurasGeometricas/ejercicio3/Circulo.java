package figurasGeometricas.ejercicio3;

public class Circulo {
    private int radio;

    public Circulo() {
        this.radio= 0;
    }

    public Circulo(int radio){
        this.radio= radio;
    }

    public void area() {
        double Area;
        Area=(2*Math.PI*(radio*radio));
        System.out.println("El area del circulo es "+Area);
    }

    public void longitud() {
        double Longitud;
        Longitud=(radio*2)*Math.PI;
        System.out.println("La longitud del circulo es "+Longitud);
    }

    public void duplicar() {
        radio=2*radio;
        System.out.println("El radio del circulo es de "+radio);
    }

    public boolean multiplicar(int p1) {
        boolean mayorque0= true;
        if (p1<=0){
            System.out.println("Parametros no validos");
            mayorque0= false;
        } else {
            radio=p1*radio;
            System.out.println("El cuadrado creado es de "+radio);
        }
        return mayorque0;
    }

    public void sumar(int p2) {
        if (p2<0){
            p2=0;
        }
        radio=p2+radio;
        System.out.println("El cuadrado creado es de "+radio);
    }
}
