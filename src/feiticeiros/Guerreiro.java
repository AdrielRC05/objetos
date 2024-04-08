package feiticeiros;

public abstract class Guerreiro {
    private String nome;
    private int saude;
    private int posicion;

    abstract public void atacar(Guerreiro inimigo);

    public Guerreiro(String nome, int saude, int posicion) {
        this.nome = nome;
        this.saude = saude;
        this.posicion = posicion;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Guerreiro [nome=" + nome + ", saude=" + saude + ", posicion=" + posicion + "]";
    }
}
