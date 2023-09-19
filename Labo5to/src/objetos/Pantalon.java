package objetos;

import enums.Color;

public class Pantalon extends Ropa{
    private double cintura;
    private double cadera;
    private double largo;

    public Pantalon() {
        super();
    }
    public Pantalon(String marca, boolean estado) {
        super(marca, estado);
    }

    public Pantalon(String marca, boolean estado, double cintura, double cadera, double largo) {
        super(marca, estado);
        this.cintura = cintura;
        this.cadera = cadera;
        this.largo = largo;
    }

    public Pantalon(Color color, String material, String marca, boolean estado) {
        super(color, material, marca, estado);
    }

    public double getCintura() {
        return cintura;
    }

    public void setCintura(double cintura) {
        this.cintura = cintura;
    }

    public double getCadera() {
        return cadera;
    }

    public void setCadera(double cadera) {
        this.cadera = cadera;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Color: " + getColor() + " - Material: " + getMaterial() + " - Marca: " + getMarca() + " - Estado: " + isEstado() +
                "\nCintura: " + cintura + " - Cadera: " + cadera + "Largo: " + largo;
    }

    @Override
    public boolean prestar() {
        if(!isEstado()){
            System.out.println("El pantalon NO se prestara");
            return false;
        }else{
            System.out.println("El pantalon se dara prestado");
            return true;
        }
    }

    @Override
    public boolean agregarElemento() {
        if(!isEstado()){
            System.out.println("El artículo ingresado NO puede ingresar al circuito de préstamos");
            return false;
        }else{
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
            return true;
        }
    }
}
