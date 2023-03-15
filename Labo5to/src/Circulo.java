import java.util.Scanner;

public class Circulo {
    private double radio;
    public Circulo(){
        this.radio = 2;
    }
    public Circulo (double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }

    public double calculoArea(){
        return Math.PI * radio*radio;
    }
    public double calculoPerimetro(){
        return 2 * Math.PI * radio;
    }
    public static void main(String[] args) {
        System.out.println("ingrese el radio del numero");
        Scanner numero = new Scanner(System.in);
        double radio = numero.nextInt();

        Circulo c1 = new Circulo(radio);
        double area = c1.calculoArea();
        System.out.println("area del circulo: " + area);

        double perimetro = c1.calculoPerimetro();
        System.out.println("perimetro del circulo: " + perimetro);
    }
}