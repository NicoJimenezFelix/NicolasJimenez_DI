import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Datos de la persona: ");
        String nombre = sc.nextLine();
        int edad = sc.nextInt();
        String sexo = sc.nextLine();
        double peso = sc.nextDouble();
        double altura = sc.nextDouble();
        String dni = sc.nextLine();

        Persona persona1 = new Persona(nombre, dni, sexo, peso, altura, edad);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        persona3.setNombre("Borja");
        persona3.setAltura(1.50);
        persona3.setDni("00000000A");
        persona3.setPeso(56);
        persona3.setEdad(39);

    }
}
