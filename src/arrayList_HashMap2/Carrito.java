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
        boolean existe= false;
        for (Elemento el: listaElementos){
            if (el.getNombre().equals(e.getNombre())){
                el.setCantidad(el.getCantidad()+e.getCantidad());
                existe= true;
            }
        }
        if (!existe){
            listaElementos.add(e);
        }
    }

    public int numeroDeElementos() {
        return listaElementos.size();
    }

    public double importeTotal() {
        double precioTotal=0;
        for (Elemento e: listaElementos){
            precioTotal= precioTotal+(e.getPrecio()*e.getCantidad());
        }
        return precioTotal;
    }

    @Override
    public String toString() {
        StringBuilder uno = new StringBuilder();
        for (Elemento e: listaElementos){
            uno.append(e);
        }
        return uno.toString();
    }
}
