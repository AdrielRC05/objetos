package empresa;

public class Empresa {
    private String nombre;
    private Empleado empleados[];
    private final int MAXMPLEADOS = 1000;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new Empleado[MAXMPLEADOS];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean empleadoNuevo(Empleado empleadoN) {
        int pos = 0;
        while (pos<empleados.length && empleados[pos]!=null){
            pos++;
        }
        if(pos<empleados.length){
            empleados[pos] = empleadoN;
            return true;
        }else {
            return false;
        }
    }

    public int numeroEmpleadosEmpresa() {
        int contadorTrabajadores=0;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i]!=null){
                contadorTrabajadores++;
            }
        }
        return contadorTrabajadores;
    }

    public void datosEmpresa() {
        System.out.println(this.nombre);
        for (int i=0; i<empleados.length; i++){
            if (empleados[i]!=null){
                System.out.println(empleados[i]);
                System.out.println();
            }
        }
    }

    public void compararSalario(double salario) {
        for (int i=0; i<empleados.length; i++){
            if (empleados[i]!=null){
                if (empleados[i].getSalario()>salario){
                    System.out.println(empleados[i]);
                }
            }
        }
    }

    public void infoSalarios() {
        int salarioMax=0, salarioMin=Integer.MAX_VALUE, salarioMedio=0, contador=0;

        for (Empleado e:empleados ){
            if (e!=null){
                if (e.getSalario() > salarioMax){
                    salarioMax=e.getSalario();
                }
                if (e.getSalario() < salarioMin){
                    salarioMin=e.getSalario();
                }
                salarioMedio=salarioMedio+e.getSalario();
                contador++;
            }
        }
        System.out.println(salarioMax);
        System.out.println(salarioMin);
        System.out.println(salarioMedio/contador);
    }

    public Empleado salarioMaximo() {
        Empleado empleadoRico=null;
        int salarioMax=0;

        for (Empleado e:empleados ){
            if (e!=null){
                if (e.getSalario() > salarioMax){
                    salarioMax=e.getSalario();
                    empleadoRico =e;
                }
            }
        }
        return empleadoRico;
    }

    public Empleado salarioMinimo() {
        Empleado empleadoPobre=null;
        int salarioMin=0;

        for (Empleado e:empleados ){
            if (e!=null){
                if (e.getSalario() > salarioMin){
                    salarioMin=e.getSalario();
                    empleadoPobre =e;
                }
            }
        }
        return empleadoPobre;
    }

    public void incrementoSalario(int num, int dep) {
        int aumento;
        for (Empleado e:empleados ){
            if (e!=null && e.getDepartamento()==dep){
                aumento=(num*e.getSalario())/100;
                e.setSalario(aumento+e.getSalario());
                System.out.println(e.getSalario());
            }
        }
    }

    public void infoDepartamento(int dep) {
        for (Empleado e:empleados ){
            if (e!=null && e.getDepartamento()==dep){
                System.out.println(e);
            }
        }
    }

    public void busquedaEmpleado(String dni) {
        for (int i=0; i<empleados.length; i++){
            if (empleados[i]!=null){
                if (empleados[i].getDni().equals(dni)){
                    System.out.println(empleados[i]);
                }
            }
        }
    }

    public boolean borrarEmpleadoPorDni(String dni) {
        int pos = 0;
        boolean encontrado=false;
        while (pos<empleados.length && !encontrado){
            if (empleados[pos]!=null && empleados[pos].getDni().equals(dni)){
                encontrado=true;
                empleados[pos]=null;
            }
            pos++;
        }
        return encontrado;
    }
}
