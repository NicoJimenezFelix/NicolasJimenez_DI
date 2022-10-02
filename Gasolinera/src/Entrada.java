public class Entrada {
    public static void main(String[] args) {

        Surtidor surtidor1 = new Surtidor(1000, "Gasoleo A");
        Surtidor surtidor2 = new Surtidor(500, "Gasoleo B");
        Surtidor surtidor3 = new Surtidor(1500,"Gasoleo C");
        Gasolinera gasolinera = new Gasolinera("Gasolinera 1");
        Vehiculo coche = new Vehiculo();

        coche.repostarGasolina(surtidor2, 550);
    }
}