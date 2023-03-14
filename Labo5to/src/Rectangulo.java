import java.util.Scanner;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(){
        this.base = 0;
        this.altura = 0;
    }
    public Rectangulo(double h, double b){
        this.base = b;
        this.altura = h;
    }
    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public double calculoArea(double base, double altura){
        return base * altura;
    }
    public double calculoPerimetro (double base, double altura){
        return base*2 + altura*2;
    }

    public static void main(String[] args) {
        System.out.println("ingrese la base del rectangulo");
        Scanner numero = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo();
        double base = numero.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        double altura = numero.nextDouble();
        System.out.println("area del rectangulo: " + );


    }

}
