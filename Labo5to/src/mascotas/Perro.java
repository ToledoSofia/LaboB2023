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
        //System.out.println("alegria +1");
    }
    @Override
    public void saludar(String nombreDuenio) {
        if(alegria>0){
            for(int i = 0; i<alegria; i++){
                if(nombreDuenio.equals(getDuenio().getNombre())){
                    System.out.print("guau ");
                }else {
                    System.out.print("GUAU! ");
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
