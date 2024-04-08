package Ejercicio20;

public class Articulo {

    private String nombre;

    private int precio;

    private double precioiva;

    private int restantes;

    private int unidadesCompra;

    private int unidadesAñadidas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getPrecioiva() {
        return precioiva;
    }

    public void setPrecioiva(double precioiva) {
        this.precioiva = precioiva;
    }

    public int getRestantes() {
        return restantes;
    }

    public void setRestantes(int restantes) {
        this.restantes = restantes;
    }

    public int getUnidadesCompra() {
        return unidadesCompra;
    }

    public void setUnidadesCompra(int unidadesCompra) {
        this.unidadesCompra = unidadesCompra;
    }

    public int getUnidadesAñadidas() {
        return unidadesAñadidas;
    }

    public void setUnidadesAñadidas(int unidadesAñadidas) {
        this.unidadesAñadidas = unidadesAñadidas;
    }

    public void imprimir(int precio, int restantes, String nombre, double precioiva) {
        this.precioiva=((this.precio + (this.precio* 0.21)));
        System.out.println(this.nombre +"-Precio: "+ this.precio +"$-IVA: 21%-PVP: "+ this.precioiva +"$-Unidades restantes: "+this.restantes);
    }

    public void getPVP() {
        this.precioiva=((this.precio + (this.precio* 0.21)));
    }

    public void getPVPDescuento() {
        this.precioiva=(this.precio + (this.precio* 0.21));
        this.precioiva=(this.precioiva - (this.precioiva*0.1));
    }

    public void vender() {
        if (this.unidadesCompra>this.restantes){
            System.out.println("Lo siento, no hay ese numero de unidades");
        } else {
            this.restantes=this.restantes-this.unidadesCompra;
            System.out.println("Unidades disponibles restantes: "+ this.restantes);
        }
    }

    public void almacenar() {
        this.restantes=this.restantes+this.unidadesAñadidas;
        System.out.println("Unidades disponibles restantes: "+this.restantes);
    }
}
