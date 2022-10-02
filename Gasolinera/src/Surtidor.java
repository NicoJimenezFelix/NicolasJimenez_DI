public class Surtidor {

    String tipo;
    int capacidadTotal, capacidadActual;
    Boolean activo = null;

    public Surtidor(int capacidadTotal, String tipo) {
        this.capacidadTotal = capacidadTotal;
        this.tipo = tipo;
        this.activo = true;
        this.capacidadActual = capacidadTotal;
    }

    public Surtidor(String tipo) {
        this.tipo = tipo;
        this.capacidadTotal = 0;
        this.capacidadActual = 0;
        this.activo = false;
    }


    public void rellenarGasolina(int cantidad){
        capacidadActual+=cantidad;
        System.out.println("Has añadido:" + cantidad);
        System.out.println("Total de ahora: " + capacidadActual);
    }

    public void quitarGasolina(int cantidad){
        capacidadTotal-=cantidad;

        System.out.println("Has quitado:" + cantidad);
        System.out.println("El total ahora es:" + capacidadTotal);
    }

    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getactivo() {
        return activo;
    }

    public void setactivo(Boolean funcionandoactivo) {
        this.activo = funcionandoactivo;
    }
}