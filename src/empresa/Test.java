package empresa;

public class Test {
    public static void main(String[] args) {
        /*Empleado empleado1 = new Empleado("Adriel", "12345678X", "4/12/05", 11, 30000, 9);
        Empleado empleado2 = new Empleado("Ivan", "87654321Z", "15/4/95", 20, 20000, 15);
        Empleado empleado3 = new Empleado("Laureano", "87654321X", "3/5/00", 12, 40000, 9);
        Empresa empresa1 = new Empresa("Empresa1");
        System.out.println(empresa1.empleadoNuevo(empleado1));
        System.out.println(empresa1.empleadoNuevo(empleado2));
        System.out.println(empresa1.empleadoNuevo(empleado3));
        System.out.println(empresa1.numeroEmpleadosEmpresa());
        empresa1.datosEmpresa();
        empresa1.compararSalario(20000);
        System.out.println();
        System.out.println(empresa1.salarioMaximo());
        empresa1.infoSalarios();
        empresa1.incrementoSalario(5, 9);
        empresa1.infoDepartamento(9);
        if (empresa1.borrarEmpleadoPorDni("87654321Z")){
            empresa1.datosEmpresa();
        }*/
        Cliente cliente1 = new Cliente("Adriel", "12345678X", "4/12/05", 11);
        Cliente cliente2 = new Cliente("Ivan", "12345678X", "10/5/95", 22);
        CuentaBancaria cuenta1=new CuentaBancaria(cliente1, 1, 50000);
        CuentaBancaria cuenta2=new CuentaBancaria(cliente2, 2, 55000);
        cuenta1.meterDinero(10000);
        System.out.println(cuenta1.getSaldo());
        cuenta1.retirarDinero(10000);
        System.out.println(cuenta1.getSaldo());
        cuenta1.mostrarInfoCuenta();
        Banco banco1= new Banco("Banco Nuevo");
        banco1.abrirCuenta(cliente1, cuenta1.getSaldo());
        banco1.abrirCuenta(cliente2, cuenta2.getSaldo());
        banco1.infoCuentasBanco();
        banco1.cuentasMayorSaldo();
        System.out.println(banco1.saldoTotalBanco());
        System.out.println(banco1.saldoMedioBanco());
        banco1.cuentasMenorSaldo();
        banco1.borrarCliente("12345678X");
        System.out.println("Borrados");
        banco1.infoCuentasBanco();
    }
}
