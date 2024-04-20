package blackjack;

public enum Valor {
    DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), DIEZ(10), J(10), Q(10), K(10);

    private final int valor;
    Valor(int i) {
        this.valor = i;
    }

    public int getValor() {
        return valor;
    }
}
