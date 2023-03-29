import java.util.ArrayList;

public class CD {
    private ArrayList<Cancion>canciones;
    public CD(){
        canciones = new ArrayList<Cancion>();
    }
    public CD(ArrayList<Cancion>canciones){
        this.canciones = canciones;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    public int numeroCanciones(){
        return canciones.size();
    }
    public Cancion verCancion(int posicion){
        return canciones.get(posicion);
    }
    public void grabaCancion(int posicion, Cancion nuevaCancion){
        canciones.set(posicion, nuevaCancion);
    }
    public void agrega(Cancion cancion){
        canciones.add(cancion);
    }
    public void elimina(int posicion){
        canciones.remove(posicion);
    }
}
