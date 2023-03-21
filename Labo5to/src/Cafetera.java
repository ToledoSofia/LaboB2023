public class Cafetera {
    private int cantMax;
    private int cantActual;
    public Cafetera(){
        cantMax = 1000;
        cantActual = 0;
    }
    public Cafetera (int cantMax){
        this.cantMax = cantMax;
        cantActual = cantMax;
    }
    public Cafetera (int cantMax, int cantActual){
        this.cantMax = cantMax;
        this.cantActual = cantActual;
        if(cantActual>cantMax){
            cantMax = cantActual;
        }
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }
    public void llenarCafetera(){
        cantActual = cantMax;
    }
    public void servirTaza(int capacidadTaza){
        if(cantActual>=capacidadTaza){
            cantActual -= capacidadTaza;
        }else{
            cantActual = 0;
        }
    }
    public void vaciarCafetera(){
        cantActual = 0;
    }
    public void agregarCafe(int cantidadCafe){
        cantActual += cantidadCafe;
        if(cantActual >cantMax){
            cantActual = cantMax;
        }
    }
}
