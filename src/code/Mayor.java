package code;

public class Mayor {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 2, 10, 5};
        int maximo = buscarMaximo(numeros);
        System.out.println("El número máximo es: " + maximo);
    }
    private static int buscarMaximo(int[] arreglo) {
        int maximo = arreglo[0];
        for (int i = 1; i <= arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        return maximo;
    }

}
