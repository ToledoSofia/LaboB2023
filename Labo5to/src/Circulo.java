import java.util.Scanner;

public class Circulo {
    private int radio;
    public Circulo(){
        this.radio = 2;
    }
    public Circulo (int radio){
        this.radio = radio;
    }
    public int getRadio(){
        return radio;
    }
    public void setRadio(int radio){
        this.radio = radio;
    }

    public double calculoArea(int radio){
        double area = Math.PI * radio*radio;
        return area;
    }
    public double calculoPerimetro(int radio){
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
    public static void main(String[] args) {
        System.out.println("ingrese el radio del numero");
        Scanner numero = new Scanner(System.in);
        int radio = numero.nextInt();

        Circulo c1 = new Circulo(radio);
        double area = c1.calculoArea(c1.getRadio());
        System.out.println("area del circulo: " + area);

        double perimetro = c1.calculoPerimetro(c1.getRadio());
        System.out.println("perimetro del circulo: " + perimetro);
    }
}


