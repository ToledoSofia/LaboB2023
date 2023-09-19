package objetos;

public class Remera extends Ropa{
    private double espalda;
    private double contorno;
    private double largoTorso;

    public Remera() {
        super();
    }
    public Remera(String marca, boolean estado, double espalda, double contorno, double largoTorso) {
        super(marca, estado);
        this.espalda = espalda;
        this.contorno = contorno;
        this.largoTorso = largoTorso;
    }

    public Remera(String marca, boolean estado) {
        super(marca, estado);
    }

    public double getEspalda() {
        return espalda;
    }

    public void setEspalda(double espalda) {
        this.espalda = espalda;
    }

    public double getContorno() {
        return contorno;
    }

    public void setContorno(double contorno) {
        this.contorno = contorno;
    }

    public double getLargoTorso() {
        return largoTorso;
    }

    public void setLargoTorso(double largoTorso) {
        this.largoTorso = largoTorso;
    }

    @Override
    public String toString() {
        return "Color: " + getColor() + " - Material: " + getMaterial() + " - Marca: " + getMarca() + " - Estado: " + isEstado() +
        "\nEspalda: " + espalda + " - Contorno: " + contorno + " - Largo torso: " + largoTorso;
    }

    @Override
    public boolean prestar() {
        if(!isEstado()){
            System.out.println("El remera no se prestara");
            return false;
        }else{
            System.out.println("El remera se dara prestado");
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
