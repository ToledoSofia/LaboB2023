package vehiculos;

import enums.Color;

public class Coche extends Vehiculo{
    private int velocidad;
    private String patente;
    private boolean descapotable;
    public Coche(){
        super();
        this.velocidad = 0;
        patente = "";
        descapotable = false;
    }
    public Coche(String marca, String modelo, Color color, int velocidad){
        super(marca,modelo,color);
        this.velocidad = velocidad;
    }
    public Coche(String marca, String modelo, Color color, int velocidad, String patente){
        super(marca,modelo,color);
        this.velocidad = velocidad;
        this.patente = patente;
    }
    public Coche (String patente, boolean descap){
        this.patente = patente;
        this.descapotable = descap;
    }
    public int getVelocidad(){
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public void acelerar(int mas){
        velocidad += mas;
    }
    public void frenar(int menos){
        velocidad -= menos;
        if(velocidad<0){
            velocidad = 0;
        }
    }
    public void mostrarVelocidadActual(){
        System.out.println("Velocidad actual: " + velocidad);
    }
}
