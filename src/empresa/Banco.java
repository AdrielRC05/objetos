package empresa;

import java.util.Objects;

public class Banco {

    private String nombre;
    private CuentaBancaria[] cuentas;
    private final int MAX_CUENTAS=1000;
    private int cuentasCreadas;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.cuentas = new CuentaBancaria[MAX_CUENTAS];
        this.cuentasCreadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CuentaBancaria[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(CuentaBancaria[] cuentas) {
        this.cuentas = cuentas;
    }

    public boolean abrirCuenta(Cliente cliente, double saldo) {
        int pos=0;
        while (pos<cuentas.length && cuentas[pos]!=null){
            pos++;
        }
        if(pos<cuentas.length){
            cuentasCreadas++;
            cuentas[pos] = new CuentaBancaria(cliente,cuentasCreadas,saldo);
            return true;
        }else {
            return false;
        }
    }

    public boolean cerrarCuenta(int numCuenta) {
        int pos=0;
        boolean cuentaCerrada=false;
        while (pos< cuentas.length){
            if (cuentas[pos]!=null && cuentas[pos].getNumeroCuenta()==numCuenta){
                cuentas[pos]=null;
                cuentaCerrada=true;
            }
            pos++;
        }
        return cuentaCerrada;
    }

    public void infoCuentasBanco() {
        for (int i=0; i<cuentas.length; i++){
            if (cuentas[i]!=null){
                System.out.println(cuentas[i].getTitular());
                System.out.println("Numero de cuenta: "+cuentas[i].getNumeroCuenta());
                System.out.println("Saldo: "+cuentas[i].getSaldo());
            }
        }
    }

    public void infoCuentaEspecifica(int numCuenta) {
        for (int i=0; i<cuentas.length; i++){
            if (numCuenta==cuentas[i].getNumeroCuenta()){
                System.out.println(cuentas[i].getTitular());
                System.out.println("Numero de cuenta: "+cuentas[i].getNumeroCuenta());
                System.out.println("Saldo: "+cuentas[i].getSaldo());
            }
        }
    }

    public void mostrarCuentasCliente(String dni) {
        for (int i=0; i<cuentas.length; i++){
            if (Objects.equals(dni, cuentas[i].getTitular().getDni())){
                System.out.println(cuentas[i].getTitular());
                System.out.println("Numero de cuenta: "+cuentas[i].getNumeroCuenta());
                System.out.println("Saldo: "+cuentas[i].getSaldo());
            }
        }
    }

    public double cuentasMayorSaldo() {
        double saldoMax=0;
        for (int i = 0; i < cuentas.length; i++) {
            CuentaBancaria cuentaBancaria = cuentas[i];
            if (cuentas[i]!=null){
                saldoMax = Math.max(saldoMax, cuentaBancaria.getSaldo());
            }
        }
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i]!=null){
                CuentaBancaria cuenta = cuentas[i];
                if (saldoMax == cuenta.getSaldo()) {
                    System.out.println(cuenta.getTitular());
                    System.out.println(cuenta.getNumeroCuenta());
                    System.out.println(cuenta.getSaldo());
                }
            }
        }
        return saldoMax;
    }

    public double cuentasMenorSaldo() {
        double saldoMin=Integer.MAX_VALUE;
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                CuentaBancaria cuentaBancaria = cuentas[i];
                saldoMin = Math.min(saldoMin, cuentaBancaria.getSaldo());
            }
        }
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                CuentaBancaria cuenta = cuentas[i];
                if (saldoMin == cuenta.getSaldo()) {
                    System.out.println(cuenta.getTitular());
                    System.out.println(cuenta.getNumeroCuenta());
                    System.out.println(cuenta.getSaldo());
                }
            }
        }
        return saldoMin;
    }

    public double saldoTotalBanco() {
        double saldoTotal=0;
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                saldoTotal = saldoTotal + cuentas[i].getSaldo();
            }
        }
        return saldoTotal;
    }

    public double saldoMedioBanco() {
        double saldoMedio;
        int cuentasLlenas=0;
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i]!=null) {
                if (cuentas[i] != null) {
                    cuentasLlenas++;
                }
            }
        }
        saldoMedio=(saldoTotalBanco()/cuentasLlenas);
        return saldoMedio;
    }

    public void clienteSalarioMayor() {
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i]!=null) {
                if (cuentasMayorSaldo() == cuentas[i].getSaldo()) {
                    System.out.println(cuentas[i].getTitular());
                    System.out.println(cuentas[i].getNumeroCuenta());
                    System.out.println(cuentas[i].getSaldo());
                }
            }
        }
    }

    public boolean borrarCliente(String dni) {
        boolean clienteBorrado= false;
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                if (Objects.equals(cuentas[i].getTitular().getDni(), dni)) {
                    cuentas[i] = null;
                    clienteBorrado= true;
                }
            }
        }
        return clienteBorrado;
    }
}
