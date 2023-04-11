package vehiculos;

public class Camioneta extends Vehiculo {
    private String patente;
    private double capacidadCarga;
    private double cargaActual;
    public Camioneta(){
        super();
        patente = "";
        capacidadCarga = 50;
        cargaActual = 0;
    }

    public Camioneta(String patente, double capacidadCarga) {
        super();
        this.patente = patente;
        this.capacidadCarga = capacidadCarga;
        cargaActual = 0;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public void agregarCarga(int aumento){
        if(cargaActual+aumento<=capacidadCarga){
            cargaActual += aumento;
        }else{
            System.out.println("-----No se puede agregar esa carga porque excede la capacidad máxima -----");
        }

    }
}
