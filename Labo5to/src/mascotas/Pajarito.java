package mascotas;

import personas.Dueno;

public class Pajarito extends Mascota{
    private int alegria;
    private boolean cantor;
    public Pajarito(){
        super();
        cantor = false;
    }

    public Pajarito(String nombre, Dueno duenio) {
        super(nombre, duenio);
        alegria = 1;
    }
    public Pajarito(String nombre, Dueno duenio, boolean cantor){
        super(nombre, duenio);
        this.cantor = cantor;
        alegria = 1;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }
    @Override
    public void alimentar(){
        alegria ++;
        //System.out.println("alegria +1");
    }
    @Override
    public void saludar(String nombreDuenio) {
        for(int i = 0; i<alegria; i++){
            if(nombreDuenio.equals(getDuenio().getNombre()) && !cantor){
                System.out.print("pio");
            }else if (nombreDuenio.equals(getDuenio().getNombre()) && cantor){
                System.out.print("wawawawawawawa");
            }
        }
        if(alegria>1){
            alegria --;
        }
    }
    @Override
    public void mostrarTipo(){
        System.out.println("Tipo: " + this.getClass().getCanonicalName());
    }
}
