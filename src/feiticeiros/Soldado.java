package feiticeiros;

public class Soldado extends Guerreiro{
    private Arma arma;

    public Soldado(String nome, int saude, int posicion, Arma arma) {
        super(nome, saude, posicion);
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }


    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public void atacar(Guerreiro inimigo) {
        if (getPosicion()==inimigo.getPosicion()){
            inimigo.setSaude(inimigo.getSaude()-arma.getDano());
        }
    }

    @Override
    public String toString() {
        return "Soldado{" +
                "arma=" + arma +
                '}'
        ;
    }
}
