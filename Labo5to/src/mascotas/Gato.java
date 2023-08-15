package mascotas;

import personas.Dueno;

public class Gato extends Mascota{
    private int alegria;
    public Gato(){
        super();
    }
    public Gato(String nombre, Dueno duenio) {
        super(nombre, duenio);
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
    }

    @Override
    public void saludar(String nombreDuenio) {
        for(int i = 0; i<alegria; i++){
            if(nombreDuenio.equals(getDuenio().getNombre())){
                System.out.print("miau ");
            }else {
                System.out.print("MIAU! ");
            }
        }
        alegria --;
    }
    @Override
    public void mostrarTipo(){
        System.out.println("Tipo: " + this.getClass().getCanonicalName());
    }

}
