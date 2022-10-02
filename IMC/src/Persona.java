public class Persona{

    String nombre, dni, sexo;

    int edad;
    double peso, altura;

    public Persona() {
    }

    public Persona(String nombre, String dni, String sexo, double peso, double altura, int edad) {
        this.nombre = null;
        this.dni = null;
        this.sexo = null;
        this.peso = 0;
        this.altura = 0;
        this.edad = 0;
    }

    public Persona(String nombre, int edad, String sexo) {
        this.dni = null;
        this.peso = 0;
        this.altura = 0;
    }

    public void calcularIMC(double peso, double altura){

        double IMC = (peso / (Math.pow(altura,2)));
        if (IMC < 20){
            System.out.println("-1");
        } else if (IMC > 19 && IMC < 26){
            System.out.println("0");
        }else {
            System.out.println("1");
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", edad=" + edad +
                '}';
    }
}