import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("ingrese la base del rectangulo");
        Scanner numero = new Scanner(System.in);
        double base = numero.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        double altura = numero.nextDouble();
        Rectangulo r1 = new Rectangulo(base, altura);
        double area = r1.calculoArea();
        double perimetro = r1.calculoPerimetro();
        System.out.println("area del rectangulo: " + area);
        System.out.println("Perimetro del rectangulo: " + perimetro);*/

        Coche coche1 = new Coche();
        coche1.acelerar(5);
        coche1.mostrarVelocidadActual();
        coche1.frenar(2);
        coche1.mostrarVelocidadActual();

        Persona persona1 = new Persona("Sofia", 17, "Argerich 1234");
        Persona persona2 = new Persona();
        persona1.mostrarDatos();
        persona2.mostrarDatos();

    }
}
