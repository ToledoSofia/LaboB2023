package figuras;

public class Circulo extends FiguraGeometrica{
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

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
        Circulo c1 = new Circulo(2);
        System.out.println(c1.calcularArea());
        System.out.println(c1.calcularPerimetro());
    }
    /*
    public double calculoArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    public double calculoPerimetro(){
        return 2 * Math.PI * radio;
    }
    public static void main(String[] args) {
        System.out.println("ingrese el radio del numero");
        Scanner numero = new Scanner(System.in);
        double radio = numero.nextInt();

        figuras.Circulo c1 = new figuras.Circulo(radio);
        double area = c1.calculoArea();
        System.out.println("area del circulo: " + area);

        double perimetro = c1.calculoPerimetro();
        System.out.println("perimetro del circulo: " + perimetro);
    }*/
}