package arrayList_HashMap2;

public class Elemento {

    private String nombre;
    private double precio;
    private int cantidad;
    private double subtotal;

    public Elemento(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal=precio*cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre +
                " PVP: " + precio +
                " Unidades:" + cantidad +
                " Subtotal:" + subtotal +"\n";
    }
}
