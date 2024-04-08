package articulo;

public class Articulo {

    private String nombre;

    private int precio;

    private double precioiva;

    private int restantes;

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
}
