package vehiculosAbstractos;

public class Automovil extends Vehiculo implements Conducible{

    private int puertas;

    public Automovil(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void encender() {
        System.out.println("El automovil marca "+getMarca()+" y modelo "+getModelo()+" ha sido encendido");
    }

    @Override
    public void conducir() {
        System.out.println("El automovil marca "+getMarca()+" y modelo "+getModelo()+" esta siendo conducido");
    }
}
