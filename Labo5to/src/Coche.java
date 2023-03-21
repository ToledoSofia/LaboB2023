public class Coche {
    private String  marca;
    private String modelo;
    private String color;
    private int velocidad;
    public Coche(){
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.velocidad = 0;
    }
    public Coche(String marca, String modelo, String color, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getVelocidad(){
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
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
