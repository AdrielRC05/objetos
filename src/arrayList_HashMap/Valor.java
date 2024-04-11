package arrayList_HashMap;

public enum Valor {
    AS(11), DOS(0), TRES(10), CUATRO(0), CINCO(0), SEIS(0), SIETE(0), SOTA(2), CABALLO(3), REY(4);
    private final int peso;

    Valor(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

}
