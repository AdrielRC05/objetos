package feiticeiros;

public class Feiticeiro extends Guerreiro{
    private int poder;

    public Feiticeiro(String nome, int saude, int posicion, int poder) {
        super(nome, saude, posicion);
        this.poder = poder;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public void atacar(Guerreiro inimigo) {
        inimigo.setSaude(inimigo.getSaude()-this.poder);
    }

    @Override
    public String toString() {
        return "Feiticeiro{" +
                "poder=" + poder +
                '}';
    }
}
