package arrayList_HashMap;

import java.util.ArrayList;

public class Ejercicio8 {
    public static void main(String[] args) {
        Alumno p1= new Alumno("Primera", 6.5, 7.25);
        Alumno p2= new Alumno("Segunda", 8.5, 9.2);
        Alumno p3= new Alumno("Tercera", 4.75, 5.55);
        Alumno p4= new Alumno("Cuarta", 3.25, 4.3);
        Alumno p5= new Alumno("Quinta", 7.8, 8.75);
        ArrayList<Alumno> alumnos= new ArrayList<>();
        alumnos.add(p1); alumnos.add(p2); alumnos.add(p3);
        alumnos.add(p4); alumnos.add(p5);
        alumnos.sort(Alumno::compareTo);
        for (Alumno a: alumnos){
            System.out.println("Media de "+a.getNombre()+": "+a.calcMedia());
        }
    }
}
