package arrayList_HashMap2;

public class Ejercicio4 {
    public static void main(String[] args) {
        Carrito miCarrito= new Carrito();
        miCarrito.agregar(new Elemento("Tarjeta SD 64Gb",19.95,2));
        miCarrito.agregar(new Elemento("Canon EOS 2000D",449,1));
        System.out.println("Contenido del carrito");
        System.out.println("---------------------");
        System.out.println(miCarrito);
        System.out.print("Hay "+miCarrito.numeroDeElementos());
        System.out.println(" productos en la cesta.");
        System.out.println("El total asciende a "
                + String.format("%.2f",miCarrito.importeTotal())+" euros");

        System.out.println("\nContinua la compra...\n");
        miCarrito.agregar(new Elemento("Samsung Galaxy Tab",199,3));
        miCarrito.agregar(new Elemento("Tarjeta SD 64Gb",19.95,1));
        System.out.println(miCarrito);
        System.out.print("Ahora hay "+miCarrito.numeroDeElementos());
        System.out.println(" productos en la cesta");
        System.out.println("El total asciende a "
                + String.format("%.2f",miCarrito.importeTotal())+" euros");
    }
}
