public class Vehiculo { String tipo;
    int depositoVehiculo;

    public Vehiculo() {
        this.tipo = tipo;
        this.depositoVehiculo = null;
    }
    public void repostarGasolina(Surtidor surtidor, int cantidad){
        if (cantidad > surtidor.getCapacidadActual()){
            System.out.println("Vacio");
        }else{
            depositoVehiculo+= cantidad;
            surtidor.quitarGasolina(cantidad);
        }
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDepositoVehiculo() {
        return depositoVehiculo;
    }

    public void setDepositoVehiculo(int depositoVehiculo) {
        this.depositoVehiculo = depositoVehiculo;
    }
}