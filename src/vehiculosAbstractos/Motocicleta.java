package vehiculosAbstractos;

public class Motocicleta extends Vehiculo implements Conducible{

    private int cilindrada;

    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    public void encender() {
        System.out.println("La motocicleta marca "+getMarca()+" y modelo "+getModelo()+" ha sido encendida");
    }

    @Override
    public void conducir() {
        System.out.println("La motocicleta marca "+getMarca()+" y modelo "+getModelo()+" esta siendo conducida");
    }
}
