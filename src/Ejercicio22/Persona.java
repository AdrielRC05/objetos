package Ejercicio22;

public class Persona {
    private String nombre;
    private String apellidos;
    private final String dni;
    private int edad;
    private static final int mayoriaEdad = 18;

    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static boolean validarDNI(Persona persona1) {
        boolean dniComprobar= true;
        if (persona1.dni.matches("[1-9]{8}+[a-z A-Z]")){
            System.out.println("El DNI es valido");
        } else {
            System.out.println("Este DNI no es valido");
            dniComprobar= false;
        }

        if (persona1.edad<mayoriaEdad){
            System.out.println("Es menor de edad");
        }else {
            System.out.println("Es mayorde edad");
        }

        return dniComprobar;
    }
}
