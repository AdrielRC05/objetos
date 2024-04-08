package figurasGeometricas.ejercicio1;

public class Rectangulo {
    private int largo;
    private int ancho;

    public Rectangulo() {
        System.out.println("El cuadrado creado es de 0x0");
    }

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
        if (largo<=0 || ancho<=0){
            System.out.println("El cuadrado creado es de 0x0");
        } else {

        }
    }


    public boolean esCuadrado() {

        if (largo!=ancho){
            return false;
        }else{
        return true;
        }
    }

    public int area() {
        return largo*ancho;
    }

    public int perimetro() {
        return (largo*2)+(ancho*2);
    }

    public void duplicar() {
        ancho=2*ancho;
        largo=2*largo;
        System.out.println("El cuadrado creado es de "+largo+"x"+ancho);
    }

    public boolean multiplicar(int p1) {
        boolean mayorque0= true;
        if (p1<=0){
            System.out.println("Parametros no validos");
            mayorque0= false;
        } else {
            ancho=p1*ancho;
            largo=p1*largo;
            System.out.println("El cuadrado creado es de "+largo+"x"+ancho);
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
        ancho=p2+ancho;
        largo=p1+largo;
        System.out.println("El cuadrado creado es de "+largo+"x"+ancho);
    }
}
