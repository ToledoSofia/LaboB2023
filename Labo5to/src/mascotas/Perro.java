package mascotas;

import personas.Dueno;

public class Perro extends Mascota{
    private static int alegria = 1;
    public Perro (){
        super();
    }
    public Perro(String nombre, Dueno duenio){
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
                System.out.print("guau ");
            }else {
                System.out.print("GUAU! ");
            }
        }
        alegria --;
    }
    @Override
    public void mostrarTipo(){
        System.out.println("Tipo: " + this.getClass().getCanonicalName());
    }

}
