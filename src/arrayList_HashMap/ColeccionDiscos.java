package arrayList_HashMap;

import java.util.*;

public class ColeccionDiscos{
    private ArrayList<Discos> discos;
    private int contador;

    public ColeccionDiscos() {
        this.discos = new ArrayList<>();
        this.contador=0;
    }

    public ArrayList<Discos> getDiscos() {
        return discos;
    }

    public void setDiscos(ArrayList<Discos> discos) {
        this.discos = discos;
    }

    public void engadirDisco(Discos d) {
        contador++;
        discos.add(discos.size(), d);
        d.setCodigo(contador);
    }

    public void borrarDisco(int codigo) {
        discos.removeIf(d -> d.getCodigo() == codigo);
        discos.sort(Discos::compareTo);
    }

    public void modificarDisco(Discos nuevoDisco) {
        int indice= discos.indexOf(nuevoDisco);
        if (indice!=1){
            discos.set(indice, nuevoDisco);
            System.out.println("Disco con codigo "+nuevoDisco.getCodigo()+" modificado correctamente");
        } else {
            System.out.println("No se encontro ningun disco conb el codigo "+nuevoDisco.getCodigo());
        }
    }

    public void mostrarDiscos() {
        for (Discos d: discos){
            System.out.println(d.toString());
        }
    }

    public void mostrarDiscos(String autor) {
        for (Discos d: discos){
            if (d.getAutor().equals(autor)){
                System.out.println(d);
            }
        }
    }

    public void mostrarDiscos(int genero) {
        for (Discos d: discos){
            if (d.getGenero()==genero){
                System.out.println(d);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColeccionDiscos that = (ColeccionDiscos) o;
        return Objects.equals(discos, that.discos);
    }

}
