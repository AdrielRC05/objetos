package arrayList_HashMap;

import java.util.ArrayList;
import java.util.Arrays;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private ArrayList<Double> notas;

    public Alumno(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
        notas.add(nota1);
        notas.add(nota2);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public double calcMedia() {
        double media=0;
        for (Double nota : notas) {
            media = media + nota;
        }
        media= media/notas.size();
        return media;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", notas=" + notas +
                '}';
    }

    @Override
    public int compareTo(Alumno a) {
        return Double.compare(calcMedia(), a.calcMedia());
    }
}
