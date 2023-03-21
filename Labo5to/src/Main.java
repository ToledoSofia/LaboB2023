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

        Fecha fecha1 = new Fecha(1,1,2000);
        fecha1.larga();
        fecha1.anterior();
        fecha1.larga();
        fecha1.siguiente();
        fecha1.corta();
        int dias = fecha1.diaMes(2);
        System.out.println(dias);
        Fecha fecha2 = new Fecha(1, 1, 1999);
        fecha1.menorQue(fecha2);
        fecha1.mayorQue(fecha2);

        Libro libro1 =  new Libro("titulo",persona1, "123abc",1400,"Nova", fecha1);
        Libro libro2 = new Libro("titulo2", persona1, fecha2);
        libro1.mostrarInformacion();
        libro1.libroAnterior(libro2);

        Cafetera cafetera1 = new Cafetera();
        cafetera1.llenarCafetera();
        System.out.println("llena: " + cafetera1.getCantActual());
        cafetera1.vaciarCafetera();
        System.out.println("vacia: " + cafetera1.getCantActual());
        cafetera1.agregarCafe(124);
        System.out.println("124:" + cafetera1.getCantActual());
        cafetera1.servirTaza(20);
        System.out.println("taza20: " + cafetera1.getCantActual());
    }
}
