package vehiculosAbstractos;

public class Test {
    public static void main(String[] args) {
        Automovil coche1= new Automovil("Toyota", "YarisGR");
        Motocicleta moto1= new Motocicleta("Honda", "Modelo5");
        coche1.encender();
        coche1.conducir();
        moto1.encender();
        moto1.conducir();
    }
}
