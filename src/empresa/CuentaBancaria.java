package empresa;

public class CuentaBancaria {

    private Cliente titular;

    private int numeroCuenta;

    private double saldo;

    public CuentaBancaria(Cliente titular, int numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void meterDinero(int dinero) {
        if (dinero>0){
            this.saldo=this.saldo+dinero;
        }
    }

    public boolean retirarDinero(int dinero) {
        if (this.saldo==dinero || this.saldo>dinero){
            this.saldo=this.saldo-dinero;
            return true;
        } else {
            return false;
        }
    }

    public void mostrarInfoCuenta() {
        System.out.println("Titular: "+this.titular);
        System.out.println("Numero de cuenta: "+this.numeroCuenta);
        System.out.println("Saldo: "+this.saldo);
    }
}
