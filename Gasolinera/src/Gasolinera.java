import java.util.ArrayList;

public class Gasolinera {
    String nombre;
    int ganancias;
    ArrayList surtidoresGasolinera;

    public Gasolinera(String nombre) {
        this.nombre = nombre;
        this.ganancias = 0;
        this.surtidoresGasolinera = new ArrayList<Surtidor>();
    }

    public void nuevoSurtidor(Surtidor surtidor){
        surtidoresGasolinera.add(surtidor);
    }

    public void ganancias(){
        System.out.println("Total de ganancias: " + ganancias);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public ArrayList getSurtidoreGasolineras() {
        return surtidoresGasolinera;
    }

    public void setSurtidoresGasolinera(ArrayList surtidoresGasolinera) {
        this.surtidoresGasolinera = surtidoresGasolinera;
    }
}