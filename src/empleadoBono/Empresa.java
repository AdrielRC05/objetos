package empleadoBono;

public class Empresa {
    private Empleado[] empleados;

    public Empresa() {
        this.empleados = new Empleado[100];
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void sumarEmpleado(Empleado empleadoNuevo) {
        int pos = 0;
        while (pos < empleados.length && empleados[pos] != null) {
            pos++;
        }
        if (pos < empleados.length) {
            empleados[pos] = empleadoNuevo;
        }
    }

    public void borrarEmpleado(Empleado empleadoActual) {
        int i = 0;
        while (i < empleados.length) {
            if (empleados[i] != null && empleados[i].equals(empleadoActual)) {
                empleados[i] = null;
            }
            i++;
        }
    }

    public void borrarDni(String dni) {
        int i = 0;
        while (i < empleados.length) {
            if (empleados[i] == null) {
                empleados[i] = null;
            }
            i++;
        }
    }

    public void mostrarEmpleado(String dni) {
        boolean encontrado = false;
        int i = 0;
        while (i < empleados.length && ! encontrado) {
            if (empleados[i] != null && dni.equals(empleados[i].getDni())) {
                encontrado = true;
                System.out.println(empleados[i].getNombre());
                System.out.println(empleados[i].getDni());
                System.out.println(empleados[i].getSalarioBase());
                if (empleados[i] instanceof EmpleadoFijo) {
                    System.out.println("Empleado fijo");
                } else if (empleados[i] instanceof EmpleadoPorHora) {
                    System.out.println("Empleado por horas");
                } else {
                    System.out.println("Empleado por comision");
                }
            }
            i++;
        }
    }

    public void mostrarEmpleadosFijos() {
        int i = 0;
        while (i < empleados.length) {
            if (empleados[i] instanceof EmpleadoFijo) {
                System.out.println(empleados[i].getNombre());
                System.out.println(empleados[i].getDni());
                System.out.println(empleados[i].getSalarioBase());
            }
            i++;
        }
    }

    public void mostrarEmpleadosPorHora() {
        int i = 0;
        while (i < empleados.length) {
            if (empleados[i] instanceof EmpleadoPorHora) {
                System.out.println(empleados[i].getNombre());
                System.out.println(empleados[i].getDni());
                System.out.println(empleados[i].getSalarioBase());
            }
            i++;
        }
    }

    public void mostrarEmpleadosPorComision() {
        int i = 0;
        while (i < empleados.length) {
            if (empleados[i] instanceof EmpleadoPorComision) {
                System.out.println(empleados[i].getNombre());
                System.out.println(empleados[i].getDni());
                System.out.println(empleados[i].getSalarioBase());
            }
            i++;
        }
    }

    public void mostrarEmpleados() {

        for(Empleado e : empleados) {
            if (e != null) {
                System.out.println(e.getNombre());
                System.out.println(e.getDni());
                System.out.println(e.getSalarioBase());
                if (e instanceof EmpleadoFijo) {
                    System.out.println("Empleado fijo");
                } else if (e instanceof EmpleadoPorHora) {
                    System.out.println("Empleado por horas");
                } else {
                    System.out.println("Empleado por comision");
                }
            }
        }
    }

    public double importeSalariosTotal() {
        int i = 0;
        double salarioTotal = 0;
        while (i < empleados.length) {
            if (empleados[i] != null) {
                salarioTotal = salarioTotal + empleados[i].getSalarioBase();
            }
            i++;
        }
        return salarioTotal;
    }

    public int horasTotales() {
        int horasTotales=0;
        for (Empleado e : empleados){
            if (e instanceof EmpleadoPorHora){
                horasTotales=horasTotales+((EmpleadoPorHora) e).getHorasTrabajadas();
            }
        }
        return horasTotales;
    }

    public int ventasTotales() {
        int ventasTotales=0;
        for (Empleado e : empleados){
            if (e instanceof EmpleadoPorComision){
                ventasTotales=ventasTotales+((EmpleadoPorComision) e).getVentas();
            }
        }
        return ventasTotales;
    }

    public double pagarSalarios() {
        System.out.println("Realizando transferencias para el pago de los " +
        "salarios por un importe de "+importeSalariosTotal()+"€");

        for (Empleado e : empleados){
            if (e instanceof EmpleadoPorComision){
                ((EmpleadoPorComision) e).setVentas(0);
            }
            if (e instanceof EmpleadoPorHora){
                ((EmpleadoPorHora) e).setHorasTrabajadas(0);
            }
        }
        return importeSalariosTotal();
    }
}
