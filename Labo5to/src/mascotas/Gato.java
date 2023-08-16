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
        //System.out.println("alegria +1");
    }

    @Override
    public void saludar(String nombreDuenio) {
        if(alegria>0){
            for(int i = 0; i<alegria; i++){
                if(nombreDuenio.equals(getDuenio().getNombre())){
                    System.out.print("miau ");
                }else {
                    System.out.print("MIAU! ");
                }
            }
            alegria --;
        }else{
            System.out.println(this.getNombre() +" necesita alimentarse para seguir saludando!!");
        }
    }
    @Override
    public void mostrarTipo(){
        System.out.println("Tipo: " + this.getClass().getCanonicalName());
    }

}
