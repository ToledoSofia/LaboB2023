package figuras;

public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Rectangulo(){
        this.base = 1;
        this.altura = 1;
    }
    public Rectangulo(double b, double h){
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

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return base*2 + altura*2;
    }
/*
    public double calculoArea(){
        return base * altura;
    }
    public double calculoPerimetro (){
        return base*2 + altura*2;
    }*/
}