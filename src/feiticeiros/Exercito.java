package feiticeiros;

import java.util.Arrays;
import java.util.Random;

public class Exercito implements Loita{
    private String nome;
    private Guerreiro [] guerreiros;

    public Exercito(String nome) {
        this.nome = nome;
        this.guerreiros= new Guerreiro[10];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Guerreiro[] getGuerreiros() {
        return guerreiros;
    }

    public void setGuerreiros(Guerreiro[] guerreiros) {
        this.guerreiros = guerreiros;
    }

    public void engadirGuerreiro(Guerreiro g) {
        int i=0;
        boolean engadir= false;
        while (i<guerreiros.length && !engadir) {
            if (guerreiros[i]==null){
                guerreiros[i]=g;
                engadir=true;
            }
            i++;
        }
    }

    public void lanzarAtaque(Exercito outroExercito) {
        for (int i=0; i< guerreiros.length; i++){
            if (guerreiros[i]!=null && guerreiros[i].getSaude()>0){
                if (guerreiros[i] instanceof Soldado){
                    for (int j=0; j<outroExercito.guerreiros.length; j++){
                        if (outroExercito.guerreiros[j]!=null && outroExercito.guerreiros[j].getPosicion()==guerreiros[i].getPosicion()){
                            outroExercito.guerreiros[j].setSaude(outroExercito.guerreiros[j].getSaude()-((Soldado) guerreiros[i]).getArma().getDano());
                        }
                    }
                } else {
                    for (int j=0; j<outroExercito.guerreiros.length; j++){
                        if (outroExercito.guerreiros[j]!=null){
                            outroExercito.guerreiros[j].setSaude(outroExercito.guerreiros[j].getSaude()-((Feiticeiro) guerreiros[i]).getPoder());
                        }
                    }
                }
            }
        }
    }

    public void desprazar() {
        Random aleatorio= new Random();

        for (Guerreiro g : guerreiros) {
            if (g!=null && g.getSaude()>0){
                g.setPosicion(aleatorio.nextInt(0, 11));
            }
        }

        for (Guerreiro g : guerreiros){
            if (g!=null && g.getSaude()>0){
                g.setPosicion(aleatorio.nextInt(0, 11));
            }
        }
    }

    public void comparar(Exercito exercito2) {
        int soldadosVivos=0, soldadosMuertos=0, saudeSoldados=0,
        feiticeirosVivos=0, feiticeirosMortos=0, saudeFeiticeiros=0,
                contadorDanoSoldado=0, contadorDanoFeiticeiro=0;
        for (Guerreiro g : guerreiros){
            if (g instanceof Soldado){
                if (g.getSaude()>0){
                    soldadosVivos++;
                    saudeSoldados=saudeSoldados+g.getSaude();
                    contadorDanoSoldado=contadorDanoSoldado+((Soldado) g).getArma().getDano();
                } else {
                    soldadosMuertos++;
                }
            } else {
                if (g instanceof Feiticeiro && g.getSaude()>0){
                    feiticeirosVivos++;
                    saudeFeiticeiros=saudeFeiticeiros+g.getSaude();
                    contadorDanoFeiticeiro=contadorDanoFeiticeiro+((Feiticeiro)g).getPoder();
                } else if (g instanceof Feiticeiro && g.getSaude()<0){
                    feiticeirosMortos++;
                }
            }
        }
        System.out.println("Ejercito 1:");
        System.out.println();
        System.out.println("    Soldados vivos: "+soldadosVivos);
        System.out.println("    Soldados muertos: "+soldadosMuertos);
        System.out.println("    Salud soldados: "+saudeSoldados);
        System.out.println("    Poder ejercito: "+contadorDanoSoldado);
        System.out.println();
        System.out.println("    Feiticeiros vivos: "+feiticeirosVivos);
        System.out.println("    Feiticeiros muertos: "+feiticeirosMortos);
        System.out.println("    Salud feiticeiros: "+saudeFeiticeiros);
        System.out.println("    Poder feiticeiros: "+contadorDanoFeiticeiro);

        soldadosVivos=0; soldadosMuertos=0; saudeSoldados=0;
                feiticeirosVivos=0; feiticeirosMortos=0; saudeFeiticeiros=0;
                contadorDanoSoldado=0; contadorDanoFeiticeiro=0;
        for (Guerreiro g : exercito2.guerreiros){
            if (g instanceof Soldado){
                if (g.getSaude()>0){
                    soldadosVivos++;
                    saudeSoldados=saudeSoldados+g.getSaude();
                    contadorDanoSoldado=contadorDanoSoldado+((Soldado) g).getArma().getDano();
                } else {
                    soldadosMuertos++;
                }
            } else {
                if (g instanceof Feiticeiro && g.getSaude()>0){
                    feiticeirosVivos++;
                    saudeFeiticeiros=saudeFeiticeiros+g.getSaude();
                    contadorDanoFeiticeiro=contadorDanoFeiticeiro+((Feiticeiro)g).getPoder();
                } else if (g instanceof Feiticeiro && g.getSaude()<0){
                    feiticeirosMortos++;
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Ejercito 2:");
        System.out.println();
        System.out.println("    Soldados vivos: "+soldadosVivos);
        System.out.println("    Soldados muertos: "+soldadosMuertos);
        System.out.println("    Salud soldados: "+saudeSoldados);
        System.out.println("    Poder ejercito: "+contadorDanoSoldado);
        System.out.println();
        System.out.println("    Feiticeiros vivos: "+feiticeirosVivos);
        System.out.println("    Feiticeiros muertos: "+feiticeirosMortos);
        System.out.println("    Salud feiticeiros: "+saudeFeiticeiros);
        System.out.println("    Poder feiticeiros: "+contadorDanoFeiticeiro);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Exercito{" +
                "nome='" + nome + '\'' +
                ", guerreiros=" + Arrays.toString(guerreiros) +
                '}'
        ;
    }

    public boolean derrotado(Exercito exercitoSeleccionado) {
        boolean derrotados= true;
        for (Guerreiro g : exercitoSeleccionado.guerreiros){
            if (g != null && g.getSaude() > 0) {
                derrotados = false;
            }
        }
        return derrotados;
    }
}
