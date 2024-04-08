package empleadoBono;

public class Test {
    public static void main(String[] args) {
        EmpleadoFijo empleado1= new EmpleadoFijo("12345678X", "Adriel", 50, "4/12/05", 20);
        EmpleadoPorHora empleado2= new EmpleadoPorHora("87654321Z", "Ivan", 1500, "10/5/95", 40);
        Empresa empresa1= new Empresa();
        empresa1.sumarEmpleado(empleado1);
        empresa1.sumarEmpleado(empleado2);
        empresa1.mostrarEmpleado("12345678X");
        System.out.println(empresa1.importeSalariosTotal());
        empresa1.mostrarEmpleados();
        empresa1.mostrarEmpleadosPorComision();
        empresa1.pagarSalarios();
    }
}
