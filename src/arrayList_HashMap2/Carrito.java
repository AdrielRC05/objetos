package arrayList_HashMap2;

import java.util.ArrayList;

public class Carrito{
    private ArrayList<Elemento> listaElementos;

    public Carrito() {
        this.listaElementos = new ArrayList<>();
    }

    public ArrayList<Elemento> getListaElementos() {
        return listaElementos;
    }

    public void setListaElementos(ArrayList<Elemento> listaElementos) {
        this.listaElementos = listaElementos;
    }

    public void agregar(Elemento e) {
        listaElementos.add(e);
    }

    public int numeroDeElementos() {
        return listaElementos.size();
    }

    public double importeTotal() {
        double precioTotal=0;
        for (Elemento e: listaElementos){
            precioTotal= precioTotal+e.getPrecio();
        }
        return precioTotal;
    }

    @Override
    public String toString() {
        return listaElementos+"\n";
    }
}
