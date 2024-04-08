package Ejercicio18.parteC;

public class Main {
    public static void main(String[] args) {

        Persona persona1= new Persona("Adriel", "Ruano Campos", "12345678X", 18);
        Persona persona2= new Persona("Ivan", "Baños de Molgas", "87654321X", 70);

        boolean Mayorde65 = false;

        persona1.Mayor65();
        persona2.Mayor65();

        if (persona1.Mayor65()){
            System.out.println("Es mayor de 65 años");
        } else{
            System.out.println("No es mayor de 65 años");
        }

        if (persona2.Mayor65()){
            System.out.println("Es mayor de 65 años");
        } else{
            System.out.println("No es mayor de 65 años");
        }
    }
}
